package com.example.demo.config;

import org.apache.shiro.authc.AuthenticationToken;

public class UserAuthcToken implements AuthenticationToken {
    private static final long serialVersionUID = 7537600664251928817L;


    private String userName;
    private String userPwd;
    private LoginWay loginWay;

    public UserAuthcToken(String userName, String userPwd,
                          LoginWay loginWay) {
        super();
        this.userName = userName;
        this.userPwd = userPwd;
        this.loginWay = loginWay;
    }

    @Override
    public Object getPrincipal() {
        return userName;
    }

    @Override
    public Object getCredentials() {
        return userPwd;
    }

    public LoginWay getLoginWay() {
        return loginWay;
    }

    public enum LoginWay {
        APP_TOKEN("APP_TOKEN","手机端Token登录"),APP_ACCOUNT("APP_ACCOUNT","手机端账号登录"),
        APPC_OPENID("APPC_OPENID","微信端OpenId登录"),PHONE_LOGIN("PHONE_LOGIN","手机号登录");

        // 成员变量
        private String statusValue;
        private String statusName;

        // 构造方法
        private LoginWay(String statusValue, String statusName) {
            this.statusValue = statusValue;
            this.statusName = statusName;
        }

        // 普通方法
        public static String getName(String statusValue) {
            for (LoginWay as : LoginWay.values()) {
                if (statusValue.equals(as.getStatusValue())) {
                    return as.statusName;
                }
            }
            return "";
        }

        public String getStatusValue() {
            return statusValue;
        }

        public void setStatusValue(String statusValue) {
            this.statusValue = statusValue;
        }

        public String getStatusName() {
            return statusName;
        }

        public void setStatusName(String statusName) {
            this.statusName = statusName;
        }
    }
}
