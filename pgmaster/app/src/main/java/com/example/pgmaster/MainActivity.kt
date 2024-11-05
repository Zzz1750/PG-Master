package com.example.yourappname // replace with your app package

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.pgmaster.R

class MainActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 3000 // 3 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handler to transition to the content screen after the splash timeout
        Handler().postDelayed({
            val intent = Intent(this, ::class.java) // Change to your content activity
            startActivity(intent)
            finish() // close the splash screen activity
        }, splashTimeOut)
    }
}
