package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.edukasianak.R

class Skor2 : AppCompatActivity() {
    lateinit var namaSkor2: TextView
    lateinit var nilaiSkor2: TextView
    lateinit var nextSkor2: LinearLayout
    lateinit var namaUser: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skor_2)

        namaSkor2 = findViewById(R.id.namaSkor2)
        nilaiSkor2 = findViewById(R.id.nilaiSkor2)
        nextSkor2 = findViewById(R.id.nextSkor2)

        namaUser = intent.getStringExtra("nama").toString()
        namaSkor2.text = "Hi, " + intent.getStringExtra("nama")
        nilaiSkor2.text = (intent.getStringExtra("nilai")!!.toInt() * 4).toString()
        val total = (intent.getStringExtra("total"))!!.toInt()

        nextSkor2.setOnClickListener {
            val intent = Intent(this, Game11::class.java)
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