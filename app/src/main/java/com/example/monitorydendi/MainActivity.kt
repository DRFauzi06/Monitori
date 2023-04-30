package com.example.monitorydendi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//NIM               : 10120765
//Nama              : Dendi Rizal Fauzi
//Kelas             : IF-9
//Tgl Pengerjaan    : 29-04-2023 -> tampilan
//Tgl Pengerjaan    : 30-04-2023 -> fungsi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClick = findViewById<Button>(R.id.button_mulai)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}