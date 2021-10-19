package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game15 : AppCompatActivity() {
    lateinit var pilihanA15: ImageView
    lateinit var pilihanB15: ImageView
    lateinit var pilihanC15: ImageView
    lateinit var pilihanD15: ImageView
    lateinit var pilihanE15: ImageView
    lateinit var pilihanF15: ImageView
    lateinit var pilihanG15: ImageView
    lateinit var pilihanH15: ImageView
    lateinit var nextGame15: LinearLayout
    var nilai15: Int = 0
    lateinit var statusJawab15: String
    lateinit var namaGame15: String

    lateinit var hasilA15: ImageView
    lateinit var hasilB15: ImageView
    lateinit var hasilC15: ImageView
    lateinit var hasilD15: ImageView
    lateinit var hasilE15: ImageView
    lateinit var hasilF15: ImageView
    lateinit var hasilG15: ImageView
    lateinit var hasilH15: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_15)

        pilihanA15 = findViewById(R.id.pilihanA15)
        pilihanB15 = findViewById(R.id.pilihanB15)
        pilihanC15 = findViewById(R.id.pilihanC15)
        pilihanD15 = findViewById(R.id.pilihanD15)
        pilihanE15 = findViewById(R.id.pilihanE15)
        pilihanF15 = findViewById(R.id.pilihanF15)
        pilihanG15 = findViewById(R.id.pilihanG15)
        pilihanH15 = findViewById(R.id.pilihanH15)
        nextGame15 = findViewById(R.id.nextGame15)

        hasilA15 = findViewById(R.id.hasilA15)
        hasilB15 = findViewById(R.id.hasilB15)
        hasilC15 = findViewById(R.id.hasilC15)
        hasilD15 = findViewById(R.id.hasilD15)
        hasilE15 = findViewById(R.id.hasilE15)
        hasilF15 = findViewById(R.id.hasilF15)
        hasilG15 = findViewById(R.id.hasilG15)
        hasilH15 = findViewById(R.id.hasilH15)

        namaGame15 = intent.getStringExtra("nama").toString()
        statusJawab15 = ""
        pilihanA15.setOnClickListener {
            pilihanA15.scaleY = 1.20f
            pilihanA15.scaleX = 1.30f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 0
            statusJawab15 = "A"
        }
        pilihanB15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.20f
            pilihanB15.scaleX = 1.30f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 5
            statusJawab15 = "B"
        }
        pilihanC15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.20f
            pilihanC15.scaleX = 1.30f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 0
            statusJawab15 = "C"
        }
        pilihanD15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.20f
            pilihanD15.scaleX = 1.30f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 0
            statusJawab15 ="D"
        }
        pilihanE15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.20f
            pilihanE15.scaleX = 1.30f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 0
            statusJawab15 = "E"
        }
        pilihanF15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.20f
            pilihanF15.scaleX = 1.30f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 0
            statusJawab15 = "F"
        }
        pilihanG15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.20f
            pilihanG15.scaleX = 1.30f
            pilihanH15.scaleY = 1.00f
            pilihanH15.scaleX = 1.00f
            nilai15 = 0
            statusJawab15 = "G"
        }
        pilihanH15.setOnClickListener {
            pilihanA15.scaleY = 1.00f
            pilihanA15.scaleX = 1.00f
            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanC15.scaleY = 1.00f
            pilihanC15.scaleX = 1.00f
            pilihanD15.scaleY = 1.00f
            pilihanD15.scaleX = 1.00f
            pilihanE15.scaleY = 1.00f
            pilihanE15.scaleX = 1.00f
            pilihanF15.scaleY = 1.00f
            pilihanF15.scaleX = 1.00f
            pilihanG15.scaleY = 1.00f
            pilihanG15.scaleX = 1.00f
            pilihanH15.scaleY = 1.20f
            pilihanH15.scaleX = 1.30f
            nilai15 = 0
            statusJawab15 = "H"
        }

        nextGame15.setOnClickListener {
            pilihanA15.isClickable = false
            pilihanB15.isClickable = false
            pilihanC15.isClickable = false
            pilihanD15.isClickable = false
            pilihanE15.isClickable = false
            pilihanF15.isClickable = false
            pilihanG15.isClickable = false
            pilihanH15.isClickable = false

            pilihanB15.scaleY = 1.00f
            pilihanB15.scaleX = 1.00f
            pilihanB15.scaleY = 1.20f
            pilihanB15.scaleX = 1.30f
            hasilB15.visibility = View.VISIBLE

            if(statusJawab15 == "A") {
                hasilA15.visibility = View.VISIBLE
            } else if(statusJawab15 == "C") {
                hasilC15.visibility = View.VISIBLE
            } else if(statusJawab15 == "D") {
                hasilD15.visibility = View.VISIBLE
            } else if(statusJawab15 == "E") {
                hasilE15.visibility = View.VISIBLE
            } else if(statusJawab15 == "F") {
                hasilF15.visibility = View.VISIBLE
            } else if(statusJawab15 == "G") {
                hasilG15.visibility = View.VISIBLE
            } else if(statusJawab15 == "H") {
                hasilH15.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai15
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai15
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Skor3::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame15)
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