package com.owl.drawablesample;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alamusi on 2017/4/26.
 */

public class BaseFragment extends Fragment {

    private static final String LAYOUT_ID = "layoutId";
    private int mLayoutId;

    public static BaseFragment getInstance(@LayoutRes int layoutId) {
        BaseFragment fragment = new BaseFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(LAYOUT_ID, layoutId);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mLayoutId = bundle.getInt(LAYOUT_ID);
        }
        if ((savedInstanceState != null) && savedInstanceState.containsKey(LAYOUT_ID)) {
            mLayoutId = savedInstanceState.getInt(LAYOUT_ID);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(mLayoutId, container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(LAYOUT_ID, mLayoutId);
    }
}
