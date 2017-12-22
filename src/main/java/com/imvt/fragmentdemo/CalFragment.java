package com.imvt.fragmentdemo;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by rye on 2017/12/20.
 */

public class CalFragment extends Fragment {

    private TextView add;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.cal,container,false);

        add=view.findViewById(R.id.add);                                     //在这个view下边寻找id，不然找不到，查询id在return view之前
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                AddFragment addFragment=new AddFragment();
                transaction.replace(R.id.right_layout,addFragment);
                transaction.addToBackStack(null);                           //回退栈
                transaction.commit();
            }
        });

        return view;
    }
}
