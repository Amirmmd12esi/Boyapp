package com.boyapp

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(30, 30, 30, 30)
            setBackgroundColor(Color.rgb(12, 17, 35))
        }

        val title = TextView(this).apply {
            text = "BOYAPP"
            textSize = 34f
            setTextColor(Color.CYAN)
            gravity = Gravity.CENTER
        }

        val description = TextView(this).apply {
            text = "Welcome to your first Android App!"
            textSize = 17f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val button = Button(this).apply {
            text = "CLICK ME"
        }

        val result = TextView(this).apply {
            text = "Ready..."
            textSize = 18f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        button.setOnClickListener {
            result.text = "Hello! BoyApp is working 🔥"
        }

        layout.addView(title)
        layout.addView(description)
        layout.addView(button)
        layout.addView(result)

        setContentView(layout)
    }
}
