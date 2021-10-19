package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game8 : AppCompatActivity() {
    lateinit var pilihanA8: ImageView
    lateinit var pilihanB8: ImageView
    lateinit var pilihanC8: ImageView
    lateinit var pilihanD8: ImageView
    lateinit var pilihanE8: ImageView
    lateinit var pilihanF8: ImageView
    lateinit var pilihanG8: ImageView
    lateinit var pilihanH8: ImageView
    lateinit var nextGame8: LinearLayout
    var nilai8: Int = 0
    lateinit var statusJawab8: String
    lateinit var namaGame8: String

    lateinit var hasilA8: ImageView
    lateinit var hasilB8: ImageView
    lateinit var hasilC8: ImageView
    lateinit var hasilD8: ImageView
    lateinit var hasilE8: ImageView
    lateinit var hasilF8: ImageView
    lateinit var hasilG8: ImageView
    lateinit var hasilH8: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_8)

        pilihanA8 = findViewById(R.id.pilihanA8)
        pilihanB8 = findViewById(R.id.pilihanB8)
        pilihanC8 = findViewById(R.id.pilihanC8)
        pilihanD8 = findViewById(R.id.pilihanD8)
        pilihanE8 = findViewById(R.id.pilihanE8)
        pilihanF8 = findViewById(R.id.pilihanF8)
        pilihanG8 = findViewById(R.id.pilihanG8)
        pilihanH8 = findViewById(R.id.pilihanH8)
        nextGame8 = findViewById(R.id.nextGame8)

        hasilA8 = findViewById(R.id.hasilA8)
        hasilB8 = findViewById(R.id.hasilB8)
        hasilC8 = findViewById(R.id.hasilC8)
        hasilD8 = findViewById(R.id.hasilD8)
        hasilE8 = findViewById(R.id.hasilE8)
        hasilF8 = findViewById(R.id.hasilF8)
        hasilG8 = findViewById(R.id.hasilG8)
        hasilH8 = findViewById(R.id.hasilH8)

        namaGame8 = intent.getStringExtra("nama").toString()
        statusJawab8 = ""
        pilihanA8.setOnClickListener {
            pilihanA8.scaleY = 1.20f
            pilihanA8.scaleX = 1.30f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 0
            statusJawab8 = "A"
        }
        pilihanB8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.20f
            pilihanB8.scaleX = 1.30f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 0
            statusJawab8 = "B"
        }
        pilihanC8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.20f
            pilihanC8.scaleX = 1.30f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 5
            statusJawab8 = "C"
        }
        pilihanD8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.20f
            pilihanD8.scaleX = 1.30f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 0
            statusJawab8 ="D"
        }
        pilihanE8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.20f
            pilihanE8.scaleX = 1.30f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 0
            statusJawab8 = "E"
        }
        pilihanF8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.20f
            pilihanF8.scaleX = 1.30f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 0
            statusJawab8 = "F"
        }
        pilihanG8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.20f
            pilihanG8.scaleX = 1.30f
            pilihanH8.scaleY = 1.00f
            pilihanH8.scaleX = 1.00f
            nilai8 = 0
            statusJawab8 = "G"
        }
        pilihanH8.setOnClickListener {
            pilihanA8.scaleY = 1.00f
            pilihanA8.scaleX = 1.00f
            pilihanB8.scaleY = 1.00f
            pilihanB8.scaleX = 1.00f
            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanD8.scaleY = 1.00f
            pilihanD8.scaleX = 1.00f
            pilihanE8.scaleY = 1.00f
            pilihanE8.scaleX = 1.00f
            pilihanF8.scaleY = 1.00f
            pilihanF8.scaleX = 1.00f
            pilihanG8.scaleY = 1.00f
            pilihanG8.scaleX = 1.00f
            pilihanH8.scaleY = 1.20f
            pilihanH8.scaleX = 1.30f
            nilai8 = 0
            statusJawab8 = "H"
        }

        nextGame8.setOnClickListener {
            pilihanA8.isClickable = false
            pilihanB8.isClickable = false
            pilihanC8.isClickable = false
            pilihanD8.isClickable = false
            pilihanE8.isClickable = false
            pilihanF8.isClickable = false
            pilihanG8.isClickable = false
            pilihanH8.isClickable = false

            pilihanC8.scaleY = 1.00f
            pilihanC8.scaleX = 1.00f
            pilihanC8.scaleY = 1.20f
            pilihanC8.scaleX = 1.30f
            hasilC8.visibility = View.VISIBLE

            if(statusJawab8 == "A") {
                hasilA8.visibility = View.VISIBLE
            } else if(statusJawab8 == "B") {
                hasilB8.visibility = View.VISIBLE
            } else if(statusJawab8 == "D") {
                hasilD8.visibility = View.VISIBLE
            } else if(statusJawab8 == "E") {
                hasilE8.visibility = View.VISIBLE
            } else if(statusJawab8 == "F") {
                hasilF8.visibility = View.VISIBLE
            } else if(statusJawab8 == "G") {
                hasilG8.visibility = View.VISIBLE
            } else if(statusJawab8 == "H") {
                hasilH8.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai8
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai8
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game9::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame8)
                        startActivity(intent)
                        finish()
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

    override fun onBackPressed() {}
}