package com.citech.vanka_sangashetty.proto1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.citech.vanka_sangashetty.proto1.fragment.AcademicFragment;
import com.citech.vanka_sangashetty.proto1.fragment.AchieveFragment;
import com.citech.vanka_sangashetty.proto1.fragment.ContactFragment;
import com.citech.vanka_sangashetty.proto1.fragment.DevFragment;
import com.citech.vanka_sangashetty.proto1.fragment.HomeFragment;
import com.citech.vanka_sangashetty.proto1.fragment.RadFragment;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

int hm=0;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private HomeFragment webFragment;
    private WebView mWebView;
    private int layoutID;
   // private AchieveFragment myweb;
   // private RadFragment radweb;
    //private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hm == 0) {
                    hm = 1;
                    layoutID=R.layout.fragment_dev;

                    FragmentManager fm = getFragmentManager();

                    FragmentTransaction transaction = fm.beginTransaction();
                    transaction.replace(R.id.content_frame, new DevFragment());
                    transaction.addToBackStack(null);
                    transaction.commit();

                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                }
                else
                {
                    hm=0;
                    onBackPressed();
                }
            }

        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        webFragment = new HomeFragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.content_frame, webFragment);
        transaction.addToBackStack("home");
        transaction.commit();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        layoutID=R.layout.fragment_home;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        int count = getFragmentManager().getBackStackEntryCount();


        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (count == 1) {
            super.onBackPressed();
            //additional code
        } else {
            getFragmentManager().popBackStack();
        }

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        // Check if the key event was the Back button and if there's history
        if(layoutID == R.layout.fragment_achieve ) {
            mWebView = (WebView) findViewById(R.id.achieve_frag);
            if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {

                mWebView.goBack();
                return true;
            }
        }
        if(layoutID == R.layout.fragment_rad ) {
            mWebView = (WebView) findViewById(R.id.rad_frag);
            if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
                mWebView.goBack();
                return true;
            }
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.nav_home) {
            // Handle the camera action
            layoutID=R.layout.fragment_home;
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame, new HomeFragment());
            transaction.addToBackStack(null);
            transaction.commit();

        } else if (id == R.id.nav_academic) {
            Intent intent = new Intent(this, Main3Activity.class);
            startActivity(intent);

        } else if (id == R.id.nav_achievements) {
             layoutID = R.layout.fragment_achieve;
             FragmentTransaction transaction = fm.beginTransaction();
             transaction.replace(R.id.content_frame, new AchieveFragment());
             transaction.addToBackStack(null);
             transaction.commit();
            //myweb = new AchieveFragment();
           // myweb.OpenPage("file:///android_asset/www/achievements.html");

        } else if (id == R.id.nav_rad) {
            layoutID = R.layout.fragment_rad;
            FragmentTransaction transaction = fm.beginTransaction();
           transaction.replace(R.id.content_frame, new RadFragment());
            transaction.addToBackStack(null);
            transaction.commit();

           // radweb = new RadFragment();
           // radweb.OpenPage("file:///android_asset/www/RandD.html");
        } else if (id == R.id.nav_faculty) {
            Intent intent = new Intent(this, Main4Activity.class);
            startActivity(intent);
        }  else if (id == R.id.nav_locate) {
            if(isNetworkAvailable()==false)
            {
                Toast.makeText(getApplicationContext(), "Connect to Internet",
                        Toast.LENGTH_LONG).show();
            }
            else
            {
               Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Basavanapura+Main+Road,+Krishnarajapuram,+Cambridge+Institute+Of+Technology,+Bengaluru,+Karnataka+560036,+India/@13.011149,77.7041259,17z/data=!4m2!3m1!1s0x3bae11abe40fb245:0xfa7afc82d4a141f4?hl=en"));
                                browserIntent.setPackage("com.google.android.apps.maps");

                                startActivity(browserIntent);


            }

        } else if (id == R.id.nav_contact) {
            layoutID=R.layout.fragment_contact;
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame, new ContactFragment());
            transaction.addToBackStack(null);
            transaction.commit();

        } else if (id == R.id.nav_dev){
            layoutID=R.layout.fragment_dev;
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.content_frame, new DevFragment());
            transaction.addToBackStack(null);
            transaction.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.citech.vanka_sangashetty.proto1/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.citech.vanka_sangashetty.proto1/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
