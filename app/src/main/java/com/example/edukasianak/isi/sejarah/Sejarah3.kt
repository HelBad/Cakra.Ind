package com.example.edukasianak.isi.sejarah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.edukasianak.R
import com.example.edukasianak.utama.Home

class Sejarah3 : AppCompatActivity() {
    lateinit var homeSejarah3: ImageView
    lateinit var backSejarah3: ImageView
    lateinit var namaSejarah3: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sejarah_3)

        homeSejarah3 = findViewById(R.id.homeSejarah3)
        backSejarah3 = findViewById(R.id.backSejarah3)

        namaSejarah3 = intent.getStringExtra("nama").toString()
        homeSejarah3.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            intent.putExtra("nama", namaSejarah3)
            startActivity(intent)
            finishAffinity()
        }
        backSejarah3.setOnClickListener {
            val intent = Intent(this, Sejarah2::class.java)
            intent.putExtra("nama", namaSejarah3)
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