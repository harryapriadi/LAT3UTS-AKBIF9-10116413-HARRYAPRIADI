package com.example.lat3uts_akbif9_10116413_harryapriadi.GalleryActivity;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 1 Mei 2019*/
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.lat3uts_akbif9_10116413_harryapriadi.R;

import java.util.ArrayList;
import java.util.List;

public class Gallery_Fragment extends Fragment {
    private List<GaleryRecyclerViewItem> GalleryItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmen_gallery, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView GalleryRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        GalleryRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        GaleryRecyclerViewDataAdapter GaleryDataAdapter = new GaleryRecyclerViewDataAdapter(GalleryItemList);
        // Set data adapter.
        GalleryRecyclerView.setAdapter(GaleryDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(GalleryItemList == null)
        {
            GalleryItemList = new ArrayList<GaleryRecyclerViewItem>();
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry1));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry2));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry3));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry4));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry5));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry6));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry7));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry8));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry9));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.harry10));


        }
    }

}