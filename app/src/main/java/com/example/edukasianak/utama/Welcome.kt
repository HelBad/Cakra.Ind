package com.example.edukasianak.utama

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.example.edukasianak.R

class Welcome : AppCompatActivity() {
    lateinit var textNama: EditText
    lateinit var btnMasuk: ImageView
    lateinit var exitWelcome: ImageView
    var mp = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        textNama = findViewById(R.id.textNama)
        btnMasuk = findViewById(R.id.btnMasuk)
        exitWelcome = findViewById(R.id.exitWelcome)

        btnMasuk.setOnClickListener {
            if(textNama.text.isEmpty()) {
                Toast.makeText(this, "Nama Belum Terisi", Toast.LENGTH_SHORT).show()
            } else if(textNama.text.isNotEmpty()) {
                val intent = Intent(this, Home::class.java)
                intent.putExtra("nama", textNama.text.toString())
                startActivity(intent)
                finish()
            }
        }
        exitWelcome.setOnClickListener {
            if(textNama.text.isEmpty()) {
                Toast.makeText(this, "Nama Belum Terisi", Toast.LENGTH_SHORT).show()
            } else if(textNama.text.isNotEmpty()) {
                val intent = Intent(this, Keluar::class.java)
                intent.putExtra("nama", textNama.text.toString())
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        this.window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        mp = MediaPlayer.create(applicationContext, R.raw.welcome)
        mp.isLooping = true
        mp.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mp.pause()
    }

    override fun onBackPressed() {}
}