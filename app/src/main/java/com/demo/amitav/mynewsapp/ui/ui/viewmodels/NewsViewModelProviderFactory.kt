package com.demo.amitav.mynewsapp.ui.ui.viewmodels

import android.app.Application
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.demo.amitav.mynewsapp.ui.repository.NewsRepository

class NewsViewModelProviderFactory(
    private val application: Application,
    private val newsRepository: NewsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(application = application, newsRepository) as T
    }
}

