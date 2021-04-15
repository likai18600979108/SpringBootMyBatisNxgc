package com.webapp.model;

import java.math.BigDecimal;
import java.util.Date;

public class ArtificerInfo {
    private String id;

    private String userId;

    private String name;

    private String cardId;

    private String education;

    private String certificate;

    private String workTime;

    private String workType;

    private String brand;

    private String companys;

    private String companyType;

    private String companyAddr;

    private Integer status;

    private Integer pubStatus;

    private String dinatePosition;

    private String coordinates;

    private BigDecimal rentAmount;

    private Integer pushMsgFlag;

    private Integer pushMsgRing;

    private String certificatePhoto;

    private String frontPhoto;

    private String backPhoto;

    private String auditData;

    private String appVersion;

    private String device;

    private Integer isUhoerAudit;

    private String artlevel;

    private String startWorkTime;

    private String school;

    private String gender;

    private String weixin;

    private String qq;

    private String description;

    private Integer isAutoAudit;

    private Integer isShelf;

    private Date shelfTime;

    private Date firstShelfTime;

    private Double hourPrice;

    private String selfIntroduce;

    private Double getOrderDistance;

    private Integer sellerBrowseCount;

    private Integer shareCount;

    private Integer paidanSwitch;

    private String getOrderCoordinates;

    private Double dayPrice;

    private Integer priceStatus;

    private Integer popupStatus;

    private Integer distributeArtificer;

    private Integer cancelNum;

    private Integer housekeeperId;

    private Integer orderSwitch;

    private Integer robSwitch;

    private Integer distributeSwitch;

    private Integer artificerTrain;

    private Integer waitVideoInterview;

    private Integer entryStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType == null ? null : workType.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCompanys() {
        return companys;
    }

    public void setCompanys(String companys) {
        this.companys = companys == null ? null : companys.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPubStatus() {
        return pubStatus;
    }

    public void setPubStatus(Integer pubStatus) {
        this.pubStatus = pubStatus;
    }

    public String getDinatePosition() {
        return dinatePosition;
    }

    public void setDinatePosition(String dinatePosition) {
        this.dinatePosition = dinatePosition == null ? null : dinatePosition.trim();
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates == null ? null : coordinates.trim();
    }

    public BigDecimal getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(BigDecimal rentAmount) {
        this.rentAmount = rentAmount;
    }

    public Integer getPushMsgFlag() {
        return pushMsgFlag;
    }

    public void setPushMsgFlag(Integer pushMsgFlag) {
        this.pushMsgFlag = pushMsgFlag;
    }

    public Integer getPushMsgRing() {
        return pushMsgRing;
    }

    public void setPushMsgRing(Integer pushMsgRing) {
        this.pushMsgRing = pushMsgRing;
    }

    public String getCertificatePhoto() {
        return certificatePhoto;
    }

    public void setCertificatePhoto(String certificatePhoto) {
        this.certificatePhoto = certificatePhoto == null ? null : certificatePhoto.trim();
    }

    public String getFrontPhoto() {
        return frontPhoto;
    }

    public void setFrontPhoto(String frontPhoto) {
        this.frontPhoto = frontPhoto == null ? null : frontPhoto.trim();
    }

    public String getBackPhoto() {
        return backPhoto;
    }

    public void setBackPhoto(String backPhoto) {
        this.backPhoto = backPhoto == null ? null : backPhoto.trim();
    }

    public String getAuditData() {
        return auditData;
    }

    public void setAuditData(String auditData) {
        this.auditData = auditData == null ? null : auditData.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Integer getIsUhoerAudit() {
        return isUhoerAudit;
    }

    public void setIsUhoerAudit(Integer isUhoerAudit) {
        this.isUhoerAudit = isUhoerAudit;
    }

    public String getArtlevel() {
        return artlevel;
    }

    public void setArtlevel(String artlevel) {
        this.artlevel = artlevel == null ? null : artlevel.trim();
    }

    public String getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(String startWorkTime) {
        this.startWorkTime = startWorkTime == null ? null : startWorkTime.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIsAutoAudit() {
        return isAutoAudit;
    }

    public void setIsAutoAudit(Integer isAutoAudit) {
        this.isAutoAudit = isAutoAudit;
    }

    public Integer getIsShelf() {
        return isShelf;
    }

    public void setIsShelf(Integer isShelf) {
        this.isShelf = isShelf;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public Date getFirstShelfTime() {
        return firstShelfTime;
    }

    public void setFirstShelfTime(Date firstShelfTime) {
        this.firstShelfTime = firstShelfTime;
    }

    public Double getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(Double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public String getSelfIntroduce() {
        return selfIntroduce;
    }

    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce == null ? null : selfIntroduce.trim();
    }

    public Double getGetOrderDistance() {
        return getOrderDistance;
    }

    public void setGetOrderDistance(Double getOrderDistance) {
        this.getOrderDistance = getOrderDistance;
    }

    public Integer getSellerBrowseCount() {
        return sellerBrowseCount;
    }

    public void setSellerBrowseCount(Integer sellerBrowseCount) {
        this.sellerBrowseCount = sellerBrowseCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getPaidanSwitch() {
        return paidanSwitch;
    }

    public void setPaidanSwitch(Integer paidanSwitch) {
        this.paidanSwitch = paidanSwitch;
    }

    public String getGetOrderCoordinates() {
        return getOrderCoordinates;
    }

    public void setGetOrderCoordinates(String getOrderCoordinates) {
        this.getOrderCoordinates = getOrderCoordinates == null ? null : getOrderCoordinates.trim();
    }

    public Double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(Double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public Integer getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(Integer priceStatus) {
        this.priceStatus = priceStatus;
    }

    public Integer getPopupStatus() {
        return popupStatus;
    }

    public void setPopupStatus(Integer popupStatus) {
        this.popupStatus = popupStatus;
    }

    public Integer getDistributeArtificer() {
        return distributeArtificer;
    }

    public void setDistributeArtificer(Integer distributeArtificer) {
        this.distributeArtificer = distributeArtificer;
    }

    public Integer getCancelNum() {
        return cancelNum;
    }

    public void setCancelNum(Integer cancelNum) {
        this.cancelNum = cancelNum;
    }

    public Integer getHousekeeperId() {
        return housekeeperId;
    }

    public void setHousekeeperId(Integer housekeeperId) {
        this.housekeeperId = housekeeperId;
    }

    public Integer getOrderSwitch() {
        return orderSwitch;
    }

    public void setOrderSwitch(Integer orderSwitch) {
        this.orderSwitch = orderSwitch;
    }

    public Integer getRobSwitch() {
        return robSwitch;
    }

    public void setRobSwitch(Integer robSwitch) {
        this.robSwitch = robSwitch;
    }

    public Integer getDistributeSwitch() {
        return distributeSwitch;
    }

    public void setDistributeSwitch(Integer distributeSwitch) {
        this.distributeSwitch = distributeSwitch;
    }

    public Integer getArtificerTrain() {
        return artificerTrain;
    }

    public void setArtificerTrain(Integer artificerTrain) {
        this.artificerTrain = artificerTrain;
    }

    public Integer getWaitVideoInterview() {
        return waitVideoInterview;
    }

    public void setWaitVideoInterview(Integer waitVideoInterview) {
        this.waitVideoInterview = waitVideoInterview;
    }

    public Integer getEntryStatus() {
        return entryStatus;
    }

    public void setEntryStatus(Integer entryStatus) {
        this.entryStatus = entryStatus;
    }
}