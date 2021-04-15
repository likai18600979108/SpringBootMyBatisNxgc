package com.webapp.model;

public class ArtificerSellerUDict {
    private String id;

    private String title;

    private String content;

    private Integer status;

    private Integer type;

    private Integer score;

    private String redict;

    private Integer ord;

    private Integer taskType;

    private String shareCopy;

    private String imgUrl;

    private Integer wechatStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRedict() {
        return redict;
    }

    public void setRedict(String redict) {
        this.redict = redict == null ? null : redict.trim();
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getShareCopy() {
        return shareCopy;
    }

    public void setShareCopy(String shareCopy) {
        this.shareCopy = shareCopy == null ? null : shareCopy.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getWechatStatus() {
        return wechatStatus;
    }

    public void setWechatStatus(Integer wechatStatus) {
        this.wechatStatus = wechatStatus;
    }
}