package com.example.myapplication.net;

import com.example.myapplication.utils.OkhttpUtils;

import okhttp3.OkHttpClient;

/**
 * Created by 特雷西麦克格蕾蒂 on 2017/12/26.
 */

public class HttpFactroy {
    public static OkHttpClient create(){
        return OkhttpUtils.newInstance();
    }
}
