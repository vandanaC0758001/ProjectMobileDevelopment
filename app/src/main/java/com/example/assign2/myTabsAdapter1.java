package com.example.assign2;

import android.content.Context;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myTabsAdapter1 extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public myTabsAdapter1(Context context, FragmentManager fm, int totalTabs)
    {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;

    }

    @Override    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                tabs1frag1 homeFragment = new tabs1frag1();
                return homeFragment;
            case 1:
                tabs1frag2 sportFragment = new tabs1frag2();
                return sportFragment;
            case 2:
                tabs1frag3 movieFragment = new tabs1frag3();
                return movieFragment;
            default:
                return null;
        }
    }    // this counts total number of tabs
    @Override    public int getCount()
    {
        return totalTabs;
    }
}
