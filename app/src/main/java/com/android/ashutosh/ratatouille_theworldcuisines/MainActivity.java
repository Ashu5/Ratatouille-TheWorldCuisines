package com.android.ashutosh.ratatouille_theworldcuisines;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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
        int id = item.getItemId();

        if (id == R.id.nav_home) {
           setFragment(0);
        } else if (id == R.id.nav_account) {
           setFragment(1);
        } else if (id == R.id.nav_arrivals) {
         setFragment(2);
        } else if (id == R.id.nav_fav) {
            setFragment(3);
        } else if (id == R.id.nav_feedback) {
            setFragment(4);
        } else if (id == R.id.nav_setting) {
            setFragment(5);
        } else if (id==R.id.nav_cart){
            setFragment(6);
        }
        else if (id==R.id.nav_timer){
            setFragment(7);
        }
        else if (id==R.id.nav_share){
            setFragment(8);
        }
        else if (id==R.id.nav_send){
            setFragment(9);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void setFragment(int position)
    {
        Fragment fragment=null;
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;

//        if(fragment!=null)
//        {
//            getSupportFragmentManager().beginTransaction().replace(R.id.comtent_main,fragment).commit();
//        }
        switch (position) {
            case 0:
                getSupportFragmentManager().beginTransaction().replace(R.id.comtent_main, new HomeFragment()).addToBackStack(null).commit();

//                fragmentManager = getSupportFragmentManager();
//                fragmentTransaction = fragmentManager.beginTransaction();
//               HomeFragment homeFragment=new HomeFragment();
//                fragmentTransaction.replace(R.id.comtent_main,homeFragment );
//                fragmentTransaction.commit();
                break;
            case 1:
                //fragment= new AccountFragment();
               fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                AccountFragment accountFragment= new AccountFragment();
                fragmentTransaction.replace(R.id.comtent_main,accountFragment );
                fragmentTransaction.commit();
                break;
            case 2:
               // fragment= new NewArrivalFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                NewArrivalFragment newArrivalFragment= new NewArrivalFragment();
                fragmentTransaction.replace(R.id.comtent_main, newArrivalFragment );
                fragmentTransaction.commit();
                break;
            case 3:
               // fragment=new FavouriteFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                FavouriteFragment favouriteFragment= new FavouriteFragment();
                fragmentTransaction.replace(R.id.comtent_main,favouriteFragment );
                fragmentTransaction.commit();
                break;
            case 4:
                //fragment= new FeedbackFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
               FeedbackFragment feedbackFragment= new FeedbackFragment();
                fragmentTransaction.replace(R.id.comtent_main,feedbackFragment );
                fragmentTransaction.commit();
                break;
            case 5:
                //fragment=new SettingFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
               SettingFragment settingFragment= new SettingFragment();
                fragmentTransaction.replace(R.id.comtent_main,settingFragment );
                fragmentTransaction.commit();
                break;
            case 6:
                //fragment=new CartFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
               CartFragment cartFragment= new CartFragment();
               fragmentTransaction.replace(R.id.comtent_main,cartFragment);
               fragmentTransaction.commit();
                break;
            case 7:
                //fragment= new TimerFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                TimerFragment timerFragment= new TimerFragment();
                fragmentTransaction.replace(R.id.comtent_main,timerFragment);
                fragmentTransaction.commit();
                break;
            case 8:
                //fragment=new ShareFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ShareFragment shareFragment= new ShareFragment();
                fragmentTransaction.replace(R.id.comtent_main,shareFragment);
                fragmentTransaction.commit();
                break;
            case 9:
                //fragment= new SendFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
               SendFragment sendFragment= new SendFragment();
                fragmentTransaction.replace(R.id.comtent_main,sendFragment);
                fragmentTransaction.commit();
                break;


    }
    }
}