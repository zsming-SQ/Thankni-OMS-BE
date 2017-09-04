package com.ldsmsoft.framework.dao.mybatis.model;

import java.util.Date;

public class UserFavorableBean {
    private Long id;

    private Long fkUserId;

    private Long fkFavorableId;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkUserId() {
        return fkUserId;
    }

    public void setFkUserId(Long fkUserId) {
        this.fkUserId = fkUserId;
    }

    public Long getFkFavorableId() {
        return fkFavorableId;
    }

    public void setFkFavorableId(Long fkFavorableId) {
        this.fkFavorableId = fkFavorableId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}