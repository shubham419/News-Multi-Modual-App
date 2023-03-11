package com.example.common_utility

import android.app.Activity

interface Navigator {

    fun navigator(activity: Activity)

    interface Provider {
        fun getActivities(activities: Activities) : Navigator
    }

}