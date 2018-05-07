package com.example.android.glidegalleryevilsecret;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

import java.util.List;

public class SwipeAdapter extends PagerAdapter {
    Activity pageActivity;
    List<Page> mData;
    LayoutInflater layoutInflater;

public SwipeAdapter (Activity pageActivity, List<Page> mData){
    this.pageActivity= pageActivity;
    this.mData= mData;
}
@Override
    public int getCount(){
    return (mData.size());
}
@NonNull
@Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) pageActivity.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.activity_page, container,false);

        ImageView image;
        image = itemView.findViewById(R.id.pageView);
        DisplayMetrics dis = new DisplayMetrics();
        pageActivity.getWindowManager().getDefaultDisplay().getMetrics(dis);
        int height = dis.heightPixels;
        int width = dis.widthPixels;
        image.setMinimumHeight(height);
        image.setMinimumWidth(width);

        try{
            Glide.with(pageActivity.getApplicationContext())
                    .load(mData.get(position))
                    .into(image);
        }
        catch (Exception ex){

        }
        container.addView(itemView);
        return itemView;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position,@NonNull Object object) {
        (container).removeView((View) object);

    }




















}
