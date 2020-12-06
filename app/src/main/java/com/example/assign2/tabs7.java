package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class tabs7 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs7);

        tabLayout=(TabLayout)findViewById(R.id.tabLayoutID1);
        viewPager=(ViewPager)findViewById(R.id.viewPagerID1);
        tabLayout.addTab(tabLayout.newTab().setText("Overview"));
        tabLayout.addTab(tabLayout.newTab().setText("Reviews"));


        final myTabsAdapter7 adapter = new myTabsAdapter7(this,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}