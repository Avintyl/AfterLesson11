package com.example.afterlesson11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afterlesson11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle(R.string.tv_text_the_first_screen_of_the_app)

        binding.btnGoToSecondLayout.setOnClickListener(
            GoToActivityListener(this, SecondActivity::class.java)
        )

        binding.btnGoToThirdLayout.setOnClickListener(
            GoToActivityListener(this, ThirdActivity::class.java)
        )
    }
}