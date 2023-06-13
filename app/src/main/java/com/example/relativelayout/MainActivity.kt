package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var multiply :Button
    lateinit var minus : Button
    lateinit var plus :  Button
    lateinit var remainder :Button
    lateinit var number :EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        multiply= findViewById(R.id.multiply)
        minus = findViewById(R.id.minus)
        plus =findViewById(R.id.plus)
        remainder=findViewById(R.id.remainder)
        number = findViewById(R.id.number)
       // var number = 0
        number.text = number.toStrin

        multiply.setOnClickListener {
             number *= 2

        }
        minus.setOnClickListener {
            number -= 2
        }
        plus.setOnClickListener {
             number += 2
        }
        remainder.setOnClickListener {
             number %= 2
            remainder.text= number.toString()
        }
    }
}