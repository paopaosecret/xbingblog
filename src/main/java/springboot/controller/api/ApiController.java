package springboot.controller.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.ResultVo.ResponseVo;
import springboot.controller.AbstractController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhaobing04 on 2020/9/17.
 */
@Controller
@RequestMapping("/api")
public class ApiController extends AbstractController{

    @GetMapping(value = "info")
    @ResponseBody
    public ResponseVo info(HttpServletRequest request) {
        ResponseVo vo = new ResponseVo();
        vo.setData("hello word!");
        vo.setCode("200");
        vo.setMsg("success");
        return vo;
    }
}
