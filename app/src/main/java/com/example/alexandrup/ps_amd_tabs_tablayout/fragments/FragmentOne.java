package com.example.alexandrup.ps_amd_tabs_tablayout.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alexandrup.ps_amd_tabs_tablayout.R;

/**
 * Created by alexandrup on 12/30/2016.
 */

public class FragmentOne extends Fragment {

    public FragmentOne(){
        Log.i("Fragment Check", "Fragment One Created");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container, false);
    }
}