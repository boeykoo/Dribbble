package com.example.gudan.dribbble.view.bucket_list;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.example.gudan.dribbble.R;
import com.example.gudan.dribbble.view.base.SingleFragmentActivity;

import java.util.ArrayList;

public class ChooseBucketActivity extends SingleFragmentActivity {

    @NonNull
    @Override
    protected Fragment newFragment() {
        // TODO: we need to pass in the chosen bucket ids to BucketListFragment here
        return BucketListFragment.newInstance(true, new ArrayList<String>());
    }

    @NonNull
    @Override
    protected String getActivityTitle() {
        return getString(R.string.choose_bucket);
    }
}
