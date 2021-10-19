package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.edukasianak.R
import com.example.edukasianak.utama.Home

class Hasil : AppCompatActivity() {
    lateinit var namaHasil: TextView
    lateinit var nilaiHasil: TextView
    lateinit var exitHasil: ImageView
    lateinit var namaUser: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hasil)

        namaHasil = findViewById(R.id.namaHasil)
        nilaiHasil = findViewById(R.id.nilaiHasil)
        exitHasil = findViewById(R.id.exitHasil)

        namaUser = intent.getStringExtra("nama").toString()
        namaHasil.text = "Hi, " + intent.getStringExtra("nama")
        nilaiHasil.text = intent.getStringExtra("total")
        exitHasil.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            intent.putExtra("nama", namaUser)
            startActivity(intent)
            finishAffinity()
        }
    }

    override fun onStart() {
        super.onStart()
        this.window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
    }

    override fun onBackPressed() {}
}