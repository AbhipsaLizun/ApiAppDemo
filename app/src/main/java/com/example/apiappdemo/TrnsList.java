package com.example.apiappdemo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TrnsList {

    @SerializedName("trns")
    private ArrayList<Trns> trnsArrayListList;

    public ArrayList<Trns> getTrnsArrayListList() {
        return trnsArrayListList;
    }

    public void setTrnsArrayListList(ArrayList<Trns> trnsArrayListList) {
        this.trnsArrayListList = trnsArrayListList;
    }
}
