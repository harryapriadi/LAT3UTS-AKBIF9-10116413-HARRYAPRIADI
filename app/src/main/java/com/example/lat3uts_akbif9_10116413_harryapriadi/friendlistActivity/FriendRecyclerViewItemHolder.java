package com.example.lat3uts_akbif9_10116413_harryapriadi.friendlistActivity;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lat3uts_akbif9_10116413_harryapriadi.R;


public class FriendRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView FriendTitleText = null;

    private ImageView FriendImageView = null;

    public FriendRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            FriendTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            FriendImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getFriendTitleText() {
        return FriendTitleText;
    }

    public ImageView getFriendImageView() {
        return FriendImageView;
    }
}

