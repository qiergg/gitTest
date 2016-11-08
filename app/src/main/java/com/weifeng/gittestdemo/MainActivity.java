package com.weifeng.gittestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("maiya","test1");
        Log.d("maiya","test2");
        Log.d("maiya","新开的节点");
        Log.d("maiya","新开的节点2");
        Log.d("maiya","新开的节点2");
        Log.d("maiya","回滚的提交");
    }
}
