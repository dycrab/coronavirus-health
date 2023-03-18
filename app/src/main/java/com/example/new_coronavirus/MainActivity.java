package com.example.new_coronavirus;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    long prePressed=0;//第一次点击
    long lastPressed=0;//第二次点击
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //去掉顶部标题
//        getSupportActionBar().hide();
////去掉最上面时间、电量等
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
//                , WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

//    public void onBackPressed(){
//        super.onBackPressed();
//        lastPressed= System.currentTimeMillis();
//        if(lastPressed-prePressed>1000){
//            //把第一次点击获得的时间赋值给第二次
//            prePressed=lastPressed;
//            Toast.makeText(this, "再按一次返回键，退出程序", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this, "qweqwe", Toast.LENGTH_LONG).show();
////            finish();
////            System.exit(0);
//        }
//
//    }
}
