package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Secondactivity: MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val decreaseButton = findViewById<Button>(R.id.button_dec)
        val back = findViewById<Button>(R.id.button)
        var message2 = intent.getStringExtra("text").toString().toInt()
        findViewById<TextView>(R.id.textView2).text= message2.toString()
        decreaseButton.setOnClickListener{
            message2--
            findViewById<TextView>(R.id.textView2).text = message2.toString()
        }
        back.setOnClickListener {
            val backIntent = Intent(this, MainActivity::class.java)
            backIntent.putExtra("secActivity","$message2")
            backIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(backIntent)
            finish()

        }
    }
    }
