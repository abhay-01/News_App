package com.tul.project_news_2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdap extends FragmentStatePagerAdapter {

    int tabCount;

    public PagerAdap(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabCount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:

                return new HomeFrag();

            case 1:

                return new SportsFrag();
            case 2:

                return new HealthFrag();
            case 3:

                return new TechFrag();
            case 4:

                return new ScienceFrag();
            case 5:

                return new EnterFrag();

            default:

                return null;
        }
    }

    @Override
    public int getCount() {

        return tabCount;
    }
}
