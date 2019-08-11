package com.example.dannyseo.hanpost;

import android.content.Context;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{


    private static final String TAG = "RecyclerViewAdapter";

    //vars
    private ArrayList<String> mImageUrls;
    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> imageUrls){
        mImageUrls = new ArrayList<String>();
        mContext = context;
        mImageUrls = imageUrls;
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;

        public ViewHolder (View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.imageView4);
        }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        Log.d(TAG, "onCreateViewHolder: called.");

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Log.d(TAG, "onBindViewHodlder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImageUrls.get(i))
                .into(holder.image);

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick : clicked on an image: ");
                Toast.makeText(mContext, "good", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {

        return mImageUrls.size();
    }
}
