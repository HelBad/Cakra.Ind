package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game13 : AppCompatActivity() {
    lateinit var pilihanA13: ImageView
    lateinit var pilihanB13: ImageView
    lateinit var pilihanC13: ImageView
    lateinit var pilihanD13: ImageView
    lateinit var pilihanE13: ImageView
    lateinit var pilihanF13: ImageView
    lateinit var pilihanG13: ImageView
    lateinit var pilihanH13: ImageView
    lateinit var nextGame13: LinearLayout
    var nilai13: Int = 0
    lateinit var statusJawab13: String
    lateinit var namaGame13: String

    lateinit var hasilA13: ImageView
    lateinit var hasilB13: ImageView
    lateinit var hasilC13: ImageView
    lateinit var hasilD13: ImageView
    lateinit var hasilE13: ImageView
    lateinit var hasilF13: ImageView
    lateinit var hasilG13: ImageView
    lateinit var hasilH13: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_13)

        pilihanA13 = findViewById(R.id.pilihanA13)
        pilihanB13 = findViewById(R.id.pilihanB13)
        pilihanC13 = findViewById(R.id.pilihanC13)
        pilihanD13 = findViewById(R.id.pilihanD13)
        pilihanE13 = findViewById(R.id.pilihanE13)
        pilihanF13 = findViewById(R.id.pilihanF13)
        pilihanG13 = findViewById(R.id.pilihanG13)
        pilihanH13 = findViewById(R.id.pilihanH13)
        nextGame13 = findViewById(R.id.nextGame13)

        hasilA13 = findViewById(R.id.hasilA13)
        hasilB13 = findViewById(R.id.hasilB13)
        hasilC13 = findViewById(R.id.hasilC13)
        hasilD13 = findViewById(R.id.hasilD13)
        hasilE13 = findViewById(R.id.hasilE13)
        hasilF13 = findViewById(R.id.hasilF13)
        hasilG13 = findViewById(R.id.hasilG13)
        hasilH13 = findViewById(R.id.hasilH13)

        namaGame13 = intent.getStringExtra("nama").toString()
        statusJawab13 = ""
        pilihanA13.setOnClickListener {
            pilihanA13.scaleY = 1.20f
            pilihanA13.scaleX = 1.30f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 0
            statusJawab13 = "A"
        }
        pilihanB13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.20f
            pilihanB13.scaleX = 1.30f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 0
            statusJawab13 = "B"
        }
        pilihanC13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.20f
            pilihanC13.scaleX = 1.30f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 0
            statusJawab13 = "C"
        }
        pilihanD13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.20f
            pilihanD13.scaleX = 1.30f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 5
            statusJawab13 ="D"
        }
        pilihanE13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.20f
            pilihanE13.scaleX = 1.30f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 0
            statusJawab13 = "E"
        }
        pilihanF13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.20f
            pilihanF13.scaleX = 1.30f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 0
            statusJawab13 = "F"
        }
        pilihanG13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.20f
            pilihanG13.scaleX = 1.30f
            pilihanH13.scaleY = 1.00f
            pilihanH13.scaleX = 1.00f
            nilai13 = 0
            statusJawab13 = "G"
        }
        pilihanH13.setOnClickListener {
            pilihanA13.scaleY = 1.00f
            pilihanA13.scaleX = 1.00f
            pilihanB13.scaleY = 1.00f
            pilihanB13.scaleX = 1.00f
            pilihanC13.scaleY = 1.00f
            pilihanC13.scaleX = 1.00f
            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanE13.scaleY = 1.00f
            pilihanE13.scaleX = 1.00f
            pilihanF13.scaleY = 1.00f
            pilihanF13.scaleX = 1.00f
            pilihanG13.scaleY = 1.00f
            pilihanG13.scaleX = 1.00f
            pilihanH13.scaleY = 1.20f
            pilihanH13.scaleX = 1.30f
            nilai13 = 0
            statusJawab13 = "H"
        }

        nextGame13.setOnClickListener {
            pilihanA13.isClickable = false
            pilihanB13.isClickable = false
            pilihanC13.isClickable = false
            pilihanD13.isClickable = false
            pilihanE13.isClickable = false
            pilihanF13.isClickable = false
            pilihanG13.isClickable = false
            pilihanH13.isClickable = false

            pilihanD13.scaleY = 1.00f
            pilihanD13.scaleX = 1.00f
            pilihanD13.scaleY = 1.20f
            pilihanD13.scaleX = 1.30f
            hasilD13.visibility = View.VISIBLE

            if(statusJawab13 == "A") {
                hasilA13.visibility = View.VISIBLE
            } else if(statusJawab13 == "B") {
                hasilB13.visibility = View.VISIBLE
            } else if(statusJawab13 == "C") {
                hasilC13.visibility = View.VISIBLE
            } else if(statusJawab13 == "E") {
                hasilE13.visibility = View.VISIBLE
            } else if(statusJawab13 == "F") {
                hasilF13.visibility = View.VISIBLE
            } else if(statusJawab13 == "G") {
                hasilG13.visibility = View.VISIBLE
            } else if(statusJawab13 == "H") {
                hasilH13.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai13
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai13
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game14::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame13)
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