package com.example.edukasianak.isi

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.edukasianak.R
import com.example.edukasianak.utama.Home

class Tentang : AppCompatActivity() {
    lateinit var homeTentang: ImageView
    lateinit var namaUser: String
    var mp = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tentang)

        homeTentang = findViewById(R.id.homeTentang)
        namaUser = intent.getStringExtra("nama").toString()
        homeTentang.setOnClickListener {
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

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        mp = MediaPlayer.create(applicationContext, R.raw.game)
        mp.isLooping = true
        mp.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mp.pause()
    }

    override fun onBackPressed() {}
}