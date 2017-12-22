package com.imvt.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

/**
 * Created by rye on 2017/12/20.
 */

public class ContentFragment extends Fragment {

    private String[] number={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen"};
    private ListView lv;
    private ImageButton back;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.content,container,false);
        lv=view.findViewById(R.id.listview);
        back=view.findViewById(R.id.back);
        ArrayAdapter adapter=new ArrayAdapter(getContext(),android.R.layout.simple_expandable_list_item_1,number);
        lv.setAdapter(adapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();                          //一般点击手机的返回按钮回到上一个fragment，这里我们添加一个ImageButton，点击回退到上一个fragment
            }
        });
        return view;
    }
}
