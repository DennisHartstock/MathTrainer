package com.example.mathtrainer

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var tvExample: TextView
    private lateinit var etAnswer: EditText
    private lateinit var btCheckAnswer: Button
    private var firstArg: Int = 0
    private var secondArg: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvExample = findViewById(R.id.tvExample)
        etAnswer = findViewById(R.id.etAnswer)
        btCheckAnswer = findViewById(R.id.btCheckAnswer)

        buildExercise()
        btCheckAnswer.setOnClickListener {
            getResult()
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun buildExercise() {
        tvExample.setTextColor(Color.RED)
        firstArg = Random.nextInt(2) + 1
//        firstArg = (0 until 2).random()
        secondArg = Random.nextInt(9) + 1
//        secondArg = (0 until 10).random()
        val example = "$firstArg X $secondArg = ?"
        tvExample.text = example
    }

    private fun getResult() {
        val myResult = etAnswer.text.toString().toInt()
        val result = firstArg * secondArg
        if (myResult == result) {
            tvExample.setTextColor(Color.GREEN)
            Thread.sleep(1000)
            etAnswer.text = null
            buildExercise()
        }
    }
}