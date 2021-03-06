package com.example.alexandrup.ps_amd_tabs_tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.alexandrup.ps_amd_tabs_tablayout.R;
import com.example.alexandrup.ps_amd_tabs_tablayout.adapters.TextTabsAdapater;
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

    private TextTabsAdapater adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);
        
        initialise();
        
        prepareDataResouce();

        adapter = new TextTabsAdapater(getSupportFragmentManager(),
                fragmentList, titleList);

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        //simply remove this in order to have tabs with only Text
        setTabIcons();
    }

    private void setTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.googleplus);
        tabLayout.getTabAt(2).setIcon(R.drawable.instagram);
    }

    private void initialise() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Tabs Example");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);



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
