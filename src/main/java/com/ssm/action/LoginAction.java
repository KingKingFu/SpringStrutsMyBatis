package com.ssm.action;

/**
 * Created by lanling on 2017/1/3.
 */
public class LoginAction {

    private String uname;

    private String upass;

    public String login() {
        return "input";
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
