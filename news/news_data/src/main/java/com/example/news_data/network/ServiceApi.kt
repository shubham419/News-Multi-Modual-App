package com.example.news_data.network

import com.example.common_utility.Constant
import com.example.news_data.model.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceApi {

    // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=86742d2bfda444f788711767be765879

    @GET("top-headlines")
    suspend fun getArticle(
        @Query("country") country: String = Constant.COUNTRY,
        @Query("category") category: String = Constant.CATEGORIES,
        @Query("apiKey") apiKey: String = Constant.API_KEY
    ): NewsResponse

}