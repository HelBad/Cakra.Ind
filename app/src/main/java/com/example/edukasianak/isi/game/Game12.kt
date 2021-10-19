package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game12 : AppCompatActivity() {
    lateinit var pilihanA12: ImageView
    lateinit var pilihanB12: ImageView
    lateinit var pilihanC12: ImageView
    lateinit var pilihanD12: ImageView
    lateinit var pilihanE12: ImageView
    lateinit var pilihanF12: ImageView
    lateinit var pilihanG12: ImageView
    lateinit var pilihanH12: ImageView
    lateinit var nextGame12: LinearLayout
    var nilai12: Int = 0
    lateinit var statusJawab12: String
    lateinit var namaGame12: String

    lateinit var hasilA12: ImageView
    lateinit var hasilB12: ImageView
    lateinit var hasilC12: ImageView
    lateinit var hasilD12: ImageView
    lateinit var hasilE12: ImageView
    lateinit var hasilF12: ImageView
    lateinit var hasilG12: ImageView
    lateinit var hasilH12: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_12)

        pilihanA12 = findViewById(R.id.pilihanA12)
        pilihanB12 = findViewById(R.id.pilihanB12)
        pilihanC12 = findViewById(R.id.pilihanC12)
        pilihanD12 = findViewById(R.id.pilihanD12)
        pilihanE12 = findViewById(R.id.pilihanE12)
        pilihanF12 = findViewById(R.id.pilihanF12)
        pilihanG12 = findViewById(R.id.pilihanG12)
        pilihanH12 = findViewById(R.id.pilihanH12)
        nextGame12 = findViewById(R.id.nextGame12)

        hasilA12 = findViewById(R.id.hasilA12)
        hasilB12 = findViewById(R.id.hasilB12)
        hasilC12 = findViewById(R.id.hasilC12)
        hasilD12 = findViewById(R.id.hasilD12)
        hasilE12 = findViewById(R.id.hasilE12)
        hasilF12 = findViewById(R.id.hasilF12)
        hasilG12 = findViewById(R.id.hasilG12)
        hasilH12 = findViewById(R.id.hasilH12)

        namaGame12 = intent.getStringExtra("nama").toString()
        statusJawab12 = ""
        pilihanA12.setOnClickListener {
            pilihanA12.scaleY = 1.20f
            pilihanA12.scaleX = 1.30f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 0
            statusJawab12 = "A"
        }
        pilihanB12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.20f
            pilihanB12.scaleX = 1.30f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 0
            statusJawab12 = "B"
        }
        pilihanC12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.20f
            pilihanC12.scaleX = 1.30f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 0
            statusJawab12 = "C"
        }
        pilihanD12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.20f
            pilihanD12.scaleX = 1.30f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 0
            statusJawab12 ="D"
        }
        pilihanE12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.20f
            pilihanE12.scaleX = 1.30f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 0
            statusJawab12 = "E"
        }
        pilihanF12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.20f
            pilihanF12.scaleX = 1.30f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 0
            statusJawab12 = "F"
        }
        pilihanG12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.20f
            pilihanG12.scaleX = 1.30f
            pilihanH12.scaleY = 1.00f
            pilihanH12.scaleX = 1.00f
            nilai12 = 5
            statusJawab12 = "G"
        }
        pilihanH12.setOnClickListener {
            pilihanA12.scaleY = 1.00f
            pilihanA12.scaleX = 1.00f
            pilihanB12.scaleY = 1.00f
            pilihanB12.scaleX = 1.00f
            pilihanC12.scaleY = 1.00f
            pilihanC12.scaleX = 1.00f
            pilihanD12.scaleY = 1.00f
            pilihanD12.scaleX = 1.00f
            pilihanE12.scaleY = 1.00f
            pilihanE12.scaleX = 1.00f
            pilihanF12.scaleY = 1.00f
            pilihanF12.scaleX = 1.00f
            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanH12.scaleY = 1.20f
            pilihanH12.scaleX = 1.30f
            nilai12 = 0
            statusJawab12 = "H"
        }

        nextGame12.setOnClickListener {
            pilihanA12.isClickable = false
            pilihanB12.isClickable = false
            pilihanC12.isClickable = false
            pilihanD12.isClickable = false
            pilihanE12.isClickable = false
            pilihanF12.isClickable = false
            pilihanG12.isClickable = false
            pilihanH12.isClickable = false

            pilihanG12.scaleY = 1.00f
            pilihanG12.scaleX = 1.00f
            pilihanG12.scaleY = 1.20f
            pilihanG12.scaleX = 1.30f
            hasilG12.visibility = View.VISIBLE

            if(statusJawab12 == "A") {
                hasilA12.visibility = View.VISIBLE
            } else if(statusJawab12 == "B") {
                hasilB12.visibility = View.VISIBLE
            } else if(statusJawab12 == "C") {
                hasilC12.visibility = View.VISIBLE
            } else if(statusJawab12 == "D") {
                hasilD12.visibility = View.VISIBLE
            } else if(statusJawab12 == "E") {
                hasilE12.visibility = View.VISIBLE
            } else if(statusJawab12 == "F") {
                hasilF12.visibility = View.VISIBLE
            } else if(statusJawab12 == "H") {
                hasilH12.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai12
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai12
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game13::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame12)
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