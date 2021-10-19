package com.example.edukasianak.isi.game

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game1 : AppCompatActivity() {
    lateinit var pilihanA1: ImageView
    lateinit var pilihanB1: ImageView
    lateinit var pilihanC1: ImageView
    lateinit var pilihanD1: ImageView
    lateinit var pilihanE1: ImageView
    lateinit var pilihanF1: ImageView
    lateinit var pilihanG1: ImageView
    lateinit var pilihanH1: ImageView
    lateinit var nextGame1: LinearLayout
    var nilai1: Int = 0
    lateinit var statusJawab1: String
    lateinit var namaGame1: String
    var mp = MediaPlayer()

    lateinit var hasilA1: ImageView
    lateinit var hasilB1: ImageView
    lateinit var hasilC1: ImageView
    lateinit var hasilD1: ImageView
    lateinit var hasilE1: ImageView
    lateinit var hasilF1: ImageView
    lateinit var hasilG1: ImageView
    lateinit var hasilH1: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_1)

        pilihanA1 = findViewById(R.id.pilihanA1)
        pilihanB1 = findViewById(R.id.pilihanB1)
        pilihanC1 = findViewById(R.id.pilihanC1)
        pilihanD1 = findViewById(R.id.pilihanD1)
        pilihanE1 = findViewById(R.id.pilihanE1)
        pilihanF1 = findViewById(R.id.pilihanF1)
        pilihanG1 = findViewById(R.id.pilihanG1)
        pilihanH1 = findViewById(R.id.pilihanH1)
        nextGame1 = findViewById(R.id.nextGame1)

        hasilA1 = findViewById(R.id.hasilA1)
        hasilB1 = findViewById(R.id.hasilB1)
        hasilC1 = findViewById(R.id.hasilC1)
        hasilD1 = findViewById(R.id.hasilD1)
        hasilE1 = findViewById(R.id.hasilE1)
        hasilF1 = findViewById(R.id.hasilF1)
        hasilG1 = findViewById(R.id.hasilG1)
        hasilH1 = findViewById(R.id.hasilH1)

        namaGame1 = intent.getStringExtra("nama").toString()
        statusJawab1 = ""
        pilihanA1.setOnClickListener {
            pilihanA1.scaleY = 1.20f
            pilihanA1.scaleX = 1.30f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 0
            statusJawab1 = "A"
        }
        pilihanB1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.20f
            pilihanB1.scaleX = 1.30f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 0
            statusJawab1 = "B"
        }
        pilihanC1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.20f
            pilihanC1.scaleX = 1.30f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 0
            statusJawab1 = "C"
        }
        pilihanD1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.20f
            pilihanD1.scaleX = 1.30f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 5
            statusJawab1 ="D"
        }
        pilihanE1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.20f
            pilihanE1.scaleX = 1.30f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 0
            statusJawab1 = "E"
        }
        pilihanF1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.20f
            pilihanF1.scaleX = 1.30f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 0
            statusJawab1 = "F"
        }
        pilihanG1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.20f
            pilihanG1.scaleX = 1.30f
            pilihanH1.scaleY = 1.00f
            pilihanH1.scaleX = 1.00f
            nilai1 = 0
            statusJawab1 = "G"
        }
        pilihanH1.setOnClickListener {
            pilihanA1.scaleY = 1.00f
            pilihanA1.scaleX = 1.00f
            pilihanB1.scaleY = 1.00f
            pilihanB1.scaleX = 1.00f
            pilihanC1.scaleY = 1.00f
            pilihanC1.scaleX = 1.00f
            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanE1.scaleY = 1.00f
            pilihanE1.scaleX = 1.00f
            pilihanF1.scaleY = 1.00f
            pilihanF1.scaleX = 1.00f
            pilihanG1.scaleY = 1.00f
            pilihanG1.scaleX = 1.00f
            pilihanH1.scaleY = 1.20f
            pilihanH1.scaleX = 1.30f
            nilai1 = 0
            statusJawab1 = "H"
        }

        nextGame1.setOnClickListener {
            pilihanA1.isClickable = false
            pilihanB1.isClickable = false
            pilihanC1.isClickable = false
            pilihanD1.isClickable = false
            pilihanE1.isClickable = false
            pilihanF1.isClickable = false
            pilihanG1.isClickable = false
            pilihanH1.isClickable = false

            pilihanD1.scaleY = 1.00f
            pilihanD1.scaleX = 1.00f
            pilihanD1.scaleY = 1.20f
            pilihanD1.scaleX = 1.30f
            hasilD1.visibility = View.VISIBLE

            if(statusJawab1 == "A") {
                hasilA1.visibility = View.VISIBLE
            } else if(statusJawab1 == "B") {
                hasilB1.visibility = View.VISIBLE
            } else if(statusJawab1 == "C") {
                hasilC1.visibility = View.VISIBLE
            } else if(statusJawab1 == "E") {
                hasilE1.visibility = View.VISIBLE
            } else if(statusJawab1 == "F") {
                hasilF1.visibility = View.VISIBLE
            } else if(statusJawab1 == "G") {
                hasilG1.visibility = View.VISIBLE
            } else if(statusJawab1 == "H") {
                hasilH1.visibility = View.VISIBLE
            }

            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game2::class.java)
                        intent.putExtra("nilai", nilai1.toString())
                        intent.putExtra("nama", namaGame1)
                        startActivity(intent)
                    } catch (e: Exception){
                        e.printStackTrace()
                    }
                }
            }
            background.start()
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