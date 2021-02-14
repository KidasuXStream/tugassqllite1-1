package com.kidasu.tugassqllite1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var userDBHelper: DBHelper

    lateinit var lltampil: LinearLayout
    lateinit var tampil: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        userDBHelper = DBHelper(this)
        tampil = findViewById(R.id.tampil_semua)
        lltampil = findViewById(R.id.ll_tampil)
        var tampilkan = userDBHelper.fullData()
//       lltampil.removeAllViews()
        tampilkan.forEach {
            tampil.text = tampil.text.toString() + " " + it.email.toString() + " - "  + it.nama.toString() + " - "  +
                    it.alamat.toString() + " - "  + it.jk.toString() + " - "  + it.telepon.toString() + "\n"
//            lltampil.addView(tampil)
        }
        val btnback : Button = findViewById(R.id.btn_back)
        btnback.setOnClickListener{
        val intent = Intent (this, MainActivity::class.java)
        startActivity(intent)
        }

    }

}