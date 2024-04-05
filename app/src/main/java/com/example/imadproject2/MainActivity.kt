package com.example.imadproject2

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView
        setupRecyclerView()

        // Set click listener for the button
        // This should be placed inside onCreate() or a method that is called from onCreate()


            val textInput = findViewById<EditText>(R.id.NumberBar2)
            val text = textInput.text.toString().toIntOrNull()
            val message = when (text) {
                in 0..9 -> "Nelson Mandela"
                in 10..19 -> "Martin Luther King Jr."
                in 20..29 -> "Does this test work?"
                else -> "Number is out of range, select a number between 0 and 100"
            }
            // You should have a TextView with ID textView2 to set the message
            val textView = findViewById<TextView>(R.id.textView2)
            textView.text = message
        }
    }

    private fun setupRecyclerView() {
        // Additional code for setting up RecyclerView goes here
        // You should have a RecyclerView with ID recyclerView in your layout
    }

