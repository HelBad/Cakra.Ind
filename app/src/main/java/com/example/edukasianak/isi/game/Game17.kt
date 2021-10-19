package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game17 : AppCompatActivity() {
    lateinit var pilihanA17: ImageView
    lateinit var pilihanB17: ImageView
    lateinit var pilihanC17: ImageView
    lateinit var pilihanD17: ImageView
    lateinit var pilihanE17: ImageView
    lateinit var pilihanF17: ImageView
    lateinit var pilihanG17: ImageView
    lateinit var pilihanH17: ImageView
    lateinit var nextGame17: LinearLayout
    var nilai17: Int = 0
    lateinit var statusJawab17: String
    lateinit var namaGame17: String

    lateinit var hasilA17: ImageView
    lateinit var hasilB17: ImageView
    lateinit var hasilC17: ImageView
    lateinit var hasilD17: ImageView
    lateinit var hasilE17: ImageView
    lateinit var hasilF17: ImageView
    lateinit var hasilG17: ImageView
    lateinit var hasilH17: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_17)

        pilihanA17 = findViewById(R.id.pilihanA17)
        pilihanB17 = findViewById(R.id.pilihanB17)
        pilihanC17 = findViewById(R.id.pilihanC17)
        pilihanD17 = findViewById(R.id.pilihanD17)
        pilihanE17 = findViewById(R.id.pilihanE17)
        pilihanF17 = findViewById(R.id.pilihanF17)
        pilihanG17 = findViewById(R.id.pilihanG17)
        pilihanH17 = findViewById(R.id.pilihanH17)
        nextGame17 = findViewById(R.id.nextGame17)

        hasilA17 = findViewById(R.id.hasilA17)
        hasilB17 = findViewById(R.id.hasilB17)
        hasilC17 = findViewById(R.id.hasilC17)
        hasilD17 = findViewById(R.id.hasilD17)
        hasilE17 = findViewById(R.id.hasilE17)
        hasilF17 = findViewById(R.id.hasilF17)
        hasilG17 = findViewById(R.id.hasilG17)
        hasilH17 = findViewById(R.id.hasilH17)

        namaGame17 = intent.getStringExtra("nama").toString()
        statusJawab17 = ""
        pilihanA17.setOnClickListener {
            pilihanA17.scaleY = 1.20f
            pilihanA17.scaleX = 1.30f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 0
            statusJawab17 = "A"
        }
        pilihanB17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.20f
            pilihanB17.scaleX = 1.30f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 0
            statusJawab17 = "B"
        }
        pilihanC17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.20f
            pilihanC17.scaleX = 1.30f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 0
            statusJawab17 = "C"
        }
        pilihanD17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.20f
            pilihanD17.scaleX = 1.30f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 0
            statusJawab17 ="D"
        }
        pilihanE17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.20f
            pilihanE17.scaleX = 1.30f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 5
            statusJawab17 = "E"
        }
        pilihanF17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.20f
            pilihanF17.scaleX = 1.30f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 0
            statusJawab17 = "F"
        }
        pilihanG17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.20f
            pilihanG17.scaleX = 1.30f
            pilihanH17.scaleY = 1.00f
            pilihanH17.scaleX = 1.00f
            nilai17 = 0
            statusJawab17 = "G"
        }
        pilihanH17.setOnClickListener {
            pilihanA17.scaleY = 1.00f
            pilihanA17.scaleX = 1.00f
            pilihanB17.scaleY = 1.00f
            pilihanB17.scaleX = 1.00f
            pilihanC17.scaleY = 1.00f
            pilihanC17.scaleX = 1.00f
            pilihanD17.scaleY = 1.00f
            pilihanD17.scaleX = 1.00f
            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanF17.scaleY = 1.00f
            pilihanF17.scaleX = 1.00f
            pilihanG17.scaleY = 1.00f
            pilihanG17.scaleX = 1.00f
            pilihanH17.scaleY = 1.20f
            pilihanH17.scaleX = 1.30f
            nilai17 = 0
            statusJawab17 = "H"
        }

        nextGame17.setOnClickListener {
            pilihanA17.isClickable = false
            pilihanB17.isClickable = false
            pilihanC17.isClickable = false
            pilihanD17.isClickable = false
            pilihanE17.isClickable = false
            pilihanF17.isClickable = false
            pilihanG17.isClickable = false
            pilihanH17.isClickable = false

            pilihanE17.scaleY = 1.00f
            pilihanE17.scaleX = 1.00f
            pilihanE17.scaleY = 1.20f
            pilihanE17.scaleX = 1.30f
            hasilE17.visibility = View.VISIBLE

            if(statusJawab17 == "A") {
                hasilA17.visibility = View.VISIBLE
            } else if(statusJawab17 == "B") {
                hasilB17.visibility = View.VISIBLE
            } else if(statusJawab17 == "C") {
                hasilC17.visibility = View.VISIBLE
            } else if(statusJawab17 == "D") {
                hasilD17.visibility = View.VISIBLE
            } else if(statusJawab17 == "F") {
                hasilF17.visibility = View.VISIBLE
            } else if(statusJawab17 == "G") {
                hasilG17.visibility = View.VISIBLE
            } else if(statusJawab17 == "H") {
                hasilH17.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai17
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai17
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game18::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame17)
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