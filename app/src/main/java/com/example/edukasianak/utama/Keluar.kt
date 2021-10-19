package com.example.edukasianak.utama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import com.example.edukasianak.R

class Keluar : AppCompatActivity() {
    lateinit var namaKeluar: TextView
    lateinit var yesKeluar: RelativeLayout
    lateinit var noKeluar: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keluar)

        namaKeluar = findViewById(R.id.namaKeluar)
        yesKeluar = findViewById(R.id.yesKeluar)
        noKeluar = findViewById(R.id.noKeluar)

        yesKeluar.setOnClickListener {
            finishAffinity()
        }
        noKeluar.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        this.window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        namaKeluar.text = "Hi, " + intent.getStringExtra("nama") + "..."
    }

    override fun onBackPressed() {}
}