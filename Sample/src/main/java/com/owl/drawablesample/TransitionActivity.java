package com.owl.drawablesample;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Alamusi on 2017/4/24.
 */

public class TransitionActivity extends BaseActivity {

    private boolean mTransition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        mTransition = false;

        final ImageView imageView = (ImageView) findViewById(R.id.id_iv_transition);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTransition) {
                    ((TransitionDrawable) imageView.getBackground()).reverseTransition(1000);
                } else {
                    ((TransitionDrawable) imageView.getBackground()).startTransition(1000);
                }
                mTransition = !mTransition;
            }
        });
    }
}
