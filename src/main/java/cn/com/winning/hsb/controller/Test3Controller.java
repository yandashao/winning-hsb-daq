package cn.com.winning.hsb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 39627 on 2019/5/13.
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class Test3Controller {

    private String name;

    private String age;

    private String addr;

    @RequestMapping("/test3")
    @ResponseBody
    public String test222() {
        return "name:" + name + ",addr:" + addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
