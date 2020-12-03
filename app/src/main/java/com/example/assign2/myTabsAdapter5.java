package com.example.assign2;

import android.content.Context;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myTabsAdapter5 extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public myTabsAdapter5(Context context, FragmentManager fm, int totalTabs)
    {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;

    }

    @Override    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                tabs5frag1 homeFragment = new tabs5frag1();
                return homeFragment;
            case 1:
                tabs5frag2 sportFragment = new tabs5frag2();
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
