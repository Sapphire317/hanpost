package com.example.dannyseo.hanpost;

import android.content.Context;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder (View itemView){
        super(itemView);

        mView = itemView;

    }

    //see details to recycler view row
    public void setDetails(Context ctx, String title, String description, String image){

        //Views
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageTv = mView.findViewById(R.id.rImageView);

        //See data to views
        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.get().load(image).into(mImageTv);


    }


}
