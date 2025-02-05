package com.example.imaware;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class our_app extends AppCompatActivity {
    BottomNavigationView bnview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_app);
        bnview=findViewById(R.id.bottombar);
        bnview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id == R.id.contact_us) {
                    loadfrag(new help_contact(), false);

                } else if (id == R.id.profile) {
                    loadfrag(new profile_fragment(), false);

                } else if (id == R.id.community) {
                    loadfrag(new community_fragment(), false);

                } else if(id==R.id.homs) {
                    loadfrag(new home_fragment(), false);
                }
                return true;

            }
        });
    }
    public void loadfrag(Fragment fragment, boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag){
            ft.add(R.id.container,fragment);
        }
        else{
            ft.replace(R.id.container,fragment);
        }
        ft.commit();

    }
}