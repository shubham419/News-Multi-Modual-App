package com.example.news_domain.repositories

import com.example.news_domain.model.Article

interface NewsRepository {
    suspend fun getNewsArticle(): List<Article>
}