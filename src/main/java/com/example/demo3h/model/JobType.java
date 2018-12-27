package model;

public class JobType {
    private Integer jtid;

    private String jtname;

    public Integer getJtid() {
        return jtid;
    }

    public void setJtid(Integer jtid) {
        this.jtid = jtid;
    }

    public String getJtname() {
        return jtname;
    }

    public void setJtname(String jtname) {
        this.jtname = jtname == null ? null : jtname.trim();
    }
}