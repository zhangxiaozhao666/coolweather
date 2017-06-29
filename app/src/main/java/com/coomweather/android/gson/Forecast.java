package com.coomweather.android.gson;

import android.util.Log;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小新 on 2017/6/28.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }


}
