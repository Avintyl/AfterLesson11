package com.example.afterlesson11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afterlesson11.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle(R.string.tv_text_the_third_screen_of_the_app)

        binding.btnGoToFirstLayout.setOnClickListener(
            GoToActivityListener(
                currentActivity = this,
                newActivityClass = MainActivity::class.java
            )
        )

        binding.btnGoToSecondLayout.setOnClickListener(
            GoToActivityListener(
                currentActivity = this,
                newActivityClass = SecondActivity::class.java
            )
        )
    }
}