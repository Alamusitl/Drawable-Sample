package com.owl.drawablesample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.owl.drawablesample.indicator.TabPageIndicator;

/**
 * Created by Alamusi on 2017/4/24.
 */

public class ShapeActivity extends BaseActivity {

    private String[] mTitles = {"Rectangle", "Oval", "Line", "Ring"};

    private int[] mFragmentLayouts = {R.layout.fragment_rectangle, R.layout.fragment_oval,
            R.layout.fragment_line, R.layout.fragment_ring};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return BaseFragment.getInstance(mFragmentLayouts[position]);
            }

            @Override
            public int getCount() {
                return mFragmentLayouts.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitles[position];
            }
        };

        ViewPager viewPager = (ViewPager) findViewById(R.id.id_shape_view_pager);
        viewPager.setAdapter(adapter);

        TabPageIndicator indicator = (TabPageIndicator) findViewById(R.id.id_shape_indicator);
        indicator.setViewPager(viewPager);
    }
}
