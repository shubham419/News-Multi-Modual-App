package com.example.news_domain.use_case

import com.example.common_utility.Resource
import com.example.news_domain.model.Article
import com.example.news_domain.repositories.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetNewsArticleUseCase(private val newsRepository: NewsRepository) {

    operator fun invoke() : Flow<Resource<List<Article>>> = flow{
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = newsRepository.getNewsArticle()))
        }catch (e: java.lang.Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}