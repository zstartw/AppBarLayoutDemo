package com.betterzw.app.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.betterzw.app.demo.R;

/**
 * Please specify the function of this class
 *
 * @author zhengwu
 * @date 2015/9/30
 */
public class ImageItemAdapter extends BaseAdapter{

    private Context context;
    private LayoutInflater inflater;


    private int[] image = {R.drawable.bag_1, R.drawable.bag_2,
            R.drawable.bag_3,R.drawable.bag_1, R.drawable.bag_2,
            R.drawable.bag_3,R.drawable.bag_1, R.drawable.bag_2,
            R.drawable.bag_3};

    public ImageItemAdapter(Context context){
        context = context;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return image[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            view = inflater.inflate(R.layout.image_item, viewGroup, false);

            viewHolder = new ViewHolder();
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.imageItem = (ImageView) view.findViewById(R.id.image_item);

        viewHolder.imageItem.setBackgroundResource(image[i]);

        return view;
    }

    static class ViewHolder{
        ImageView imageItem;
    }
}
