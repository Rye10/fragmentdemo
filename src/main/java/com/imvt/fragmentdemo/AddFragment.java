package com.imvt.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by rye on 2017/12/20.
 */

public class AddFragment extends Fragment {
    private ImageButton back;
    private TextView nub;
    private Button add,sub;
    private int num;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.add,container,false);
        nub=view.findViewById(R.id.number);
        back=view.findViewById(R.id.back);
        add=view.findViewById(R.id.add);
        sub=view.findViewById(R.id.subtract);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nubString=nub.getText().toString();                          //获取textview上的text转换为string类型
                num=Integer.valueOf(nubString)+1;                                   //Integer.valueOf转换为integer类型，完成数字的加减
                nub.setText(String.valueOf(num));                                  //把所得的数字转换为string类型，显示在textview上
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nubString=nub.getText().toString();
                num=Integer.valueOf(nubString)-1;
                nub.setText(String.valueOf(num));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }
}
