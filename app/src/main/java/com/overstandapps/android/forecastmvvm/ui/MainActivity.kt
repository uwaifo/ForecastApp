package com.overstandapps.android.forecastmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.overstandapps.android.forecastmvvm.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //TODO 1. Declare a NavController variable
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO Setup toolbar so we can have support for back/up botton bellow in onSupportNavigateUp function
        setSupportActionBar(toolbar)

        //TODO 2. initiate the navController by pointing it to the (only) nav_host_fragment of the main_activity layout file
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        //TODO Tie menu layout with navController
        bottom_nav.setupWithNavController(navController)
        //TODO
        NavigationUI.setupActionBarWithNavController(this,navController)
    }


//TODO. Override onSupportNavigateUp
    override fun onSupportNavigateUp(): Boolean {
        //return super.onSupportNavigateUp()
        return NavigationUI.navigateUp(null, navController)
    }
}


