package com.example.ratha.tablayout;

import android.os.PersistableBundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ratha.tablayout.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String POSITION="POSITION";
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private String [] tabTitles={"Popular","Recent","Favorite"};
    private int[] tabIcon={R.drawable.gold_star,R.drawable.gold_star,R.drawable.gold_star};

    List<Fragment> fragments= new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.sliding_tabs);

        this.setupFragment();
        ViewPagerAdapter adapter =new ViewPagerAdapter(getSupportFragmentManager(),
                this,fragments);
        adapter.setTabTitles(tabTitles);
        adapter.setTabIcon(tabIcon);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        //set icon
        /*for(int i=0;i<tabIcon.length;i++){
            tabLayout.getTabAt(i).setIcon(tabIcon[i]);
        }*/

    }

    protected  void setupFragment( ){
        Fragment popFragment= PopularFragment.newInstance(0);
        Fragment recentFragment= RecentFragment.newInstance(1);
        Fragment favoriteFragment= FavoriteFragment.newInstance(2);

        fragments.add(popFragment);
        fragments.add(recentFragment);
        fragments.add(favoriteFragment);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(POSITION,tabLayout.getSelectedTabPosition());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        viewPager.setCurrentItem(savedInstanceState.getInt(POSITION));
    }
}
