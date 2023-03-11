package com.example.newsmulti_modualapp.navigation

import com.example.common_utility.Activities
import com.example.common_utility.Navigator
import com.example.news_presentation.GoToNewsActivity
import com.example.search_presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }
            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }
}