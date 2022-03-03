package com.example.afterlesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afterlesson11.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle(R.string.tv_text_the_second_screen_of_the_app)

        binding.btnGoToFirstLayout.setOnClickListener(
            GoToActivityListener(
                currentActivity = this,
                newActivityClass = MainActivity::class.java
            )
        )

        binding.btnGoToThirdLayout.setOnClickListener(
            GoToActivityListener(
                currentActivity = this,
                newActivityClass = ThirdActivity::class.java
            )
        )
    }
}