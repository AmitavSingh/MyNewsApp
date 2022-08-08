package com.demo.amitav.mynewsapp.ui.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.demo.amitav.mynewsapp.R
import com.demo.amitav.mynewsapp.ui.database.ArticleDatabase
import com.demo.amitav.mynewsapp.ui.repository.NewsRepository
import com.demo.amitav.mynewsapp.ui.ui.viewmodels.NewsViewModel
import com.demo.amitav.mynewsapp.ui.ui.viewmodels.NewsViewModelProviderFactory
import kotlinx.android.synthetic.main.activity_news.*


class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)



        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.newsNavHostFragment) as NavHostFragment?
        val navController = navHostFragment!!.navController
        bottomNavigationView.setupWithNavController(navController = navController)

        val database = ArticleDatabase(this)
        val newsRepository = NewsRepository(db = database)
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)


    }
}