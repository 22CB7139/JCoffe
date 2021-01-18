package com.sorry.jcoffe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ShellController {
    @RequestMapping("/shell")
    public void echo(HttpServletRequest req, HttpServletResponse rsp){
        try {

            //s1.密钥交互
            //s2.执行defineclass
            //s3.回显结果

        }catch (Exception e){
            //nothing else
        }

    }

}
