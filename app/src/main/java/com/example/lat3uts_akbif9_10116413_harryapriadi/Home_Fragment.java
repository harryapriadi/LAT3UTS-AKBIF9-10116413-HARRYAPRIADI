package com.example.lat3uts_akbif9_10116413_harryapriadi;
/*Nama : Harry Apriadi
NIM  : 10116413
KELAS : AKB-IF9
Tanggal Pengerjaan : 02 Mei 2019*/
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmen_home, container, false);

        return view;
    }
}