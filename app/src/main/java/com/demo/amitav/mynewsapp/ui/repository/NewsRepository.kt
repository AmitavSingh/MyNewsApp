package com.demo.amitav.mynewsapp.ui.repository

import com.demo.amitav.mynewsapp.ui.api.RetrofitInstance


class NewsRepository() {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}