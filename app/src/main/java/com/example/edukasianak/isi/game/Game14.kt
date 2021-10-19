package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game14 : AppCompatActivity() {
    lateinit var pilihanA14: ImageView
    lateinit var pilihanB14: ImageView
    lateinit var pilihanC14: ImageView
    lateinit var pilihanD14: ImageView
    lateinit var pilihanE14: ImageView
    lateinit var pilihanF14: ImageView
    lateinit var pilihanG14: ImageView
    lateinit var pilihanH14: ImageView
    lateinit var nextGame14: LinearLayout
    var nilai14: Int = 0
    lateinit var statusJawab14: String
    lateinit var namaGame14: String

    lateinit var hasilA14: ImageView
    lateinit var hasilB14: ImageView
    lateinit var hasilC14: ImageView
    lateinit var hasilD14: ImageView
    lateinit var hasilE14: ImageView
    lateinit var hasilF14: ImageView
    lateinit var hasilG14: ImageView
    lateinit var hasilH14: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_14)

        pilihanA14 = findViewById(R.id.pilihanA14)
        pilihanB14 = findViewById(R.id.pilihanB14)
        pilihanC14 = findViewById(R.id.pilihanC14)
        pilihanD14 = findViewById(R.id.pilihanD14)
        pilihanE14 = findViewById(R.id.pilihanE14)
        pilihanF14 = findViewById(R.id.pilihanF14)
        pilihanG14 = findViewById(R.id.pilihanG14)
        pilihanH14 = findViewById(R.id.pilihanH14)
        nextGame14 = findViewById(R.id.nextGame14)

        hasilA14 = findViewById(R.id.hasilA14)
        hasilB14 = findViewById(R.id.hasilB14)
        hasilC14 = findViewById(R.id.hasilC14)
        hasilD14 = findViewById(R.id.hasilD14)
        hasilE14 = findViewById(R.id.hasilE14)
        hasilF14 = findViewById(R.id.hasilF14)
        hasilG14 = findViewById(R.id.hasilG14)
        hasilH14 = findViewById(R.id.hasilH14)

        namaGame14 = intent.getStringExtra("nama").toString()
        statusJawab14 = ""
        pilihanA14.setOnClickListener {
            pilihanA14.scaleY = 1.20f
            pilihanA14.scaleX = 1.30f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 0
            statusJawab14 = "A"
        }
        pilihanB14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.20f
            pilihanB14.scaleX = 1.30f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 5
            statusJawab14 = "B"
        }
        pilihanC14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.20f
            pilihanC14.scaleX = 1.30f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 0
            statusJawab14 = "C"
        }
        pilihanD14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.20f
            pilihanD14.scaleX = 1.30f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 0
            statusJawab14 ="D"
        }
        pilihanE14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.20f
            pilihanE14.scaleX = 1.30f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 0
            statusJawab14 = "E"
        }
        pilihanF14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.20f
            pilihanF14.scaleX = 1.30f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 0
            statusJawab14 = "F"
        }
        pilihanG14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.20f
            pilihanG14.scaleX = 1.30f
            pilihanH14.scaleY = 1.00f
            pilihanH14.scaleX = 1.00f
            nilai14 = 0
            statusJawab14 = "G"
        }
        pilihanH14.setOnClickListener {
            pilihanA14.scaleY = 1.00f
            pilihanA14.scaleX = 1.00f
            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanC14.scaleY = 1.00f
            pilihanC14.scaleX = 1.00f
            pilihanD14.scaleY = 1.00f
            pilihanD14.scaleX = 1.00f
            pilihanE14.scaleY = 1.00f
            pilihanE14.scaleX = 1.00f
            pilihanF14.scaleY = 1.00f
            pilihanF14.scaleX = 1.00f
            pilihanG14.scaleY = 1.00f
            pilihanG14.scaleX = 1.00f
            pilihanH14.scaleY = 1.20f
            pilihanH14.scaleX = 1.30f
            nilai14 = 0
            statusJawab14 = "H"
        }

        nextGame14.setOnClickListener {
            pilihanA14.isClickable = false
            pilihanB14.isClickable = false
            pilihanC14.isClickable = false
            pilihanD14.isClickable = false
            pilihanE14.isClickable = false
            pilihanF14.isClickable = false
            pilihanG14.isClickable = false
            pilihanH14.isClickable = false

            pilihanB14.scaleY = 1.00f
            pilihanB14.scaleX = 1.00f
            pilihanB14.scaleY = 1.20f
            pilihanB14.scaleX = 1.30f
            hasilB14.visibility = View.VISIBLE

            if(statusJawab14 == "A") {
                hasilA14.visibility = View.VISIBLE
            } else if(statusJawab14 == "C") {
                hasilC14.visibility = View.VISIBLE
            } else if(statusJawab14 == "D") {
                hasilD14.visibility = View.VISIBLE
            } else if(statusJawab14 == "E") {
                hasilE14.visibility = View.VISIBLE
            } else if(statusJawab14 == "F") {
                hasilF14.visibility = View.VISIBLE
            } else if(statusJawab14 == "G") {
                hasilG14.visibility = View.VISIBLE
            } else if(statusJawab14 == "H") {
                hasilH14.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai14
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai14
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game15::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame14)
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