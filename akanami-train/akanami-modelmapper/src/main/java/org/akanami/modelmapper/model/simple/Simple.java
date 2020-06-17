package org.akanami.modelmapper.model.simple;

import java.util.Date;

public class Simple {
    private Integer id;
    private String name;
    private String password;
    private Date birth;

    public Simple() {

    }

    public Simple(Integer aId, String aName, String aPassword, Date aBirth) {
        this.id = aId;
        this.name =  aName;
        this.password = aPassword;
        this.birth = aBirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
