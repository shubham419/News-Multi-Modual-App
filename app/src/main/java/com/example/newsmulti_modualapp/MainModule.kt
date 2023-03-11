package com.example.newsmulti_modualapp

import com.example.common_utility.Navigator
import com.example.newsmulti_modualapp.navigation.DefaultNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Provides
    @Singleton
    fun providerProvider(): Navigator.Provider{
        return DefaultNavigator()
    }

}