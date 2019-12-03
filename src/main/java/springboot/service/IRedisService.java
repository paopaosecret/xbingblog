package springboot.service;

/**
 * Created by zhaobing04 on 2018/7/19.
 */
public interface IRedisService {
    /**
     * set存数据
     * @param key
     * @param value
     * @return
     */
    String set(String key, String value);

    /**
     * get获取数据
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置有效天数
     * @param key
     * @param seconds
     * @return
     */
    long expire(final String key, int seconds);

    /**
     * 移除数据
     * @param key
     * @return
     */
    long del(String key);
}
