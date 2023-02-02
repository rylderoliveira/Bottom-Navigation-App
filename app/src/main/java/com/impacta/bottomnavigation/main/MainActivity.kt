package com.impacta.bottomnavigation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.impacta.bottomnavigation.R

class MainActivity : AppCompatActivity() {

    private val bottomNavView: BottomNavigationView by lazy {
        findViewById(R.id.bottom_nav_main)
    }
    private val fragmentContainerView: FragmentContainerView by lazy {
        findViewById(R.id.fragment_container_view_main)
    }
    private val homeFragment = HomeFragment()
    private val categoryFragment = CategoryFragment()
    private val musicFragment = MusicFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigateToFragment(homeFragment)
        bottomNavView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_home -> navigateToFragment(homeFragment)
                R.id.item_category -> navigateToFragment(categoryFragment)
                R.id.item_music -> navigateToFragment(musicFragment)
                else -> false
            }
        }
    }

    private fun navigateToFragment(fragment: Fragment) : Boolean {
        supportFragmentManager.beginTransaction().apply {
            replace(fragmentContainerView.id, fragment)
            commit()
        }
        return true
    }
}