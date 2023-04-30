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