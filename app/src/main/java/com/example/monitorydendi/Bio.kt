package com.example.monitorydendi

//NIM               : 10120765
//Nama              : Dendi Rizal Fauzi
//Kelas             : IF-9
//Tgl Pengerjaan    : 29-04-2023 -> tampilan
//Tgl Pengerjaan    : 30-04-2023 -> fungsi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Bio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)

        var btn_next = findViewById<Button>(R.id.next_btn)
        btn_next.setOnClickListener {
            var nama = findViewById<EditText>(R.id.edit_nama);
            var umur = findViewById<EditText>(R.id.edit_umur);
            if(nama.text.isEmpty() || umur.text.isEmpty()){
                Toast.makeText(this@Bio, "Tolong isi datanya ya", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Intent(this, Done::class.java).also {
                it.putExtra("nama", nama.text.toString())
                it.putExtra("umur", umur.text.toString())
                startActivity(it)
            }
        }
    }
}