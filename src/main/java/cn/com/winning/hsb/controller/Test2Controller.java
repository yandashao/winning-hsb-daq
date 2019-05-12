package cn.com.winning.hsb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 39627 on 2019/5/13.
 */
@Controller
public class Test2Controller {

    @Value("${name}")
    private String name;

    @Value(("${person.addr}"))
    private String addr;

    @RequestMapping("/test2")
    @ResponseBody
    public String test222() {
        return "name:" + name + ",addr:" + addr;
    }
}
