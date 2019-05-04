package com.example.lat3uts_akbif9_10116413_harryapriadi.dailyActivity;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/
public class DailyRecyclerViewItem {

    // Save car name.
    private String DailyName;

    // Save car image resource id.
    private int DailyImageId;

    public DailyRecyclerViewItem(String DailyName, int DailyImageId) {
        this.DailyName = DailyName;
        this.DailyImageId = DailyImageId;
    }

    public String getDailyName() {
        return DailyName;
    }

    public void setDailyName(String DailyName) {
        this.DailyName = DailyName;
    }

    public int getDailyImageId() {
        return DailyImageId;
    }

    public void setDailyImageId(int DailyImageId) {
        this.DailyImageId = DailyImageId;
    }
}