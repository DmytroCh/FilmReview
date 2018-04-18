package com.example.user.filmreview.detailActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.user.filmreview.Config;

/**
 * Created by User on 17.04.2018.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PicturesFragment();
            case 1:
                return new ActorsFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return Config.FRAGMENTSCOUNT;
    }
}
