package com.coomweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 小新 on 2017/6/26.
 */

public class City extends DataSupport {

    private int id;
//    城市名字
    private String cityName;
//    城市代号
    private int cityCode;
//    表示省份id
    private int provinceId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
