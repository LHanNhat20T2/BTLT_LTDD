package com.example.bttonghoplt;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Nav_barActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_barparent);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_NavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MainActivity()).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment= null;
                switch (item.getItemId()){
                    case R.id.action_home:
                        selectedFragment= new MainActivity();
                        break;
                    case R.id.action_profile:
                        selectedFragment= new ProfileFragment();
                        break;
                    case R.id.action_order:
                        selectedFragment= new HorseFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                return true;
            }
        });
    }
}