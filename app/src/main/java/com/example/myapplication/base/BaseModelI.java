package com.example.myapplication.base;

import com.example.myapplication.net.HttpFactroy;

import okhttp3.OkHttpClient;

/**
 * Created by 特雷西麦克格蕾蒂 on 2017/12/26.
 */

public interface BaseModelI {
    public static OkHttpClient iHttp = HttpFactroy.create();
}
