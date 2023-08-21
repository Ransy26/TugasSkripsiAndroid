package com.example.tugasskripsi.util

import android.view.View
import androidx.fragment.app.Fragment
import com.example.tugasskripsi.R
import com.example.tugasskripsi.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.tugasskripsi.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.tugasskripsi.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}