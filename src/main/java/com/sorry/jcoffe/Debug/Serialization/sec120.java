package com.sorry.jcoffe.Debug.Serialization;

import java.io.IOException;
import java.io.Serializable;

public class sec120 implements Serializable {
    private static final long serialVersionUID = -5809452578272945389L;
    private String Location;
    private String[] members;

    public sec120(){
        //todo nothingj
        try {
            Runtime.getRuntime().exec("open /System/Applications/Calculator.app");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }
}
