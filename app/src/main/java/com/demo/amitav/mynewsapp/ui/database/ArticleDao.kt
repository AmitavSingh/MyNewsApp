package com.demo.amitav.mynewsapp.ui.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.demo.amitav.mynewsapp.ui.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}