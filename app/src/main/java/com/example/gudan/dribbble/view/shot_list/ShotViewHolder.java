package com.example.gudan.dribbble.view.shot_list;

import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.example.gudan.dribbble.R;
import com.example.gudan.dribbble.view.base.BaseViewHolder;

import butterknife.BindView;

class ShotViewHolder extends BaseViewHolder {

    @BindView(R.id.shot_clickable_cover) View cover;
    @BindView(R.id.shot_like_count) TextView likeCount;
    @BindView(R.id.shot_bucket_count) TextView bucketCount;
    @BindView(R.id.shot_view_count) TextView viewCount;
    @BindView(R.id.shot_image) SimpleDraweeView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
