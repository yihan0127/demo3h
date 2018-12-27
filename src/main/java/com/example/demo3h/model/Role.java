<<<<<<< HEAD
package model;

public class Role {
    private Integer roleid;

    private String rolename;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

=======
package com.example.demo3h.model;

public class Role {
    private int roleid;
    private int uid;
    private String rolename;

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

>>>>>>> origin/master
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
<<<<<<< HEAD
        this.rolename = rolename == null ? null : rolename.trim();
    }
}
=======
        this.rolename = rolename;
    }
}
>>>>>>> origin/master
