package com.example.myapplication.app;

import android.app.Application;

import com.example.myapplication.base.BaseActivity;

/**
 * Created by 特雷西麦克格蕾蒂 on 2017/12/26.
 */

public class AppUtils extends Application {
public static BaseActivity context=null;
    @Override
    public void onCreate() {
        super.onCreate();

    }
}
