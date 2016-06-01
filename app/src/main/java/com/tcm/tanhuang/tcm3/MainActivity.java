package com.tcm.tanhuang.tcm3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String ACTIVITY_TAG="TCM MainActivity";
    private View m_ContentMainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        ImageView imageView = (ImageView)findViewById(R.id.drawer_layout);
//        imageView.setImageResource(R.drawable.caotianmei);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final TextView textShimian = (TextView)findViewById(R.id.BTN_Shimian);
        textShimian.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Shimian pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Shimian");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textKesou = (TextView)findViewById(R.id.BTN_Kesou);
        textKesou.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Kesou pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Kesou");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textBianmi = (TextView)findViewById(R.id.BTN_Bianmi);
        textBianmi.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Bianmi pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Bianmi");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textXiexie = (TextView)findViewById(R.id.BTN_Xiexie);
        textXiexie.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Xiexie pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Xiexie");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textToutong = (TextView)findViewById(R.id.BTN_Toutong);
        textToutong.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Toutong pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Toutong");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textXuanyun = (TextView)findViewById(R.id.BTN_Xuanyun);
        textXuanyun.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Xuanyun pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Xuanyun");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textWeiwantong = (TextView)findViewById(R.id.BTN_Weiwantong);
        textWeiwantong.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Weiwantong pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Weiwantong");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

        final TextView textChangyongfang = (TextView)findViewById(R.id.BTN_Changyongfang);
        textChangyongfang.setOnClickListener(new View.OnClickListener(){
            @Override //监听点击事件
            public void onClick(View v) {
                Log.i(ACTIVITY_TAG,"Button Changyongfang pressed");
                Intent intent = new Intent();
                intent.putExtra("Title","Changyongfang");
                intent.setClass(MainActivity.this, ContentActivity.class);
                startActivity(intent);
            }
        });

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
        if (id == R.id.menu_about) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_YaoXinGe) {
            Intent intent = new Intent();
            intent.putExtra("Title","YaoXinGe");
            intent.setClass(MainActivity.this, ContentActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_ShiBaFan) {
            Intent intent = new Intent();
            intent.putExtra("Title","ShiBaFan");
            intent.setClass(MainActivity.this, ContentActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_Pinhumaixue) {
            Intent intent = new Intent();
            intent.putExtra("Title","Pinhumaixue");
            intent.setClass(MainActivity.this, ContentActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_RenChenJinJi) {
            Intent intent = new Intent();
            intent.putExtra("Title","RenChenJinJi");
            intent.setClass(MainActivity.this, ContentActivity.class);
            startActivity(intent);
        }

//        else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
