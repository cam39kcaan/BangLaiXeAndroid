package com.example.drivinglicensequizz;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SelectModeAdapter extends FragmentPagerAdapter {


    public SelectModeAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return position == 0 ? LyThuyetFragment.getInstance() : ThucHanhFragment.getInstance();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
