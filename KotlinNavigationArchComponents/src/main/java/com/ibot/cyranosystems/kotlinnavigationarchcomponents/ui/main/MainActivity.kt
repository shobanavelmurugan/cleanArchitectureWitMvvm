package com.ibot.cyranosystems.kotlinnavigationarchcomponents.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.navigateUp
import com.ibot.cyranosystems.kotlinnavigationarchcomponents.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        navController=Navigation.findNavController(this,R.id.nav_host_fragment)
        //bottom_nav.setupWithNavController(navController)
        //NavigationUI.setupActionBarWithNavController(this,navController)
        setupBottomNavMenu(navController)
        setupSideNavMenu(navController)
        setupActionBar(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navigateUp(navController,drawer_layout)
    }
    private fun setupBottomNavMenu(navController: NavController){
        bottom_nav?.let {
            NavigationUI.setupWithNavController(it,navController)
        }

    }
    private fun setupSideNavMenu(navController: NavController){
        nav_view?.let {
            NavigationUI.setupWithNavController(it,navController)
        }

    }
    private fun setupActionBar(navController: NavController){
        NavigationUI.setupActionBarWithNavController(this,navController,drawer_layout)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navigated=NavigationUI.onNavDestinationSelected(item!!,navController)
        return navigated || super.onOptionsItemSelected(item)
    }
}
