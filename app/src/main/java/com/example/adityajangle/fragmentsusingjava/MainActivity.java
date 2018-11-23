package com.example.adityajangle.fragmentsusingjava;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.adityajangle.fragmentsusingjava.ValueGetterfrag;

public class MainActivity extends AppCompatActivity {
    ValueGetterfrag valueGetterfrag=new ValueGetterfrag();
    ValueSetterfrag valueSetterfrag=new ValueSetterfrag();
    ValueFixfrag valueFixfrag=new ValueFixfrag();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startgetterfrag();

    }
    public void startgetterfrag()
    {
        FragmentTransaction obj = getSupportFragmentManager().beginTransaction();
        obj.replace(R.id.framelayout,valueGetterfrag);
        obj.commit();
    }
    public void startsetterfrag()
    {
        FragmentTransaction obj = getSupportFragmentManager().beginTransaction();
        obj.replace(R.id.framelayout,valueSetterfrag);
        obj.commit();
    }

}
