package com.weeidl.gogodag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.app.Activity;
import android.os.Bundle;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    public static ChipNavigationBar chipNavigationBar;
    private Fragment fragment=null;
    public static Activity activity;
    public static FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;

        manager = getSupportFragmentManager();

        fragment = new HomeFragment();
        manager.beginTransaction().replace(R.id.container,fragment).commit();

        chipNavigationBar = findViewById(R.id.chipNavigation);

        chipNavigationBar.setItemSelected(R.id.home, true);

        chipNavigationBar.setOnItemSelectedListener(i -> {
            switch (i){
                case R.id.home:
                    fragment=new HomeFragment();
                    break;
                case R.id.cart:
                    fragment=new HotelFragment();
                    break;
                case R.id.profile:
                    fragment=new ProfileFragment();
                    break;
                case R.id.gid:
                    fragment=new GuideFragment();
                    break;
            }
            if (fragment!=null){
                manager.beginTransaction().replace(R.id.container,fragment).commit();
            }
        });

    }



}