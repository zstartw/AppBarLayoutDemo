package com.betterzw.app.demo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;

import com.betterzw.app.demo.adapter.GoodsDetailPagerAdapter;

/**
 * Please specify the function of this class
 *
 * @author zhengwu
 * @date 2015/9/30
 */
public class TransitionsActivityTwo extends Activity{

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_transitions_two);

        context = this;

        ViewPager picImageViewPager = (ViewPager)
                findViewById(R.id.goods_detail_img_imageview);

        GoodsDetailPagerAdapter pagerAdapter = new GoodsDetailPagerAdapter(context,
                LayoutInflater.from(context));

        picImageViewPager.setAdapter(pagerAdapter);
    }
}
