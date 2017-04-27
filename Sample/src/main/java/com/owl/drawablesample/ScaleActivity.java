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

        ImageView view0 = (ImageView) findViewById(R.id.id_scale_iv_0);
        view0.setImageLevel(1);

        ImageView view30 = (ImageView) findViewById(R.id.id_scale_iv_30);
        view30.getDrawable().setLevel(5000);

        ImageView view50 = (ImageView) findViewById(R.id.id_scale_iv_50);
        view50.setImageLevel(1);

        ImageView view80 = (ImageView) findViewById(R.id.id_scale_iv_80);
        view80.setImageLevel(1);
    }
}
