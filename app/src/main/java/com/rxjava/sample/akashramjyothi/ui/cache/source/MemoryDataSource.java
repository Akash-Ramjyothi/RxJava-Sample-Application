package com.rxjava.sample.akashramjyothi.ui.cache.source;

import com.rxjava.sample.akashramjyothi.ui.cache.model.Data;

import io.reactivex.Observable;

/**
 * Class to simulate InMemory DataSource
 */
public class MemoryDataSource {

    private Data data;

    public Observable<Data> getData() {
        return Observable.create(emitter -> {
            if (data != null) {
                emitter.onNext(data);
            }
            emitter.onComplete();
        });
    }

    public void cacheInMemory(Data data) {
        this.data = data.clone();
        this.data.source = "memory";
    }

}
