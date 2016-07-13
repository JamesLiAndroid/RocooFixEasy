package com.smallsoho.racootext;

import android.app.Application;

import com.dodola.rocoofix.RocooFix;

/**
 * Created by handong on 2016/7/12.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RocooFix.initPathFromAssets(this,"patch.jar");
    }
}
