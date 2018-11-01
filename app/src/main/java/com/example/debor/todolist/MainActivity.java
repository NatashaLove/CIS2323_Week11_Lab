package com.example.debor.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//just a comment
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onDestroy() {
        //do smth else
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
