package com.example.alexandrup.ps_amd_tabs_tablayout.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.alexandrup.ps_amd_tabs_tablayout.R;
import com.example.alexandrup.ps_amd_tabs_tablayout.adapters.IconTabsAdapater;
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

public class IconTabs extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();


    private IconTabsAdapater adapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tabs);

        initialise();

        prepareDataResouce();

        adapter = new IconTabsAdapater(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        setTabIcons();
    }

    private void setTabIcons() {

        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.googleplus);
        tabLayout.getTabAt(2).setIcon(R.drawable.instagram);
        tabLayout.getTabAt(3).setIcon(R.drawable.linkedin);
        tabLayout.getTabAt(4).setIcon(R.drawable.youtube);
        tabLayout.getTabAt(5).setIcon(R.drawable.twitter);
    }

    private void initialise() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Simple Icon Tabs");

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);



    }

    private void prepareDataResouce() {

        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());
        fragmentList.add(new FragmentFour());
        fragmentList.add(new FragmentFive());
        fragmentList.add(new FragmentSix());
    }

}