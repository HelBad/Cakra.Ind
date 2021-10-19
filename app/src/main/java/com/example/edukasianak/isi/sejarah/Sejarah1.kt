package com.example.edukasianak.isi.sejarah

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.edukasianak.R

class Sejarah1 : AppCompatActivity() {
    lateinit var nextSejarah1: ImageView
    lateinit var namaSejarah1: String
    var mp = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sejarah_1)

        nextSejarah1 = findViewById(R.id.nextSejarah1)
        namaSejarah1 = intent.getStringExtra("nama").toString()
        nextSejarah1.setOnClickListener {
            val intent = Intent(this, Sejarah2::class.java)
            intent.putExtra("nama", namaSejarah1)
            startActivity(intent)
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