package com.example.mathtrainer

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChooseMathOperationActivity : AppCompatActivity() {

    private lateinit var multiplication: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_math_operation)

        multiplication = findViewById(R.id.tvMultiplication)

        multiplication.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}