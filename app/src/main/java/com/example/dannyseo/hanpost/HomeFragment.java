package com.example.dannyseo.hanpost;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.firebase.ui.auth.AuthUI.getApplicationContext;

public class HomeFragment extends Fragment {


    private static final String TAG = "HomeFragment";

    private View v;
    //vars
    private ArrayList<String> mImageUrls = new ArrayList<>();

    private Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_home, container, false);
        context = container.getContext();
        getImages();
        return v;
    }

    private void getImages(){

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");


        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");


        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");


        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");



        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");


        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");



        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");


        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");


        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");

        initRecyclerView();

    }


    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(context, mImageUrls);
        recyclerView.setAdapter(adapter);

        Log.d(TAG, "size:" +adapter.getItemCount());
    }


}
