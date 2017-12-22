package com.imvt.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rye on 2017/12/20.
 */

public class ListFragment extends Fragment {
    private TextView foot,basket,gold;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.list,container,false);
        foot=view.findViewById(R.id.foot);
        basket=view.findViewById(R.id.basket);
        gold=view.findViewById(R.id.golden);
        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment();
            }
        });
        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment();
            }
        });
        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment();
            }
        });
        return view;
    }

    private void getFragment() {
        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        ContentFragment contentFragment=new ContentFragment();
        transaction.replace(R.id.right_layout,contentFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
