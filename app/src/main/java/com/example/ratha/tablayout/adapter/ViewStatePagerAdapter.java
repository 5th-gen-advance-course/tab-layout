package com.example.ratha.tablayout.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by ratha on 11/16/2017.
 */

public class ViewStatePagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragments;
    String[] tabTitle;
    Context context;

    public ViewStatePagerAdapter(FragmentManager fm, Context context,List<Fragment> fragments) {
        super(fm);
        this.context=context;
        this.fragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }

    public String[] getTabTitle() {
        return tabTitle;
    }

    public void setTabTitle(String[] tabTitle) {
        this.tabTitle = tabTitle;
    }
}
