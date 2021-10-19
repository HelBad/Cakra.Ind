package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.edukasianak.R

class Skor3 : AppCompatActivity() {
    lateinit var namaSkor3: TextView
    lateinit var nilaiSkor3: TextView
    lateinit var nextSkor3: LinearLayout
    lateinit var namaUser: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skor_3)

        namaSkor3 = findViewById(R.id.namaSkor3)
        nilaiSkor3 = findViewById(R.id.nilaiSkor3)
        nextSkor3 = findViewById(R.id.nextSkor3)

        namaUser = intent.getStringExtra("nama").toString()
        namaSkor3.text = "Hi, " + intent.getStringExtra("nama")
        nilaiSkor3.text = (intent.getStringExtra("nilai")!!.toInt() * 4).toString()
        val total = (intent.getStringExtra("total"))!!.toInt()

        nextSkor3.setOnClickListener {
            val intent = Intent(this, Game16::class.java)
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