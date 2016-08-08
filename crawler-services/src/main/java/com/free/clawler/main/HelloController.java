package com.free.clawler.main;

import com.free.clawler.user.api.v1.IUserApi;
import com.free.user.model.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@Controller
public class HelloController {
    @Autowired
    private IUserApi userApi;
    @RequestMapping("/index")
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        return "index";
    }

    @RequestMapping("/index2")
    @ResponseBody
    public void helloRW(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        PrintWriter pw = response.getWriter();
        pw.print("test");
        pw.close();
    }

    @RequestMapping("/index3")
    @ResponseBody
    public String hello3(HttpServletRequest request, HttpServletResponse response) throws InterruptedException {
        BaseUser baseUser=new BaseUser();
        baseUser.setUserName("e24r343");
        baseUser.setPassword("w32132");
        baseUser.setCreateTime(new Date());
        baseUser.setEmail("12@.cc");
        userApi.addUser(baseUser);
        return "2343243";
    }
}
