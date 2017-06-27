package com.coomweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 小新 on 2017/6/26.
 */

public class County extends DataSupport {

    private int id;
//    县名字
    private String countyName;
//    对应的县所对应的天气ID
    private String weatherId;
//    当前城市的id
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
