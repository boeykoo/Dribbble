package com.example.gudan.dribbble.view.shot_detail;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.example.gudan.dribbble.view.base.SingleFragmentActivity;

public class ShotActivity extends SingleFragmentActivity {

    public static final String KEY_SHOT_TITLE = "shot_title";

    @NonNull
    @Override
    protected Fragment newFragment() {
        return ShotFragment.newInstance(getIntent().getExtras());
    }

    @NonNull
    @Override
    protected String getActivityTitle() {
        return getIntent().getStringExtra(KEY_SHOT_TITLE);
    }
}
