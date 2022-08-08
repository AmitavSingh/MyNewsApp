package com.demo.amitav.mynewsapp.ui.repository

import com.demo.amitav.mynewsapp.ui.api.RetrofitInstance
import com.demo.amitav.mynewsapp.ui.database.ArticleDatabase
import com.demo.amitav.mynewsapp.ui.models.Article


class NewsRepository(private val db: ArticleDatabase) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().insert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}