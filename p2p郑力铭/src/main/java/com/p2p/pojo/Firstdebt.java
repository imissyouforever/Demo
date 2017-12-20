package com.p2p.pojo;

import java.util.Date;

public class Firstdebt {
    private String id;

    private String debttitle;

    private String debtor;

    private Date lastrepaydate;

    private Date nowrepaydate;

    private Date nextrepaydate;

    private String totalperiods;

    private String investmoney;

    private Integer status;

    private Long movemoney;

    private String movedate;

    private String surplusmoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDebttitle() {
        return debttitle;
    }

    public void setDebttitle(String debttitle) {
        this.debttitle = debttitle == null ? null : debttitle.trim();
    }

    public String getDebtor() {
        return debtor;
    }

    public void setDebtor(String debtor) {
        this.debtor = debtor == null ? null : debtor.trim();
    }

    public Date getLastrepaydate() {
        return lastrepaydate;
    }

    public void setLastrepaydate(Date lastrepaydate) {
        this.lastrepaydate = lastrepaydate;
    }

    public Date getNowrepaydate() {
        return nowrepaydate;
    }

    public void setNowrepaydate(Date nowrepaydate) {
        this.nowrepaydate = nowrepaydate;
    }

    public Date getNextrepaydate() {
        return nextrepaydate;
    }

    public void setNextrepaydate(Date nextrepaydate) {
        this.nextrepaydate = nextrepaydate;
    }

    public String getTotalperiods() {
        return totalperiods;
    }

    public void setTotalperiods(String totalperiods) {
        this.totalperiods = totalperiods == null ? null : totalperiods.trim();
    }

    public String getInvestmoney() {
        return investmoney;
    }

    public void setInvestmoney(String investmoney) {
        this.investmoney = investmoney == null ? null : investmoney.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getMovemoney() {
        return movemoney;
    }

    public void setMovemoney(Long movemoney) {
        this.movemoney = movemoney;
    }

    public String getMovedate() {
        return movedate;
    }

    public void setMovedate(String movedate) {
        this.movedate = movedate == null ? null : movedate.trim();
    }

    public String getSurplusmoney() {
        return surplusmoney;
    }

    public void setSurplusmoney(String surplusmoney) {
        this.surplusmoney = surplusmoney == null ? null : surplusmoney.trim();
    }
}