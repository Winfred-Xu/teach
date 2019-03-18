package com.xwf.vo;

import java.io.Serializable;

public class test2 implements Serializable {
    private static final long serialVersionUID = -8095791015197342449L;
    private Boolean  hasPrizeQuality ;
    private Integer remainTimes ;

    public Boolean getHasPrizeQuality() {
        return hasPrizeQuality;
    }

    public void setHasPrizeQuality(Boolean hasPrizeQuality) {
        this.hasPrizeQuality = hasPrizeQuality;
    }

    public Integer getRemainTimes() {
        return remainTimes;
    }

    public void setRemainTimes(Integer remainTimes) {
        this.remainTimes = remainTimes;
    }
}
