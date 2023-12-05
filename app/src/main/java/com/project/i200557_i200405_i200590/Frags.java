package com.project.i200557_i200405_i200590;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;
import android.widget.Toolbar;


import com.project.i200557_i200405_i200590.databinding.ActivityFragsBinding;

public class Frags extends AppCompatActivity {

    ActivityFragsBinding binding;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Toast.makeText(this, "Helloooooo", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        binding= ActivityFragsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        replaceFragment(new TimelineFragment());
        binding.bottomNavigationView.setBackground(null);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.timeline) {
                //showToast("Timeline Fragment selected");
                replaceFragment(new TimelineFragment());

                return true;
            }
            else if (id==R.id.itinerary) {
                //showToast("Itinerary Fragment selected");
                replaceFragment(new ItineraryFragment());
                return  true;
            }

            else if (id==R.id.add) {
                //showToast("Add Fragment selected");
                replaceFragment(new AddFragment());
                return  true;
            }
            else if (id==R.id.calendar) {
                replaceFragment(new CalendarFragment());
                return  true;
            }
            else if (id==R.id.map) {
                replaceFragment(new MapFragment());

                return  true;
            }
            return true;
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }


    private void replaceFragment(Fragment fragment) {


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);

        return true;
    }
}