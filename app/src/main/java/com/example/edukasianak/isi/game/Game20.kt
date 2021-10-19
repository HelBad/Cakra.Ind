package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game20 : AppCompatActivity() {
    lateinit var pilihanA20: ImageView
    lateinit var pilihanB20: ImageView
    lateinit var pilihanC20: ImageView
    lateinit var pilihanD20: ImageView
    lateinit var pilihanE20: ImageView
    lateinit var pilihanF20: ImageView
    lateinit var pilihanG20: ImageView
    lateinit var pilihanH20: ImageView
    lateinit var nextGame20: LinearLayout
    var nilai20: Int = 0
    lateinit var statusJawab20: String
    lateinit var namaGame20: String

    lateinit var hasilA20: ImageView
    lateinit var hasilB20: ImageView
    lateinit var hasilC20: ImageView
    lateinit var hasilD20: ImageView
    lateinit var hasilE20: ImageView
    lateinit var hasilF20: ImageView
    lateinit var hasilG20: ImageView
    lateinit var hasilH20: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_20)

        pilihanA20 = findViewById(R.id.pilihanA20)
        pilihanB20 = findViewById(R.id.pilihanB20)
        pilihanC20 = findViewById(R.id.pilihanC20)
        pilihanD20 = findViewById(R.id.pilihanD20)
        pilihanE20 = findViewById(R.id.pilihanE20)
        pilihanF20 = findViewById(R.id.pilihanF20)
        pilihanG20 = findViewById(R.id.pilihanG20)
        pilihanH20 = findViewById(R.id.pilihanH20)
        nextGame20 = findViewById(R.id.nextGame20)

        hasilA20 = findViewById(R.id.hasilA20)
        hasilB20 = findViewById(R.id.hasilB20)
        hasilC20 = findViewById(R.id.hasilC20)
        hasilD20 = findViewById(R.id.hasilD20)
        hasilE20 = findViewById(R.id.hasilE20)
        hasilF20 = findViewById(R.id.hasilF20)
        hasilG20 = findViewById(R.id.hasilG20)
        hasilH20 = findViewById(R.id.hasilH20)

        namaGame20 = intent.getStringExtra("nama").toString()
        statusJawab20 = ""
        pilihanA20.setOnClickListener {
            pilihanA20.scaleY = 1.20f
            pilihanA20.scaleX = 1.30f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 5
            statusJawab20 = "A"
        }
        pilihanB20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.20f
            pilihanB20.scaleX = 1.30f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 0
            statusJawab20 = "B"
        }
        pilihanC20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.20f
            pilihanC20.scaleX = 1.30f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 0
            statusJawab20 = "C"
        }
        pilihanD20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.20f
            pilihanD20.scaleX = 1.30f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 0
            statusJawab20 ="D"
        }
        pilihanE20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.20f
            pilihanE20.scaleX = 1.30f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 0
            statusJawab20 = "E"
        }
        pilihanF20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.20f
            pilihanF20.scaleX = 1.30f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 0
            statusJawab20 = "F"
        }
        pilihanG20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.20f
            pilihanG20.scaleX = 1.30f
            pilihanH20.scaleY = 1.00f
            pilihanH20.scaleX = 1.00f
            nilai20 = 0
            statusJawab20 = "G"
        }
        pilihanH20.setOnClickListener {
            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanB20.scaleY = 1.00f
            pilihanB20.scaleX = 1.00f
            pilihanC20.scaleY = 1.00f
            pilihanC20.scaleX = 1.00f
            pilihanD20.scaleY = 1.00f
            pilihanD20.scaleX = 1.00f
            pilihanE20.scaleY = 1.00f
            pilihanE20.scaleX = 1.00f
            pilihanF20.scaleY = 1.00f
            pilihanF20.scaleX = 1.00f
            pilihanG20.scaleY = 1.00f
            pilihanG20.scaleX = 1.00f
            pilihanH20.scaleY = 1.20f
            pilihanH20.scaleX = 1.30f
            nilai20 = 0
            statusJawab20 = "H"
        }

        nextGame20.setOnClickListener {
            pilihanA20.isClickable = false
            pilihanB20.isClickable = false
            pilihanC20.isClickable = false
            pilihanD20.isClickable = false
            pilihanE20.isClickable = false
            pilihanF20.isClickable = false
            pilihanG20.isClickable = false
            pilihanH20.isClickable = false

            pilihanA20.scaleY = 1.00f
            pilihanA20.scaleX = 1.00f
            pilihanA20.scaleY = 1.20f
            pilihanA20.scaleX = 1.30f
            hasilA20.visibility = View.VISIBLE

            if(statusJawab20 == "B") {
                hasilB20.visibility = View.VISIBLE
            } else if(statusJawab20 == "C") {
                hasilC20.visibility = View.VISIBLE
            } else if(statusJawab20 == "D") {
                hasilD20.visibility = View.VISIBLE
            } else if(statusJawab20 == "E") {
                hasilE20.visibility = View.VISIBLE
            } else if(statusJawab20 == "F") {
                hasilF20.visibility = View.VISIBLE
            } else if(statusJawab20 == "G") {
                hasilG20.visibility = View.VISIBLE
            } else if(statusJawab20 == "H") {
                hasilH20.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai20
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai20
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Skor4::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame20)
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