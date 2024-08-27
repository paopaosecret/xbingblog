//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package springboot.controller.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.ResultVo.ResponseVo;
import springboot.controller.AbstractController;

@Controller
@RequestMapping({"/api"})
public class ApiController extends AbstractController {
    public ApiController() {
    }

    @GetMapping({"info"})
    @ResponseBody
    public ResponseVo info(HttpServletRequest request) {
        ResponseVo vo = new ResponseVo();
        vo.setData("hello get!");
        vo.setCode("200");
        vo.setMsg("success");
        return vo;
    }

    @GetMapping({"getInfo"})
    @ResponseBody
    public ResponseVo getInfo(@RequestParam String username, @RequestParam String password, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("userName:" + username + ", password:" + password);
        ResponseVo vo = new ResponseVo();
        vo.setData("hello post!");
        vo.setCode("200");
        vo.setMsg("success");
        return vo;
    }

    @PostMapping({"postInfo"})
    @ResponseBody
    public ResponseVo postInfo(@RequestParam String username, @RequestParam String password, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("userName:" + username + ", password:" + password);
        ResponseVo vo = new ResponseVo();
        vo.setData("hello post!");
        vo.setCode("200");
        vo.setMsg("success");
        return vo;
    }
}
