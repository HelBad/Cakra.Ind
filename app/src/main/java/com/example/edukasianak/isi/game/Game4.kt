package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game4 : AppCompatActivity() {
    lateinit var pilihanA4: ImageView
    lateinit var pilihanB4: ImageView
    lateinit var pilihanC4: ImageView
    lateinit var pilihanD4: ImageView
    lateinit var pilihanE4: ImageView
    lateinit var pilihanF4: ImageView
    lateinit var pilihanG4: ImageView
    lateinit var pilihanH4: ImageView
    lateinit var nextGame4: LinearLayout
    var nilai4: Int = 0
    lateinit var statusJawab4: String
    lateinit var namaGame4: String

    lateinit var hasilA4: ImageView
    lateinit var hasilB4: ImageView
    lateinit var hasilC4: ImageView
    lateinit var hasilD4: ImageView
    lateinit var hasilE4: ImageView
    lateinit var hasilF4: ImageView
    lateinit var hasilG4: ImageView
    lateinit var hasilH4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_4)

        pilihanA4 = findViewById(R.id.pilihanA4)
        pilihanB4 = findViewById(R.id.pilihanB4)
        pilihanC4 = findViewById(R.id.pilihanC4)
        pilihanD4 = findViewById(R.id.pilihanD4)
        pilihanE4 = findViewById(R.id.pilihanE4)
        pilihanF4 = findViewById(R.id.pilihanF4)
        pilihanG4 = findViewById(R.id.pilihanG4)
        pilihanH4 = findViewById(R.id.pilihanH4)
        nextGame4 = findViewById(R.id.nextGame4)

        hasilA4 = findViewById(R.id.hasilA4)
        hasilB4 = findViewById(R.id.hasilB4)
        hasilC4 = findViewById(R.id.hasilC4)
        hasilD4 = findViewById(R.id.hasilD4)
        hasilE4 = findViewById(R.id.hasilE4)
        hasilF4 = findViewById(R.id.hasilF4)
        hasilG4 = findViewById(R.id.hasilG4)
        hasilH4 = findViewById(R.id.hasilH4)

        namaGame4 = intent.getStringExtra("nama").toString()
        statusJawab4 = ""
        pilihanA4.setOnClickListener {
            pilihanA4.scaleY = 1.20f
            pilihanA4.scaleX = 1.30f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 0
            statusJawab4 = "A"
        }
        pilihanB4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.20f
            pilihanB4.scaleX = 1.30f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 5
            statusJawab4 = "B"
        }
        pilihanC4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.20f
            pilihanC4.scaleX = 1.30f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 0
            statusJawab4 = "C"
        }
        pilihanD4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.20f
            pilihanD4.scaleX = 1.30f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 0
            statusJawab4 ="D"
        }
        pilihanE4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.20f
            pilihanE4.scaleX = 1.30f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 0
            statusJawab4 = "E"
        }
        pilihanF4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.20f
            pilihanF4.scaleX = 1.30f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 0
            statusJawab4 = "F"
        }
        pilihanG4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.20f
            pilihanG4.scaleX = 1.30f
            pilihanH4.scaleY = 1.00f
            pilihanH4.scaleX = 1.00f
            nilai4 = 0
            statusJawab4 = "G"
        }
        pilihanH4.setOnClickListener {
            pilihanA4.scaleY = 1.00f
            pilihanA4.scaleX = 1.00f
            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanC4.scaleY = 1.00f
            pilihanC4.scaleX = 1.00f
            pilihanD4.scaleY = 1.00f
            pilihanD4.scaleX = 1.00f
            pilihanE4.scaleY = 1.00f
            pilihanE4.scaleX = 1.00f
            pilihanF4.scaleY = 1.00f
            pilihanF4.scaleX = 1.00f
            pilihanG4.scaleY = 1.00f
            pilihanG4.scaleX = 1.00f
            pilihanH4.scaleY = 1.20f
            pilihanH4.scaleX = 1.30f
            nilai4 = 0
            statusJawab4 = "H"
        }

        nextGame4.setOnClickListener {
            pilihanA4.isClickable = false
            pilihanB4.isClickable = false
            pilihanC4.isClickable = false
            pilihanD4.isClickable = false
            pilihanE4.isClickable = false
            pilihanF4.isClickable = false
            pilihanG4.isClickable = false
            pilihanH4.isClickable = false

            pilihanB4.scaleY = 1.00f
            pilihanB4.scaleX = 1.00f
            pilihanB4.scaleY = 1.20f
            pilihanB4.scaleX = 1.30f
            hasilB4.visibility = View.VISIBLE

            if(statusJawab4 == "A") {
                hasilA4.visibility = View.VISIBLE
            } else if(statusJawab4 == "C") {
                hasilC4.visibility = View.VISIBLE
            } else if(statusJawab4 == "D") {
                hasilD4.visibility = View.VISIBLE
            } else if(statusJawab4 == "E") {
                hasilE4.visibility = View.VISIBLE
            } else if(statusJawab4 == "F") {
                hasilF4.visibility = View.VISIBLE
            } else if(statusJawab4 == "G") {
                hasilG4.visibility = View.VISIBLE
            } else if(statusJawab4 == "H") {
                hasilH4.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("nilai"))!!.toInt() + nilai4
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game5::class.java)
                        intent.putExtra("nilai", total.toString())
                        intent.putExtra("nama", namaGame4)
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