package com.example.alexandrup.ps_amd_tabs_tablayout.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by alexandrup on 12/31/2016.
 */

public class IconTabsAdapater extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public IconTabsAdapater(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);

        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}

