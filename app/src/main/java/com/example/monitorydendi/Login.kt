package com.example.monitorydendi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonClick = findViewById<Button>(R.id.button_masuk)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Bio::class.java)
            startActivity(intent)
        }
    }
}