package com.example.alexandrup.ps_amd_tabs_tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alexandrup.ps_amd_tabs_tablayout.R;
import com.example.alexandrup.ps_amd_tabs_tablayout.adapters.CustomTabsAdapater;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentOne;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentThree;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrup on 12/31/2016.
 */

public class CustomViewTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    private CustomTabsAdapater adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tabs);
        
        initialise();
        
        prepareDataResouce();

        adapter = new CustomTabsAdapater(getSupportFragmentManager(),
                fragmentList, titleList);

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        setCustomViewForTabs();

    }

    private void setCustomViewForTabs() {

        setCustomViewForTab(0, "WALL", "TAB ONE");
        setCustomViewForTab(1, "CHAT", "TAB TWO");
        setCustomViewForTab(2, "PROFILE", "TAB THREE");

    }

    private void setCustomViewForTab(int position, String title, String subTitle){

        LinearLayout tabView = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.tab_item, null);

        TextView txvTitle = (TextView) tabView.findViewById(R.id.tabTextTitle);
        txvTitle.setText(title);

        TextView txvSubTitle = (TextView) tabView.findViewById(R.id.tabTextSubTitle);
        txvSubTitle.setText(subTitle);

        tabLayout.getTabAt(position).setCustomView(tabView);
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
