package com.rxjava.sample.akashramjyothi;

import android.app.Application;

import com.rxjava.sample.akashramjyothi.model.Events;
import com.rxjava.sample.akashramjyothi.ui.rxbus.RxBus;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;



public class MyApplication extends Application {

    public static final String TAG = "MyApplication";
    private RxBus bus;

    @Override
    public void onCreate() {
        super.onCreate();
        bus = new RxBus();
    }

    public RxBus bus() {
        return bus;
    }

    public void sendAutoEvent() {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) {
                        bus.send(new Events.AutoEvent());
                    }
                });
    }

}
