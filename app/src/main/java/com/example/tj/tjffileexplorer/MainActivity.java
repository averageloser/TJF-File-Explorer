package com.example.tj.tjffileexplorer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.tj.tjffileexplorer.view.UIFragment;

public class MainActivity extends AppCompatActivity {
    private UIFragment mView;
    //private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_main);

        mView = (UIFragment) getFragmentManager().findFragmentById(R.id.file_list);
    }
}