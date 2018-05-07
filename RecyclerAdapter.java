package com.example.android.glidegalleryevilsecret;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{


        private Context mContext;
        private List<Page> mData;

        public RecyclerAdapter(Context mContext, List<Page> mData) {
            this.mContext = mContext;
            this.mData = mData;
        }


        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view;
            LayoutInflater mInflater = LayoutInflater.from(mContext);
            view = mInflater.inflate(R.layout.cardview, parent,false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

            Glide.with(mContext)
                    .load(mData.get(position).getThumbnail())
                    .into(holder.page_thumbnail);


            holder.number_page.setText(mData.get(position).getNumberPage());
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (mContext, PageActivity.class);

                    //passing data to the page activity
                    intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                    //start the page activity
                    mContext.startActivity(intent);
                }
            });

        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        public  static class MyViewHolder extends RecyclerView.ViewHolder {

            TextView number_page;
            ImageView page_thumbnail;
            CardView cardView;

            public MyViewHolder (View itemView){
                super(itemView);

                number_page = itemView.findViewById(R.id.number_page_id);
                page_thumbnail = itemView.findViewById(R.id.page_image_id);
                cardView = itemView.findViewById(R.id.cardView_id);
            }
        }

    }
