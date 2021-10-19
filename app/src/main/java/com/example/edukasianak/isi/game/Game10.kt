package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game10 : AppCompatActivity() {
    lateinit var pilihanA10: ImageView
    lateinit var pilihanB10: ImageView
    lateinit var pilihanC10: ImageView
    lateinit var pilihanD10: ImageView
    lateinit var pilihanE10: ImageView
    lateinit var pilihanF10: ImageView
    lateinit var pilihanG10: ImageView
    lateinit var pilihanH10: ImageView
    lateinit var nextGame10: LinearLayout
    var nilai10: Int = 0
    lateinit var statusJawab10: String
    lateinit var namaGame10: String

    lateinit var hasilA10: ImageView
    lateinit var hasilB10: ImageView
    lateinit var hasilC10: ImageView
    lateinit var hasilD10: ImageView
    lateinit var hasilE10: ImageView
    lateinit var hasilF10: ImageView
    lateinit var hasilG10: ImageView
    lateinit var hasilH10: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_10)

        pilihanA10 = findViewById(R.id.pilihanA10)
        pilihanB10 = findViewById(R.id.pilihanB10)
        pilihanC10 = findViewById(R.id.pilihanC10)
        pilihanD10 = findViewById(R.id.pilihanD10)
        pilihanE10 = findViewById(R.id.pilihanE10)
        pilihanF10 = findViewById(R.id.pilihanF10)
        pilihanG10 = findViewById(R.id.pilihanG10)
        pilihanH10 = findViewById(R.id.pilihanH10)
        nextGame10 = findViewById(R.id.nextGame10)

        hasilA10 = findViewById(R.id.hasilA10)
        hasilB10 = findViewById(R.id.hasilB10)
        hasilC10 = findViewById(R.id.hasilC10)
        hasilD10 = findViewById(R.id.hasilD10)
        hasilE10 = findViewById(R.id.hasilE10)
        hasilF10 = findViewById(R.id.hasilF10)
        hasilG10 = findViewById(R.id.hasilG10)
        hasilH10 = findViewById(R.id.hasilH10)

        namaGame10 = intent.getStringExtra("nama").toString()
        statusJawab10 = ""
        pilihanA10.setOnClickListener {
            pilihanA10.scaleY = 1.20f
            pilihanA10.scaleX = 1.30f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 5
            statusJawab10 = "A"
        }
        pilihanB10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.20f
            pilihanB10.scaleX = 1.30f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 0
            statusJawab10 = "B"
        }
        pilihanC10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.20f
            pilihanC10.scaleX = 1.30f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 0
            statusJawab10 = "C"
        }
        pilihanD10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.20f
            pilihanD10.scaleX = 1.30f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 0
            statusJawab10 ="D"
        }
        pilihanE10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.20f
            pilihanE10.scaleX = 1.30f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 0
            statusJawab10 = "E"
        }
        pilihanF10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.20f
            pilihanF10.scaleX = 1.30f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 0
            statusJawab10 = "F"
        }
        pilihanG10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.20f
            pilihanG10.scaleX = 1.30f
            pilihanH10.scaleY = 1.00f
            pilihanH10.scaleX = 1.00f
            nilai10 = 0
            statusJawab10 = "G"
        }
        pilihanH10.setOnClickListener {
            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanB10.scaleY = 1.00f
            pilihanB10.scaleX = 1.00f
            pilihanC10.scaleY = 1.00f
            pilihanC10.scaleX = 1.00f
            pilihanD10.scaleY = 1.00f
            pilihanD10.scaleX = 1.00f
            pilihanE10.scaleY = 1.00f
            pilihanE10.scaleX = 1.00f
            pilihanF10.scaleY = 1.00f
            pilihanF10.scaleX = 1.00f
            pilihanG10.scaleY = 1.00f
            pilihanG10.scaleX = 1.00f
            pilihanH10.scaleY = 1.20f
            pilihanH10.scaleX = 1.30f
            nilai10 = 0
            statusJawab10 = "H"
        }

        nextGame10.setOnClickListener {
            pilihanA10.isClickable = false
            pilihanB10.isClickable = false
            pilihanC10.isClickable = false
            pilihanD10.isClickable = false
            pilihanE10.isClickable = false
            pilihanF10.isClickable = false
            pilihanG10.isClickable = false
            pilihanH10.isClickable = false

            pilihanA10.scaleY = 1.00f
            pilihanA10.scaleX = 1.00f
            pilihanA10.scaleY = 1.20f
            pilihanA10.scaleX = 1.30f
            hasilA10.visibility = View.VISIBLE

            if(statusJawab10 == "B") {
                hasilB10.visibility = View.VISIBLE
            } else if(statusJawab10 == "C") {
                hasilC10.visibility = View.VISIBLE
            } else if(statusJawab10 == "D") {
                hasilD10.visibility = View.VISIBLE
            } else if(statusJawab10 == "E") {
                hasilE10.visibility = View.VISIBLE
            } else if(statusJawab10 == "F") {
                hasilF10.visibility = View.VISIBLE
            } else if(statusJawab10 == "G") {
                hasilG10.visibility = View.VISIBLE
            } else if(statusJawab10 == "H") {
                hasilH10.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai10
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai10
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Skor2::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame10)
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