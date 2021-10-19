package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.edukasianak.R

class Skor1 : AppCompatActivity() {
    lateinit var namaSkor1: TextView
    lateinit var nilaiSkor1: TextView
    lateinit var nextSkor1: LinearLayout
    lateinit var namaUser: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skor_1)

        namaSkor1 = findViewById(R.id.namaSkor1)
        nilaiSkor1 = findViewById(R.id.nilaiSkor1)
        nextSkor1 = findViewById(R.id.nextSkor1)

        namaUser = intent.getStringExtra("nama").toString()
        namaSkor1.text = "Hi, " + intent.getStringExtra("nama")
        nilaiSkor1.text = (intent.getStringExtra("nilai")!!.toInt() * 4).toString()
        val total = (intent.getStringExtra("nilai"))!!.toInt()

        nextSkor1.setOnClickListener {
            val intent = Intent(this, Game6::class.java)
            intent.putExtra("total", total.toString())
            intent.putExtra("nama", namaUser)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        this.window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
    }

    override fun onBackPressed() {}
}