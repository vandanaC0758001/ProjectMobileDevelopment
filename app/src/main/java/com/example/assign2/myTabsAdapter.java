package com.example.assign2;

import android.content.Context;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myTabsAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;
    public myTabsAdapter(Context context, FragmentManager fm, int totalTabs)
    {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;

    }

    @Override    public Fragment getItem(int position)
    {
        switch (position) {
            case 0:
                tabsfragment1 homeFragment = new tabsfragment1();
                return homeFragment;
            case 1:
                tabsfragment2 sportFragment = new tabsfragment2();
                return sportFragment;
            case 2:
                tabsfragment3 movieFragment = new tabsfragment3();
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
