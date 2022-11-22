package com.example.mathtrainer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        startMainActivity()
    }

    private fun startMainActivity() {
        Thread.sleep(1000)
        startActivity(Intent(this, MainActivity::class.java))
    }
}