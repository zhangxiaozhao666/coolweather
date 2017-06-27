package com.coomweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 小新 张晓昭 on 2017/6/26.
 */

public class Province extends DataSupport {
//  字段id
    private int id;
//    省份名字
    private String provinceName;
//    省份代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
