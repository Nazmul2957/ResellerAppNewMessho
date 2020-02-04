package com.example.resellerappnewmessho;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.smarteist.autoimageslider.SliderView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.view.View;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity {

    SliderView sliderView;

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //  loadfragment(new Fragment_Adapter("home"));

        sliderView = findViewById(R.id.imageSlider);

        ////GRIDVIEW CATAGORY LIST

        BottomNavigationView userview = findViewById(R.id.bottomnav) ;
        NavController navController= Navigation.findNavController(this,R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(userview,navController);



    }

}
