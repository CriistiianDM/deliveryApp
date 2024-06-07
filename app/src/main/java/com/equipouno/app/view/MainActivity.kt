package com.equipouno.app.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Build
import androidx.annotation.RequiresApi
import com.equipouno.app.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}