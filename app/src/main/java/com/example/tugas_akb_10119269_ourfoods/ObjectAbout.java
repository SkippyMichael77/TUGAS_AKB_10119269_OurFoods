package com.example.tugas_akb_10119269_ourfoods;

//10119269 Zuhair Rasyid Wafi IF7

import java.util.ArrayList;

public class ObjectAbout {

    int ivObject;
    String txTips;

    public ObjectAbout(int ivObject, String txTips) {
        this.ivObject = ivObject;
        this.txTips = txTips;
    }

    public static ArrayList<ObjectAbout> createData() {
        ArrayList<ObjectAbout> justObject = new ArrayList<>();
        justObject.add(new ObjectAbout(R.drawable.restaurant,"Find your nearby restaurant!"));
        justObject.add(new ObjectAbout(R.drawable.map,"Look where your location right now!"));
        justObject.add(new ObjectAbout(R.drawable.taxfree,"The best of all, this app is free :D"));
        return justObject;
    }
}

