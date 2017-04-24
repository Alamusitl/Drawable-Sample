package com.owl.drawablesample;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Alamusi on 2017/4/24.
 */

public class LevelActivity extends BaseActivity {

    private EditText mEditText;
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        mEditText = (EditText) findViewById(R.id.id_et_level);
        mImageView = (ImageView) findViewById(R.id.id_iv_level);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String levelText = s.toString();
                if (TextUtils.isEmpty(levelText)) {
                    return;
                }

                int level = Integer.parseInt(levelText);
                if (level > 100) {
                    return;
                }
                Drawable drawable = mImageView.getDrawable();
                if (drawable != null) {
                    drawable.setLevel(level);
                }
            }
        });
    }
}
