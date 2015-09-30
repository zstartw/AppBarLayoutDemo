package com.betterzw.app.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.betterzw.app.demo.adapter.ImageItemAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Please specify the function of this class
 *
 * @author zhengwu
 * @date 2015/9/30
 */
public class TransitionsActivity extends Activity{




    @Bind(R.id.gridView)
    GridView gridView;

//    @OnClick(R.id.start_transitions) void onStartTransitions(){
//
//        ActivityOptionsCompat options = ActivityOptionsCompat.
//                makeSceneTransitionAnimation(this, startTransitions, "test");
//
//        Intent startIntent = new Intent(this, TransitionsActivityTwo.class);
//
//        ActivityCompat.startActivity(this, startIntent, options.toBundle());
//    }

    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_transitions);

        ButterKnife.bind(this);

        context = this;


        ImageItemAdapter adapter  = new ImageItemAdapter(context);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation((Activity) context, view, "test");

                Intent startIntent = new Intent((Activity) context, TransitionsActivityTwo.class);

                ActivityCompat.startActivity((Activity) context, startIntent, options.toBundle());
            }
        });
    }
}
