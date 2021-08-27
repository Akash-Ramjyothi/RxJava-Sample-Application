package com.rxjava.sample.akashramjyothi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rxjava.sample.akashramjyothi.MyApplication;
import com.rxjava.sample.akashramjyothi.R;
import com.rxjava.sample.akashramjyothi.ui.cache.CacheExampleActivity;
import com.rxjava.sample.akashramjyothi.ui.pagination.PaginationActivity;
import com.rxjava.sample.akashramjyothi.ui.rxbus.RxBusActivity;

import androidx.appcompat.app.AppCompatActivity;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    public void startOperatorsActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, OperatorsActivity.class));
    }

    public void startCacheActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, CacheExampleActivity.class));
    }

    public void startRxBusActivity(View view) {
        ((MyApplication) getApplication()).sendAutoEvent();
        startActivity(new Intent(SelectionActivity.this, RxBusActivity.class));
    }

    public void startPaginationActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, PaginationActivity.class));
    }

}
