package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game6 : AppCompatActivity() {
    lateinit var pilihanA6: ImageView
    lateinit var pilihanB6: ImageView
    lateinit var pilihanC6: ImageView
    lateinit var pilihanD6: ImageView
    lateinit var pilihanE6: ImageView
    lateinit var pilihanF6: ImageView
    lateinit var pilihanG6: ImageView
    lateinit var pilihanH6: ImageView
    lateinit var nextGame6: LinearLayout
    var nilai6: Int = 0
    lateinit var statusJawab6: String
    lateinit var namaGame6: String

    lateinit var hasilA6: ImageView
    lateinit var hasilB6: ImageView
    lateinit var hasilC6: ImageView
    lateinit var hasilD6: ImageView
    lateinit var hasilE6: ImageView
    lateinit var hasilF6: ImageView
    lateinit var hasilG6: ImageView
    lateinit var hasilH6: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_6)

        pilihanA6 = findViewById(R.id.pilihanA6)
        pilihanB6 = findViewById(R.id.pilihanB6)
        pilihanC6 = findViewById(R.id.pilihanC6)
        pilihanD6 = findViewById(R.id.pilihanD6)
        pilihanE6 = findViewById(R.id.pilihanE6)
        pilihanF6 = findViewById(R.id.pilihanF6)
        pilihanG6 = findViewById(R.id.pilihanG6)
        pilihanH6 = findViewById(R.id.pilihanH6)
        nextGame6 = findViewById(R.id.nextGame6)

        hasilA6 = findViewById(R.id.hasilA6)
        hasilB6 = findViewById(R.id.hasilB6)
        hasilC6 = findViewById(R.id.hasilC6)
        hasilD6 = findViewById(R.id.hasilD6)
        hasilE6 = findViewById(R.id.hasilE6)
        hasilF6 = findViewById(R.id.hasilF6)
        hasilG6 = findViewById(R.id.hasilG6)
        hasilH6 = findViewById(R.id.hasilH6)

        namaGame6 = intent.getStringExtra("nama").toString()
        statusJawab6 = ""
        pilihanA6.setOnClickListener {
            pilihanA6.scaleY = 1.20f
            pilihanA6.scaleX = 1.30f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 0
            statusJawab6 = "A"
        }
        pilihanB6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.20f
            pilihanB6.scaleX = 1.30f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 0
            statusJawab6 = "B"
        }
        pilihanC6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.20f
            pilihanC6.scaleX = 1.30f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 0
            statusJawab6 = "C"
        }
        pilihanD6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.20f
            pilihanD6.scaleX = 1.30f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 5
            statusJawab6 ="D"
        }
        pilihanE6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.20f
            pilihanE6.scaleX = 1.30f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 0
            statusJawab6 = "E"
        }
        pilihanF6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.20f
            pilihanF6.scaleX = 1.30f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 0
            statusJawab6 = "F"
        }
        pilihanG6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.20f
            pilihanG6.scaleX = 1.30f
            pilihanH6.scaleY = 1.00f
            pilihanH6.scaleX = 1.00f
            nilai6 = 0
            statusJawab6 = "G"
        }
        pilihanH6.setOnClickListener {
            pilihanA6.scaleY = 1.00f
            pilihanA6.scaleX = 1.00f
            pilihanB6.scaleY = 1.00f
            pilihanB6.scaleX = 1.00f
            pilihanC6.scaleY = 1.00f
            pilihanC6.scaleX = 1.00f
            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanE6.scaleY = 1.00f
            pilihanE6.scaleX = 1.00f
            pilihanF6.scaleY = 1.00f
            pilihanF6.scaleX = 1.00f
            pilihanG6.scaleY = 1.00f
            pilihanG6.scaleX = 1.00f
            pilihanH6.scaleY = 1.20f
            pilihanH6.scaleX = 1.30f
            nilai6 = 0
            statusJawab6 = "H"
        }

        nextGame6.setOnClickListener {
            pilihanA6.isClickable = false
            pilihanB6.isClickable = false
            pilihanC6.isClickable = false
            pilihanD6.isClickable = false
            pilihanE6.isClickable = false
            pilihanF6.isClickable = false
            pilihanG6.isClickable = false
            pilihanH6.isClickable = false

            pilihanD6.scaleY = 1.00f
            pilihanD6.scaleX = 1.00f
            pilihanD6.scaleY = 1.20f
            pilihanD6.scaleX = 1.30f
            hasilD6.visibility = View.VISIBLE

            if(statusJawab6 == "A") {
                hasilA6.visibility = View.VISIBLE
            } else if(statusJawab6 == "B") {
                hasilB6.visibility = View.VISIBLE
            } else if(statusJawab6 == "C") {
                hasilC6.visibility = View.VISIBLE
            } else if(statusJawab6 == "E") {
                hasilE6.visibility = View.VISIBLE
            } else if(statusJawab6 == "F") {
                hasilF6.visibility = View.VISIBLE
            } else if(statusJawab6 == "G") {
                hasilG6.visibility = View.VISIBLE
            } else if(statusJawab6 == "H") {
                hasilH6.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("total"))!!.toInt() + nilai6
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game7::class.java)
                        intent.putExtra("nilai", nilai6.toString())
                        intent.putExtra("total", total.toString())
                        intent.putExtra("nama", namaGame6)
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