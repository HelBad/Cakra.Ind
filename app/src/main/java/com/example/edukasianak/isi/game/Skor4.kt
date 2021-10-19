package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.edukasianak.R

class Skor4 : AppCompatActivity() {
    lateinit var namaSkor4: TextView
    lateinit var nilaiSkor4: TextView
    lateinit var nextSkor4: LinearLayout
    lateinit var namaUser: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skor_4)

        namaSkor4 = findViewById(R.id.namaSkor4)
        nilaiSkor4 = findViewById(R.id.nilaiSkor4)
        nextSkor4 = findViewById(R.id.nextSkor4)

        namaUser = intent.getStringExtra("nama").toString()
        namaSkor4.text = "Hi, " + intent.getStringExtra("nama")
        nilaiSkor4.text = (intent.getStringExtra("nilai")!!.toInt() * 4).toString()
        val total = (intent.getStringExtra("total"))!!.toInt()

        nextSkor4.setOnClickListener {
            val intent = Intent(this, Hasil::class.java)
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