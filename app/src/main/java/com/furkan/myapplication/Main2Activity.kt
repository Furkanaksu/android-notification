package com.furkan.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)


        button2.setOnClickListener {
            NotificationCenter.defaultCenter()
                .postNotification("buttonClick")
            finish()
        }

        button3.setOnClickListener {
            NotificationCenter.defaultCenter()
                .postNotification("buttonClick2")
            finish()
        }
    }
}
