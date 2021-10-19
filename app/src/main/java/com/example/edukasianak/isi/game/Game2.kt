package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game2 : AppCompatActivity() {
    lateinit var pilihanA2: ImageView
    lateinit var pilihanB2: ImageView
    lateinit var pilihanC2: ImageView
    lateinit var pilihanD2: ImageView
    lateinit var pilihanE2: ImageView
    lateinit var pilihanF2: ImageView
    lateinit var pilihanG2: ImageView
    lateinit var pilihanH2: ImageView
    lateinit var nextGame2: LinearLayout
    var nilai2: Int = 0
    lateinit var statusJawab2: String
    lateinit var namaGame2: String

    lateinit var hasilA2: ImageView
    lateinit var hasilB2: ImageView
    lateinit var hasilC2: ImageView
    lateinit var hasilD2: ImageView
    lateinit var hasilE2: ImageView
    lateinit var hasilF2: ImageView
    lateinit var hasilG2: ImageView
    lateinit var hasilH2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_2)

        pilihanA2 = findViewById(R.id.pilihanA2)
        pilihanB2 = findViewById(R.id.pilihanB2)
        pilihanC2 = findViewById(R.id.pilihanC2)
        pilihanD2 = findViewById(R.id.pilihanD2)
        pilihanE2 = findViewById(R.id.pilihanE2)
        pilihanF2 = findViewById(R.id.pilihanF2)
        pilihanG2 = findViewById(R.id.pilihanG2)
        pilihanH2 = findViewById(R.id.pilihanH2)
        nextGame2 = findViewById(R.id.nextGame2)

        hasilA2 = findViewById(R.id.hasilA2)
        hasilB2 = findViewById(R.id.hasilB2)
        hasilC2 = findViewById(R.id.hasilC2)
        hasilD2 = findViewById(R.id.hasilD2)
        hasilE2 = findViewById(R.id.hasilE2)
        hasilF2 = findViewById(R.id.hasilF2)
        hasilG2 = findViewById(R.id.hasilG2)
        hasilH2 = findViewById(R.id.hasilH2)

        namaGame2 = intent.getStringExtra("nama").toString()
        statusJawab2 = ""
        pilihanA2.setOnClickListener {
            pilihanA2.scaleY = 1.20f
            pilihanA2.scaleX = 1.30f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 0
            statusJawab2 = "A"
        }
        pilihanB2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.20f
            pilihanB2.scaleX = 1.30f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 0
            statusJawab2 = "B"
        }
        pilihanC2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.20f
            pilihanC2.scaleX = 1.30f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 0
            statusJawab2 = "C"
        }
        pilihanD2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.20f
            pilihanD2.scaleX = 1.30f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 0
            statusJawab2 ="D"
        }
        pilihanE2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.20f
            pilihanE2.scaleX = 1.30f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 0
            statusJawab2 = "E"
        }
        pilihanF2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.20f
            pilihanF2.scaleX = 1.30f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 0
            statusJawab2 = "F"
        }
        pilihanG2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.20f
            pilihanG2.scaleX = 1.30f
            pilihanH2.scaleY = 1.00f
            pilihanH2.scaleX = 1.00f
            nilai2 = 5
            statusJawab2 = "G"
        }
        pilihanH2.setOnClickListener {
            pilihanA2.scaleY = 1.00f
            pilihanA2.scaleX = 1.00f
            pilihanB2.scaleY = 1.00f
            pilihanB2.scaleX = 1.00f
            pilihanC2.scaleY = 1.00f
            pilihanC2.scaleX = 1.00f
            pilihanD2.scaleY = 1.00f
            pilihanD2.scaleX = 1.00f
            pilihanE2.scaleY = 1.00f
            pilihanE2.scaleX = 1.00f
            pilihanF2.scaleY = 1.00f
            pilihanF2.scaleX = 1.00f
            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanH2.scaleY = 1.20f
            pilihanH2.scaleX = 1.30f
            nilai2 = 0
            statusJawab2 = "H"
        }

        nextGame2.setOnClickListener {
            pilihanA2.isClickable = false
            pilihanB2.isClickable = false
            pilihanC2.isClickable = false
            pilihanD2.isClickable = false
            pilihanE2.isClickable = false
            pilihanF2.isClickable = false
            pilihanG2.isClickable = false
            pilihanH2.isClickable = false

            pilihanG2.scaleY = 1.00f
            pilihanG2.scaleX = 1.00f
            pilihanG2.scaleY = 1.20f
            pilihanG2.scaleX = 1.30f
            hasilG2.visibility = View.VISIBLE

            if(statusJawab2 == "A") {
                hasilA2.visibility = View.VISIBLE
            } else if(statusJawab2 == "B") {
                hasilB2.visibility = View.VISIBLE
            } else if(statusJawab2 == "C") {
                hasilC2.visibility = View.VISIBLE
            } else if(statusJawab2 == "D") {
                hasilD2.visibility = View.VISIBLE
            } else if(statusJawab2 == "E") {
                hasilE2.visibility = View.VISIBLE
            } else if(statusJawab2 == "F") {
                hasilF2.visibility = View.VISIBLE
            } else if(statusJawab2 == "H") {
                hasilH2.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("nilai"))!!.toInt() + nilai2
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game3::class.java)
                        intent.putExtra("nilai", total.toString())
                        intent.putExtra("nama", namaGame2)
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