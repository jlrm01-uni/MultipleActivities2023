package com.example.multipleactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            finish()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}