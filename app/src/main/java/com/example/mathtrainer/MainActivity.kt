package com.example.mathtrainer

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvFirstArg: TextView
    private lateinit var tvMathSign: TextView
    private lateinit var tvSecondArg: TextView
    private lateinit var tvEqualSign: TextView
    private lateinit var etResult: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvFirstArg = findViewById(R.id.tvFirstArg)
        tvMathSign = findViewById(R.id.tvMathSign)
        tvSecondArg = findViewById(R.id.tvSecondArg)
        tvEqualSign = findViewById(R.id.tvEqualSign)
        etResult = findViewById(R.id.etResult)

        buildExercise()
//        getResult()
    }

    private fun buildExercise() {
        val firstArg = (0 until 2).random()
        val secondArg = (0 until 10).random()

        tvFirstArg.text = firstArg.toString()
        tvMathSign.text = "X"
        tvSecondArg.text = secondArg.toString()
        tvEqualSign.text = "="
    }

    private fun getResult() {
        val myResult = etResult.text.toString().toInt()
        val result = tvFirstArg.text.toString().toInt() * tvSecondArg.text.toString().toInt()
        if (myResult == result) {
            tvFirstArg.text = (0 until 2).random().toString()
            tvSecondArg.text = (0 until 10).random().toString()
        }
    }
}