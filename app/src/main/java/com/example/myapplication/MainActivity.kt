package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var counter = 0
        val myTex = findViewById<TextView>(R.id.textView)
        val increaseButton = findViewById<Button>(R.id.button_inc)
        val newAct = findViewById<Button>(R.id.button_sec)
        increaseButton.setOnClickListener {
            counter++
            myTex.text = counter.toString()
        }
        newAct.setOnClickListener {
            val message = myTex.text
            val intent = Intent(this, Secondactivity::class.java)
            intent.putExtra("text","$message")
            startActivity(intent)

        }

        val getSec = intent.getStringExtra("secActivity")
        findViewById<TextView>(R.id.textView).text= getSec.toString()

    }
}
