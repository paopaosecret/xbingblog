package springboot.config;

import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by zhaobing04 on 2019/12/3.
 */
@Configuration
@Slf4j
@AutoConfigureAfter(RedisProperties.class)
@PropertySource("classpath:application-redis.properties")
public class RedisConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisConfig.class);

    private final RedisProperties redisProperties;

    @Autowired
    public RedisConfig(RedisProperties redisProperties) {
        LOGGER.info("RedisConfig开始初始化");
        this.redisProperties = redisProperties;
    }

    @Bean
    public JedisPool redisPoolFactory(){
        LOGGER.info("JedisPool开始注入");
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        int port = redisProperties.getPort();
        String host = redisProperties.getHost();
        int timeout = redisProperties.getTimeout();
        String password = redisProperties.getPassword();
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,host,port,timeout,password);
        LOGGER.info("JedisPool注入成功！");
        LOGGER.info("redis地址：" + host + ", port:" + port + ", pwd :" + password);
        return  jedisPool;
    }

}
