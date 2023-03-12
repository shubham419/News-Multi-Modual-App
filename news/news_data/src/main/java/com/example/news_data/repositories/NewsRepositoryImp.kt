package com.example.news_data.repositories

import com.example.news_data.mapper.toDomainArticle
import com.example.news_data.network.ServiceApi
import com.example.news_domain.model.Article
import com.example.news_domain.repositories.NewsRepository

class NewsRepositoryImp(private val serviceApi: ServiceApi): NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return serviceApi.getArticle().articles.map { it.toDomainArticle() }
    }
}