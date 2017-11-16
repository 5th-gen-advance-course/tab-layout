package com.example.ratha.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ratha on 11/15/2017.
 */

public class RecentFragment extends Fragment {

    public static final String ARG_PAGE="ARG_PAGE";
    private int mPage;
    public static RecentFragment newInstance(int page){
        Bundle args=new Bundle();
        args.putInt(ARG_PAGE,page);
        RecentFragment fragment=new RecentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage=getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup= (ViewGroup) inflater.inflate(R.layout.popular_fragment_layout,container,false);

        TextView tvText=viewGroup.findViewById(R.id.tvText);
        tvText.setText("Fragment #"+mPage);

        return viewGroup;

    }
}
