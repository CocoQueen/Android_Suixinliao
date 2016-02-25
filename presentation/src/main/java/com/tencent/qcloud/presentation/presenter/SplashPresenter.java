package com.tencent.qcloud.presentation.presenter;

import android.os.Handler;

import com.tencent.qcloud.presentation.view.SplashView;


/**
 * 闪屏界面逻辑
 */
public class SplashPresenter extends Presenter {

    SplashView view;

    public SplashPresenter(SplashView view){
        this.view = view;
    }


    /**
     * 加载页面逻辑
     */
    @Override
    public void start() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 3000);
    }

}
