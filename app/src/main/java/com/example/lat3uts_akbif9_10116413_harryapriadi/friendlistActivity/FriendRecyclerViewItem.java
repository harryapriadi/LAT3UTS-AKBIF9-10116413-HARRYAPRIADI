package com.example.lat3uts_akbif9_10116413_harryapriadi.friendlistActivity;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/
public class FriendRecyclerViewItem {

    // Save car name.
    private String FriendName;

    // Save car image resource id.
    private int FriendImageId;

    public FriendRecyclerViewItem(String FriendName, int FriendImageId) {
        this.FriendName = FriendName;
        this.FriendImageId = FriendImageId;
    }

    public String getFriendName() {
        return FriendName;
    }

    public void setFriendName(String FriendyName) {
        this.FriendName = FriendName;
    }

    public int getFriendImageId() {
        return FriendImageId;
    }

    public void setFriendImageId(int FriendImageId) {
        this.FriendImageId = FriendImageId;
    }
}