package com.codewithkyo.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codewithkyo.bottomnavigationview.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Bottom nav
        binding.bottomNavigationview.setOnItemSelectedListener(onNavigationItemSelectedListener)
    }

    private val onNavigationItemSelectedListener =  NavigationBarView.OnItemSelectedListener { item ->
        when (item.itemId) {
            R.id.item1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, Item1Fragment())
                    .commit()
                return@OnItemSelectedListener true
            }
            R.id.item2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, Item2Fragment())
                    .commit()
                return@OnItemSelectedListener true
            }
            R.id.item3 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, Item3Fragment())
                    .commit()
                return@OnItemSelectedListener true
            }
        }
        false
    }
}