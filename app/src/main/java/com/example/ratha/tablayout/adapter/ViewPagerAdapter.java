package com.example.ratha.tablayout.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import java.util.List;

/**
 * Created by ratha on 11/15/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private Context context;
    private String[] tabTitles;
    private int[] tabIcon;


    public ViewPagerAdapter(FragmentManager fm, Context context,List<Fragment> fragments) {
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

        return tabTitles[position];
    }

    public String[] getTabTitles() {
        return tabTitles;
    }

    public void setTabTitles(String[] tabTitles) {
        this.tabTitles = tabTitles;
    }

    public int[] getTabIcon() {
        return tabIcon;
    }

    public void setTabIcon(int[] tabIcon) {
        this.tabIcon = tabIcon;
    }
}
