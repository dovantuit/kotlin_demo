package com.example.demo_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // hide title bar
        window.requestFeature(Window.FEATURE_NO_TITLE)
        // make activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        // time to splash
        Handler().postDelayed({
            // start login activity
            startActivities(arrayOf(Intent(this@MainActivity, LoginActivity::class.java)))
            finish()
        },1000)
    }
}
