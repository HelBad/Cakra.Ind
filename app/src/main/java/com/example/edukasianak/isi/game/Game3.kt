package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game3 : AppCompatActivity() {
    lateinit var pilihanA3: ImageView
    lateinit var pilihanB3: ImageView
    lateinit var pilihanC3: ImageView
    lateinit var pilihanD3: ImageView
    lateinit var pilihanE3: ImageView
    lateinit var pilihanF3: ImageView
    lateinit var pilihanG3: ImageView
    lateinit var pilihanH3: ImageView
    lateinit var nextGame3: LinearLayout
    var nilai3: Int = 0
    lateinit var statusJawab3: String
    lateinit var namaGame3: String

    lateinit var hasilA3: ImageView
    lateinit var hasilB3: ImageView
    lateinit var hasilC3: ImageView
    lateinit var hasilD3: ImageView
    lateinit var hasilE3: ImageView
    lateinit var hasilF3: ImageView
    lateinit var hasilG3: ImageView
    lateinit var hasilH3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_3)

        pilihanA3 = findViewById(R.id.pilihanA3)
        pilihanB3 = findViewById(R.id.pilihanB3)
        pilihanC3 = findViewById(R.id.pilihanC3)
        pilihanD3 = findViewById(R.id.pilihanD3)
        pilihanE3 = findViewById(R.id.pilihanE3)
        pilihanF3 = findViewById(R.id.pilihanF3)
        pilihanG3 = findViewById(R.id.pilihanG3)
        pilihanH3 = findViewById(R.id.pilihanH3)
        nextGame3 = findViewById(R.id.nextGame3)

        hasilA3 = findViewById(R.id.hasilA3)
        hasilB3 = findViewById(R.id.hasilB3)
        hasilC3 = findViewById(R.id.hasilC3)
        hasilD3 = findViewById(R.id.hasilD3)
        hasilE3 = findViewById(R.id.hasilE3)
        hasilF3 = findViewById(R.id.hasilF3)
        hasilG3 = findViewById(R.id.hasilG3)
        hasilH3 = findViewById(R.id.hasilH3)

        namaGame3 = intent.getStringExtra("nama").toString()
        statusJawab3 = ""
        pilihanA3.setOnClickListener {
            pilihanA3.scaleY = 1.20f
            pilihanA3.scaleX = 1.30f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 0
            statusJawab3 = "A"
        }
        pilihanB3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.20f
            pilihanB3.scaleX = 1.30f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 0
            statusJawab3 = "B"
        }
        pilihanC3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.20f
            pilihanC3.scaleX = 1.30f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 0
            statusJawab3 = "C"
        }
        pilihanD3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.20f
            pilihanD3.scaleX = 1.30f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 0
            statusJawab3 ="D"
        }
        pilihanE3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.20f
            pilihanE3.scaleX = 1.30f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 5
            statusJawab3 = "E"
        }
        pilihanF3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.20f
            pilihanF3.scaleX = 1.30f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 0
            statusJawab3 = "F"
        }
        pilihanG3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.20f
            pilihanG3.scaleX = 1.30f
            pilihanH3.scaleY = 1.00f
            pilihanH3.scaleX = 1.00f
            nilai3 = 0
            statusJawab3 = "G"
        }
        pilihanH3.setOnClickListener {
            pilihanA3.scaleY = 1.00f
            pilihanA3.scaleX = 1.00f
            pilihanB3.scaleY = 1.00f
            pilihanB3.scaleX = 1.00f
            pilihanC3.scaleY = 1.00f
            pilihanC3.scaleX = 1.00f
            pilihanD3.scaleY = 1.00f
            pilihanD3.scaleX = 1.00f
            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanF3.scaleY = 1.00f
            pilihanF3.scaleX = 1.00f
            pilihanG3.scaleY = 1.00f
            pilihanG3.scaleX = 1.00f
            pilihanH3.scaleY = 1.20f
            pilihanH3.scaleX = 1.30f
            nilai3 = 0
            statusJawab3 = "H"
        }

        nextGame3.setOnClickListener {
            pilihanA3.isClickable = false
            pilihanB3.isClickable = false
            pilihanC3.isClickable = false
            pilihanD3.isClickable = false
            pilihanE3.isClickable = false
            pilihanF3.isClickable = false
            pilihanG3.isClickable = false
            pilihanH3.isClickable = false

            pilihanE3.scaleY = 1.00f
            pilihanE3.scaleX = 1.00f
            pilihanE3.scaleY = 1.20f
            pilihanE3.scaleX = 1.30f
            hasilE3.visibility = View.VISIBLE

            if(statusJawab3 == "A") {
                hasilA3.visibility = View.VISIBLE
            } else if(statusJawab3 == "B") {
                hasilB3.visibility = View.VISIBLE
            } else if(statusJawab3 == "C") {
                hasilC3.visibility = View.VISIBLE
            } else if(statusJawab3 == "D") {
                hasilD3.visibility = View.VISIBLE
            } else if(statusJawab3 == "F") {
                hasilF3.visibility = View.VISIBLE
            } else if(statusJawab3 == "G") {
                hasilG3.visibility = View.VISIBLE
            } else if(statusJawab3 == "H") {
                hasilH3.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("nilai"))!!.toInt() + nilai3
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game4::class.java)
                        intent.putExtra("nilai", total.toString())
                        intent.putExtra("nama", namaGame3)
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