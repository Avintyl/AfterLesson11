package com.example.afterlesson11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

fun AppCompatActivity.goToAnotherActivity(anotherActivityClass: Class<*>) {
    val intent = Intent(this, anotherActivityClass)
    this.startActivity(intent, null)
}