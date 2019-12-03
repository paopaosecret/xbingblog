package springboot.ResultVo;

import java.io.Serializable;

/**
 * Created by zhaobing04 on 2019/4/4.
 */
public class ResponseVo implements Serializable {
    String msg;
    String code;
    String data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
