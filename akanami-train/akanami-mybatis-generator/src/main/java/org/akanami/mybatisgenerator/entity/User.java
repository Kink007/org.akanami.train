package org.akanami.mybatisgenerator.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String loginname;

    private String name;

    private String password;

    private String password2;

    private Boolean locked;

    private String lastloginip;

    private Date lastlogintime;

    public User(Integer id, String loginname, String name, String password, String password2, Boolean locked, String lastloginip, Date lastlogintime) {
        this.id = id;
        this.loginname = loginname;
        this.name = name;
        this.password = password;
        this.password2 = password2;
        this.locked = locked;
        this.lastloginip = lastloginip;
        this.lastlogintime = lastlogintime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2 == null ? null : password2.trim();
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }
}