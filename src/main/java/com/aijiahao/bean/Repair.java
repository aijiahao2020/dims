package com.aijiahao.bean;

import java.util.Date;

public class Repair {
    private String repairId;

    private String drmyId;

    private String aptId;

    private Date repairTime;

    private String repairContent;

    private String repairStatus;

    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId == null ? null : repairId.trim();
    }

    public String getDrmyId() {
        return drmyId;
    }

    public void setDrmyId(String drmyId) {
        this.drmyId = drmyId == null ? null : drmyId.trim();
    }

    public String getAptId() {
        return aptId;
    }

    public void setAptId(String aptId) {
        this.aptId = aptId == null ? null : aptId.trim();
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent == null ? null : repairContent.trim();
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus == null ? null : repairStatus.trim();
    }
}