package com.example.edukasianak.isi.sejarah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.edukasianak.R

class Sejarah2 : AppCompatActivity() {
    lateinit var nextSejarah2: ImageView
    lateinit var backSejarah2: ImageView
    lateinit var namaSejarah2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sejarah_2)

        nextSejarah2 = findViewById(R.id.nextSejarah2)
        backSejarah2 = findViewById(R.id.backSejarah2)

        namaSejarah2 = intent.getStringExtra("nama").toString()
        nextSejarah2.setOnClickListener {
            val intent = Intent(this, Sejarah3::class.java)
            intent.putExtra("nama", namaSejarah2)
            startActivity(intent)
            finish()
        }
        backSejarah2.setOnClickListener {
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