package com.owl.drawablesample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by Alamusi on 2017/4/24.
 */

public class ScaleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale);

        ImageView view30 = (ImageView) findViewById(R.id.id_iv_scale_30);
        view30.setImageLevel(1);

        ImageView view50 = (ImageView) findViewById(R.id.id_iv_scale_50);
        view50.setImageLevel(1);

        ImageView view80 = (ImageView) findViewById(R.id.id_iv_scale_80);
        view80.setImageLevel(1);
    }
}
