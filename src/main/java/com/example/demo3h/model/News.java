package model;

import java.util.Date;

public class News {
    private Integer newsid;

    private Integer receiveuid;

    private Integer senduid;

    private String content;

    private Integer status;

    private Date createtime;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getReceiveuid() {
        return receiveuid;
    }

    public void setReceiveuid(Integer receiveuid) {
        this.receiveuid = receiveuid;
    }

    public Integer getSenduid() {
        return senduid;
    }

    public void setSenduid(Integer senduid) {
        this.senduid = senduid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}