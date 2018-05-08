package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class AppUser implements Serializable {
    /**   id **/
    private Integer id;

    /** 1前台客户，2后台用户  type **/
    private Byte type;

    /** 1启用，2停用  state **/
    private Byte state;

    /** 姓名  name **/
    private String name;

    /** 手机号码  phone **/
    private String phone;

    /**   token **/
    private String token;

    /** 密码  pwd **/
    private String pwd;

    /** 创建时间  create_time **/
    private Date createTime;

    /** 最后登录时间  last_login_time **/
    private Date lastLoginTime;

    /** 记录登录错误次数  errnum **/
    private Integer errnum;

    /** 登录错误时间  errtime **/
    private Date errtime;

    /**   tableName: app_user   **/
    private static final long serialVersionUID = 1L;

    /**     id   **/
    public Integer getId() {
        return id;
    }

    /**     id   **/
    public void setId(Integer id) {
        this.id = id;
    }

    /**   1前台客户，2后台用户  type   **/
    public Byte getType() {
        return type;
    }

    /**   1前台客户，2后台用户  type   **/
    public void setType(Byte type) {
        this.type = type;
    }

    /**   1启用，2停用  state   **/
    public Byte getState() {
        return state;
    }

    /**   1启用，2停用  state   **/
    public void setState(Byte state) {
        this.state = state;
    }

    /**   姓名  name   **/
    public String getName() {
        return name;
    }

    /**   姓名  name   **/
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**   手机号码  phone   **/
    public String getPhone() {
        return phone;
    }

    /**   手机号码  phone   **/
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**     token   **/
    public String getToken() {
        return token;
    }

    /**     token   **/
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**   密码  pwd   **/
    public String getPwd() {
        return pwd;
    }

    /**   密码  pwd   **/
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**   创建时间  create_time   **/
    public Date getCreateTime() {
        return createTime;
    }

    /**   创建时间  create_time   **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**   最后登录时间  last_login_time   **/
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**   最后登录时间  last_login_time   **/
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**   记录登录错误次数  errnum   **/
    public Integer getErrnum() {
        return errnum;
    }

    /**   记录登录错误次数  errnum   **/
    public void setErrnum(Integer errnum) {
        this.errnum = errnum;
    }

    /**   登录错误时间  errtime   **/
    public Date getErrtime() {
        return errtime;
    }

    /**   登录错误时间  errtime   **/
    public void setErrtime(Date errtime) {
        this.errtime = errtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", token=").append(token);
        sb.append(", pwd=").append(pwd);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", errnum=").append(errnum);
        sb.append(", errtime=").append(errtime);
        sb.append("]");
        return sb.toString();
    }
}