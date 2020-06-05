package com.djyjw.pojo;

import java.util.Date;

public class WorkInfo {
    private Integer id;

    private Integer wid;

    private Byte finished;

    private String preFinishTime;

    private Integer status;

    private Date createTime;

    private Boolean archived;

    private Date archivedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Byte getFinished() {
        return finished;
    }

    public void setFinished(Byte finished) {
        this.finished = finished;
    }

    public String getPreFinishTime() {
        return preFinishTime;
    }

    public void setPreFinishTime(String preFinishTime) {
        this.preFinishTime = preFinishTime == null ? null : preFinishTime.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Date getArchivedTime() {
        return archivedTime;
    }

    public void setArchivedTime(Date archivedTime) {
        this.archivedTime = archivedTime;
    }
}