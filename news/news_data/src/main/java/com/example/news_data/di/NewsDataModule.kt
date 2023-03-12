package com.example.news_data.di

import com.example.news_data.network.ServiceApi
import com.example.news_data.repositories.NewsRepositoryImp
import com.example.news_domain.repositories.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit


@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {

    @Provides
    fun provideServiceApi(retrofit: Retrofit) : ServiceApi{
        return retrofit.create(ServiceApi::class.java)
    }

    @Provides
    fun provideNewsRepository(serviceApi: ServiceApi): NewsRepository{
        return NewsRepositoryImp(serviceApi)
    }

}