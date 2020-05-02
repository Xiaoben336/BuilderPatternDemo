package com.zjf.builderpatterndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person.Builder builder = new Person.Builder();
        Person person1 = builder.id(1).name("zjf").build();
        Person person2 = builder.id(1).name("zjf").sex("male").build();
        Person person3 = builder.id(1).name("zjf").sex("male").occupation("coder").build();
    }
}
