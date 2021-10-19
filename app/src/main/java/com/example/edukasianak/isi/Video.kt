package com.example.edukasianak.isi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import com.example.edukasianak.R
import com.example.edukasianak.utama.Home

class Video : AppCompatActivity() {
    lateinit var videoView: VideoView
    lateinit var backVideo: ImageView
    lateinit var namaVideo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video)

        videoView = findViewById(R.id.videoView)
        backVideo = findViewById(R.id.backVideo)

        namaVideo = intent.getStringExtra("nama").toString()

        backVideo.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            intent.putExtra("nama", namaVideo)
            startActivity(intent)
            finish()
        }

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val videoUri = Uri.parse("android.resource://$packageName/${R.raw.video}")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(videoUri)
        videoView.requestFocus()
        videoView.start()
    }

    override fun onBackPressed() {}
}