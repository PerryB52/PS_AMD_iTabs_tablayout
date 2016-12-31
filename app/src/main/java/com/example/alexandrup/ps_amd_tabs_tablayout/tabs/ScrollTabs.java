package com.example.alexandrup.ps_amd_tabs_tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.alexandrup.ps_amd_tabs_tablayout.R;
import com.example.alexandrup.ps_amd_tabs_tablayout.adapters.ScrollTabsAdapter;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentFive;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentFour;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentOne;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentSix;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentThree;
import com.example.alexandrup.ps_amd_tabs_tablayout.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandrup on 12/31/2016.
 */

public class ScrollTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    private ScrollTabsAdapter adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);
        
        initialise();
        
        prepareDataResouce();

        adapter = new ScrollTabsAdapter(getSupportFragmentManager(),
                fragmentList, titleList);

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }


    private void initialise() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Scroll Tabs Example");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);

    }

    private void prepareDataResouce() {

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentFour(), "FOUR");
        addData(new FragmentFive(), "FIVE");
        addData(new FragmentSix(), "SIX");

        addData(new FragmentOne(), "ONE");
        addData(new FragmentTwo(), "TWO");
        addData(new FragmentThree(), "THREE");
        addData(new FragmentFour(), "FOUR");
        addData(new FragmentFive(), "FIVE");
        addData(new FragmentSix(), "SIX");


    }

    private void addData(Fragment fragment, String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
