package com.example.lat3uts_akbif9_10116413_harryapriadi.GalleryActivity;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 04 Mei 2019*/
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lat3uts_akbif9_10116413_harryapriadi.R;


public class GaleryRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private ImageView GaleryImageView = null;

    public GaleryRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            GaleryImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }



    public ImageView getGaleryImageView() {
        return GaleryImageView;
    }
}

