package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game5 : AppCompatActivity() {
    lateinit var pilihanA5: ImageView
    lateinit var pilihanB5: ImageView
    lateinit var pilihanC5: ImageView
    lateinit var pilihanD5: ImageView
    lateinit var pilihanE5: ImageView
    lateinit var pilihanF5: ImageView
    lateinit var pilihanG5: ImageView
    lateinit var pilihanH5: ImageView
    lateinit var nextGame5: LinearLayout
    var nilai5: Int = 0
    lateinit var statusJawab5: String
    lateinit var namaGame5: String

    lateinit var hasilA5: ImageView
    lateinit var hasilB5: ImageView
    lateinit var hasilC5: ImageView
    lateinit var hasilD5: ImageView
    lateinit var hasilE5: ImageView
    lateinit var hasilF5: ImageView
    lateinit var hasilG5: ImageView
    lateinit var hasilH5: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_5)

        pilihanA5 = findViewById(R.id.pilihanA5)
        pilihanB5 = findViewById(R.id.pilihanB5)
        pilihanC5 = findViewById(R.id.pilihanC5)
        pilihanD5 = findViewById(R.id.pilihanD5)
        pilihanE5 = findViewById(R.id.pilihanE5)
        pilihanF5 = findViewById(R.id.pilihanF5)
        pilihanG5 = findViewById(R.id.pilihanG5)
        pilihanH5 = findViewById(R.id.pilihanH5)
        nextGame5 = findViewById(R.id.nextGame5)

        hasilA5 = findViewById(R.id.hasilA5)
        hasilB5 = findViewById(R.id.hasilB5)
        hasilC5 = findViewById(R.id.hasilC5)
        hasilD5 = findViewById(R.id.hasilD5)
        hasilE5 = findViewById(R.id.hasilE5)
        hasilF5 = findViewById(R.id.hasilF5)
        hasilG5 = findViewById(R.id.hasilG5)
        hasilH5 = findViewById(R.id.hasilH5)

        namaGame5 = intent.getStringExtra("nama").toString()
        statusJawab5 = ""
        pilihanA5.setOnClickListener {
            pilihanA5.scaleY = 1.20f
            pilihanA5.scaleX = 1.30f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 = "A"
        }
        pilihanB5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.20f
            pilihanB5.scaleX = 1.30f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 = "B"
        }
        pilihanC5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.20f
            pilihanC5.scaleX = 1.30f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 = "C"
        }
        pilihanD5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.20f
            pilihanD5.scaleX = 1.30f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 ="D"
        }
        pilihanE5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.20f
            pilihanE5.scaleX = 1.30f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 = "E"
        }
        pilihanF5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.20f
            pilihanF5.scaleX = 1.30f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 = "F"
        }
        pilihanG5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.20f
            pilihanG5.scaleX = 1.30f
            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            nilai5 = 0
            statusJawab5 = "G"
        }
        pilihanH5.setOnClickListener {
            pilihanA5.scaleY = 1.00f
            pilihanA5.scaleX = 1.00f
            pilihanB5.scaleY = 1.00f
            pilihanB5.scaleX = 1.00f
            pilihanC5.scaleY = 1.00f
            pilihanC5.scaleX = 1.00f
            pilihanD5.scaleY = 1.00f
            pilihanD5.scaleX = 1.00f
            pilihanE5.scaleY = 1.00f
            pilihanE5.scaleX = 1.00f
            pilihanF5.scaleY = 1.00f
            pilihanF5.scaleX = 1.00f
            pilihanG5.scaleY = 1.00f
            pilihanG5.scaleX = 1.00f
            pilihanH5.scaleY = 1.20f
            pilihanH5.scaleX = 1.30f
            nilai5 = 5
            statusJawab5 = "H"
        }

        nextGame5.setOnClickListener {
            pilihanA5.isClickable = false
            pilihanB5.isClickable = false
            pilihanC5.isClickable = false
            pilihanD5.isClickable = false
            pilihanE5.isClickable = false
            pilihanF5.isClickable = false
            pilihanG5.isClickable = false
            pilihanH5.isClickable = false

            pilihanH5.scaleY = 1.00f
            pilihanH5.scaleX = 1.00f
            pilihanH5.scaleY = 1.20f
            pilihanH5.scaleX = 1.30f
            hasilH5.visibility = View.VISIBLE

            if(statusJawab5 == "A") {
                hasilA5.visibility = View.VISIBLE
            } else if(statusJawab5 == "B") {
                hasilB5.visibility = View.VISIBLE
            } else if(statusJawab5 == "C") {
                hasilC5.visibility = View.VISIBLE
            } else if(statusJawab5 == "D") {
                hasilD5.visibility = View.VISIBLE
            } else if(statusJawab5 == "E") {
                hasilE5.visibility = View.VISIBLE
            } else if(statusJawab5 == "F") {
                hasilF5.visibility = View.VISIBLE
            } else if(statusJawab5 == "G") {
                hasilG5.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("nilai"))!!.toInt() + nilai5
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Skor1::class.java)
                        intent.putExtra("nilai", total.toString())
                        intent.putExtra("nama", namaGame5)
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