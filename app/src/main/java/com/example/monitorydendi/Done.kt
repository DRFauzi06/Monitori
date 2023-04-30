package com.example.monitorydendi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//NIM               : 10120765
//Nama              : Dendi Rizal Fauzi
//Kelas             : IF-9
//Tgl Pengerjaan    : 29-04-2023 -> tampilan
//Tgl Pengerjaan    : 30-04-2023 -> fungsi

class Done : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

        this.bindExtras()


    }
    private fun bindExtras(){
        var nama = intent.extras?.getString("nama")
        var umur = intent.extras?.getString("umur")
        var tvDone = findViewById<TextView>(R.id.text_beres)
        tvDone.setText("Beres! Sekarang "+ nama + " udah bisa ngecek penggunaan HP " + nama + " tiap hari buat bantu " + nama + " ngatur waktu :D")
    }
}