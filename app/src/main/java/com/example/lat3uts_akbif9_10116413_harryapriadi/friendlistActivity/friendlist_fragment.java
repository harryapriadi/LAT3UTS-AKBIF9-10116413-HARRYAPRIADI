package com.example.lat3uts_akbif9_10116413_harryapriadi.friendlistActivity;
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

public class friendlist_fragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<FriendRecyclerViewItem> FriendItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragmen_friendlist, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FriendRecyclerViewDataAdapter FriendDataAdapter = new FriendRecyclerViewDataAdapter(FriendItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(FriendDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(FriendItemList == null)
        {
            FriendItemList = new ArrayList<FriendRecyclerViewItem>();
            FriendItemList.add(new FriendRecyclerViewItem("Helsy", R.drawable.helsy));
            FriendItemList.add(new FriendRecyclerViewItem("Agam", R.drawable.agam));
            FriendItemList.add(new FriendRecyclerViewItem("Dewi", R.drawable.dewi));
            FriendItemList.add(new FriendRecyclerViewItem("Rina", R.drawable.rina));
            FriendItemList.add(new FriendRecyclerViewItem("Aufa", R.drawable.aufa));

        }
    }

}
