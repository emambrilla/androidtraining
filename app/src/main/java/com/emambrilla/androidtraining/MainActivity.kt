package com.emambrilla.androidtraining

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Log.d("MainActivity", "OnCreate")
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }

    override fun onStart() {
        super.onStart()
        Log.d( "MainActivity", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d( "MainActivity", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d( "MainActivity", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d( "MainActivity", "OnStop")
    }
}