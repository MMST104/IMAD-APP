package com.example.imadproject2

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Set click listener for the button
        val textInput = findViewById<EditText>(R.id.NumberBar2)
        val textView = findViewById<TextView>(R.id.textView2)

        textInput.setOnEditorActionListener { _, _, _ ->
            val text = textInput.text.toString().toIntOrNull()
            val message: String = if (text != null) {
                if (text in 0..9) {
                    "Nelson Mandela"
                } else if (text in 10..19) {
                    "Martin Luther King Jr."
                } else if (text in 20..29) {
                    "Does this test work?"
                } else {
                    "Number is out of range, select a number between 0 and 100"
                }
            } else {
                "Invalid input, please enter a number"
            }
            textView.text = message
            true
        }
    }

}