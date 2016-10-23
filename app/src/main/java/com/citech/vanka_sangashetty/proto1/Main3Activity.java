package com.citech.vanka_sangashetty.proto1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.citech.vanka_sangashetty.proto1.fragment.AcademicFragment;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content_frame2, new AcademicFragment());
        transaction.addToBackStack("demic");
        transaction.commit();
    }
    @Override
    public void onBackPressed() {


        int count = getFragmentManager().getBackStackEntryCount();

        if(count ==1){
            super.onBackPressed();
        }
        else
        {
            getFragmentManager().popBackStack();
        }
    }

}
