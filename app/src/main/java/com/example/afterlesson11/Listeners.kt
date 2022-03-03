package com.example.afterlesson11

import android.view.View
import androidx.appcompat.app.AppCompatActivity

class GoToActivityListener(
    private val currentActivity: AppCompatActivity,
    private val newActivityClass: Class<*>
) :
    View.OnClickListener {
    override fun onClick(p0: View?) {
        currentActivity.goToAnotherActivity(newActivityClass)
    }

}

