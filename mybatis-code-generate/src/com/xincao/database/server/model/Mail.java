package com.xincao.database.server.model;

import java.util.Date;

public class Mail {
    private Integer id;

    private Integer mailBoxId;

    private Integer senderId;

    private String content;

    private Date createAt;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMailBoxId() {
        return mailBoxId;
    }

    public void setMailBoxId(Integer mailBoxId) {
        this.mailBoxId = mailBoxId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}