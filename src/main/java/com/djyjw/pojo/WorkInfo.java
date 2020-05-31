package com.djyjw.pojo;

import java.util.Date;

public class WorkInfo {
    private Integer id;

    private Integer wid;

    private Integer finished;

    private Integer status;

    private Integer archived;

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

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getArchived() {
        return archived;
    }

    public void setArchived(Integer archived) {
        this.archived = archived;
    }

    public Date getArchivedTime() {
        return archivedTime;
    }

    public void setArchivedTime(Date archivedTime) {
        this.archivedTime = archivedTime;
    }
}