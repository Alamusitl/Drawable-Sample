package com.owl.drawablesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private List<Class> mClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        mClassList = new ArrayList<>();
        mClassList.add(ShapeActivity.class);
        mClassList.add(BitmapActivity.class);
        mClassList.add(NinePatchActivity.class);
        mClassList.add(LayerActivity.class);
        mClassList.add(StateActivity.class);
        mClassList.add(LevelActivity.class);
        mClassList.add(TransitionActivity.class);
        mClassList.add(InsetActivity.class);
        mClassList.add(ClipActivity.class);
        mClassList.add(ScaleActivity.class);
        mClassList.add(RotateActivity.class);
    }

    private void initView() {
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(this,
                R.layout.list_item,
                R.id.item_name,
                getResources().getStringArray(R.array.MyList)));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, mClassList.get(position)));
    }
}
