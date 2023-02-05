package com.example.mymaven101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sunday.appendItNow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        "aakar shrestha".appendItNow()
    }
}