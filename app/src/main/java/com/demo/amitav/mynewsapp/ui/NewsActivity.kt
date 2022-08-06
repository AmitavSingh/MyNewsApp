package com.demo.amitav.mynewsapp.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.demo.amitav.mynewsapp.R
import kotlinx.android.synthetic.main.activity_news.*


class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.newsNavHostFragment) as NavHostFragment?
        val navController = navHostFragment!!.navController
        bottomNavigationView.setupWithNavController(navController = navController)

    }
}