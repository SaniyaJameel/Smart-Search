package com.example.sanii.smartsearch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sanii on 10/1/2015.
 */
public class AboutActivity  extends android.support.v4.app.Fragment  {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_about, container, false);
        return rootview;
    }
}
