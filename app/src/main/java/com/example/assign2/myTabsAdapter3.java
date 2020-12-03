package com.example.assign2;

import android.content.Context;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myTabsAdapter3 extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public myTabsAdapter3(Context context, FragmentManager fm, int totalTabs)
    {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;

    }

    @Override    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                tabs3frag1 homeFragment = new tabs3frag1();
                return homeFragment;
            case 1:
                tabs3frag2 sportFragment = new tabs3frag2();
                return sportFragment;

            default:
                return null;
        }
    }    // this counts total number of tabs
    @Override    public int getCount()
    {
        return totalTabs;
    }
}
