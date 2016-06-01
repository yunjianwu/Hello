package com.demo.wyj.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //没加引号

        tv = (TextView) findViewById(R.id.tv);
    }

    private void test(){
        System.out.println("好啊好啊");
    }
}
