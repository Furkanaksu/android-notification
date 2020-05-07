package com.furkan.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeAdapter
import com.ernestoyaquello.dragdropswiperecyclerview.DragDropSwipeRecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NotificationCenter.defaultCenter()
            .addFucntionForNotification("buttonClick",
                Runnable {
                    Toast.makeText(this, "Hello There", Toast.LENGTH_LONG).show()
                })


        NotificationCenter.defaultCenter()
            .addFucntionForNotification("buttonClick2",
                Runnable {
                    Toast.makeText(this, "Hello There2", Toast.LENGTH_LONG).show()
                })

        val button  = findViewById<Button>(R.id.button)

        button.setOnClickListener {

            val intent = Intent(this,Main2Activity::class.java)
            startActivity(intent)

        }

    }

}