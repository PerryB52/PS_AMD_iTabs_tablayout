package com.example.alexandrup.ps_amd_tabs_tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.alexandrup.ps_amd_tabs_tablayout.R;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentOne;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentThree;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrup on 12/31/2016.
 */

public class TextTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);
        
        initialise();
        
        prepareDataResouce();
    }

    private void initialise() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Tabs Example");

    }

    private void prepareDataResouce() {

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");

    }

    private void addData(Fragment fragment, String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
