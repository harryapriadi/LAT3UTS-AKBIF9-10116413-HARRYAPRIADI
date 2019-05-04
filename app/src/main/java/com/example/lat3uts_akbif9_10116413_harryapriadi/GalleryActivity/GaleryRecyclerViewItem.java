package com.example.lat3uts_akbif9_10116413_harryapriadi.GalleryActivity;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 04 Mei 2019*/
public class GaleryRecyclerViewItem {

    // Save car image resource id.
    private int GaleryImageId;

    public GaleryRecyclerViewItem(int GaleryImageId) {
            this.GaleryImageId = GaleryImageId;
    }


    public int getGaleryImageId() {
        return GaleryImageId;
    }

    public void setGaleryImageId(int GaleryImageId) {
        this.GaleryImageId = GaleryImageId;
    }
}