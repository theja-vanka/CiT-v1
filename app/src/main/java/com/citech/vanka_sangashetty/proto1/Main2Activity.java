package com.citech.vanka_sangashetty.proto1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import com.citech.vanka_sangashetty.proto1.MainActivity;

import com.citech.vanka_sangashetty.proto1.fragment.AcademicFragment;
import com.citech.vanka_sangashetty.proto1.fragment.FragDeptCiv;
import com.citech.vanka_sangashetty.proto1.fragment.FragDeptCse;
import com.citech.vanka_sangashetty.proto1.fragment.FragDeptEce;
import com.citech.vanka_sangashetty.proto1.fragment.FragDeptEee;
import com.citech.vanka_sangashetty.proto1.fragment.FragDeptIse;
import com.citech.vanka_sangashetty.proto1.fragment.FragDeptMech;
import com.citech.vanka_sangashetty.proto1.fragment.HomeFragment;
import com.citech.vanka_sangashetty.proto1.fragment.RadFragment;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content_frame2, new AcademicFragment());
        transaction.addToBackStack("demic");
        transaction.commit();



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        int count = getFragmentManager().getBackStackEntryCount();

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else if(count ==1){
            super.onBackPressed();
        }
        else
        {
            getFragmentManager().popBackStack();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        FragmentManager fm = getFragmentManager();
        int id = item.getItemId();

        if (id == R.id.nav_dept) {
            // Handle the camera action
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new AcademicFragment());
            transaction.addToBackStack("academic");
            transaction.commit();
        } else if (id == R.id.nav_cse) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new FragDeptCse());
            transaction.addToBackStack(null);
            transaction.commit();

        } else if (id == R.id.nav_ise) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new FragDeptIse());
            transaction.addToBackStack(null);
            transaction.commit();


        } else if (id == R.id.nav_ece) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new FragDeptEce());
            transaction.addToBackStack(null);
            transaction.commit();


        } else if (id == R.id.nav_eee) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new FragDeptEee());
            transaction.addToBackStack(null);
            transaction.commit();


        } else if (id == R.id.nav_mech) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new FragDeptMech());
            transaction.addToBackStack(null);
            transaction.commit();


        }else if (id == R.id.nav_civ) {
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame2, new FragDeptCiv());
            transaction.addToBackStack(null);
            transaction.commit();


        }else if (id == R.id.nav_xyz) {

        }else if (id == R.id.nav_abc) {

        }
        else if (id == R.id.nav_back) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
