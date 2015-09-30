/*
 * Copyright (C) Globalegrow E-Commerce Co. , Ltd. 2007-2014. 
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information 
 * of Globalegrow E-Commerce Co. , Ltd. ("Confidential Information"). 
 * You shall not disclose such Confidential Information and shall 
 * use it only in accordance with the terms of the license agreement 
 * you entered into with Globalegrow. 
 */
package com.betterzw.app.demo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.betterzw.app.demo.R;

public class GoodsDetailPagerAdapter extends PagerAdapter {
	private String TAG = "GoodsDetailPagerAdapter";
	private Context context;
	private LayoutInflater mInflater;
	private int mCurrentPosition = -1;
	private String currentGoodsNum;

	private int[] image = {R.drawable.bag_1, R.drawable.bag_2,
		R.drawable.bag_3};

	public GoodsDetailPagerAdapter(Context context, LayoutInflater mInflater) {
		this.context = context;
		this.mInflater = mInflater;
	}

	@Override
	public int getCount() {
		return image.length;
	}



	@Override
	public void setPrimaryItem(ViewGroup container, int position, Object object) {
		super.setPrimaryItem(container, position, object);
		if (mCurrentPosition == position)
			return;
		mCurrentPosition = position;
		changePointPosition(position);
	}

	private void changePointPosition(int position) {

	}
	
	/**
	 * 标识是否断货
	 *
	 * @param goodsNumber
	 * @date 2014-12-16
	 * @author 郑伍
	 */
	public void setCurrentGoodsNumber(String goodsNumber){
		currentGoodsNum = goodsNumber;
	}

	@Override
	public int getItemPosition(Object object) {
		return POSITION_NONE;
	}
	

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View rootLayout = mInflater.inflate(R.layout.goods_detail_picture_item,
				container, false);
		final ImageView thumbIv = (ImageView) rootLayout
				.findViewById(R.id.goods_picture_iv_Thumb);


		thumbIv.setImageResource(image[position]);


		((ViewPager) container).addView(rootLayout, 0);
		return rootLayout;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View) object);
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == object;
	}

}
