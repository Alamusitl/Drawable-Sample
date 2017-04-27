package com.owl.drawablesample;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by Alamusi on 2017/4/24.
 */

public class ClipActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip);

        ImageView clipRight = (ImageView) findViewById(R.id.id_iv_clip_right);
        ClipDrawable clipRightDrawable = (ClipDrawable) clipRight.getBackground();
        //level:0-10000.
        clipRightDrawable.setLevel(5000);

        ImageView clipLeft = (ImageView) findViewById(R.id.id_iv_clip_left);
        ClipDrawable clipLeftDrawable = (ClipDrawable) clipLeft.getBackground();
        //level:0-10000.
        clipLeftDrawable.setLevel(5000);

        ImageView clipTop = (ImageView) findViewById(R.id.id_iv_clip_top);
        ClipDrawable clipTopDrawable = (ClipDrawable) clipTop.getBackground();
        //level:0-10000.
        clipTopDrawable.setLevel(5000);

        ImageView clipBottom = (ImageView) findViewById(R.id.id_iv_clip_bottom);
        ClipDrawable clipBottomDrawable = (ClipDrawable) clipBottom.getBackground();
        //level:0-10000.
        clipBottomDrawable.setLevel(5000);
    }
}
