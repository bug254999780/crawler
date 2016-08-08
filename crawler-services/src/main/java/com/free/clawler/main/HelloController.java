package com.free.clawler.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
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
        return "2343243";
    }
}
