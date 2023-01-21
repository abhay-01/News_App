package com.tul.project_news_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem home, science, tech, sports, enter, health;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;

    String api = "59886d9a676a4753ae3e07d0ffc6c4a4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        home = findViewById(R.id.home);
        science = findViewById(R.id.science);
        sports = findViewById(R.id.sports);
        health = findViewById(R.id.health);
        tech = findViewById(R.id.technology);
        enter = findViewById(R.id.entertainment);

        ViewPager viewPager = findViewById(R.id.fragment);
        tabLayout = findViewById(R.id.tabLay);

        pagerAdapter = new PagerAdap(getSupportFragmentManager(), 6);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1 || tab.getPosition() == 2 || tab.getPosition() == 3 || tab.getPosition() == 4 || tab.getPosition() == 5) {

                    pagerAdapter.notifyDataSetChanged();
                }
            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}