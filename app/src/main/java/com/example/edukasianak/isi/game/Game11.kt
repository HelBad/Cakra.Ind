package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game11 : AppCompatActivity() {
    lateinit var pilihanA11: ImageView
    lateinit var pilihanB11: ImageView
    lateinit var pilihanC11: ImageView
    lateinit var pilihanD11: ImageView
    lateinit var pilihanE11: ImageView
    lateinit var pilihanF11: ImageView
    lateinit var pilihanG11: ImageView
    lateinit var pilihanH11: ImageView
    lateinit var nextGame11: LinearLayout
    var nilai11: Int = 0
    lateinit var statusJawab11: String
    lateinit var namaGame11: String

    lateinit var hasilA11: ImageView
    lateinit var hasilB11: ImageView
    lateinit var hasilC11: ImageView
    lateinit var hasilD11: ImageView
    lateinit var hasilE11: ImageView
    lateinit var hasilF11: ImageView
    lateinit var hasilG11: ImageView
    lateinit var hasilH11: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_11)

        pilihanA11 = findViewById(R.id.pilihanA11)
        pilihanB11 = findViewById(R.id.pilihanB11)
        pilihanC11 = findViewById(R.id.pilihanC11)
        pilihanD11 = findViewById(R.id.pilihanD11)
        pilihanE11 = findViewById(R.id.pilihanE11)
        pilihanF11 = findViewById(R.id.pilihanF11)
        pilihanG11 = findViewById(R.id.pilihanG11)
        pilihanH11 = findViewById(R.id.pilihanH11)
        nextGame11 = findViewById(R.id.nextGame11)

        hasilA11 = findViewById(R.id.hasilA11)
        hasilB11 = findViewById(R.id.hasilB11)
        hasilC11 = findViewById(R.id.hasilC11)
        hasilD11 = findViewById(R.id.hasilD11)
        hasilE11 = findViewById(R.id.hasilE11)
        hasilF11 = findViewById(R.id.hasilF11)
        hasilG11 = findViewById(R.id.hasilG11)
        hasilH11 = findViewById(R.id.hasilH11)

        namaGame11 = intent.getStringExtra("nama").toString()
        statusJawab11 = ""
        pilihanA11.setOnClickListener {
            pilihanA11.scaleY = 1.20f
            pilihanA11.scaleX = 1.30f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 0
            statusJawab11 = "A"
        }
        pilihanB11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.20f
            pilihanB11.scaleX = 1.30f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 0
            statusJawab11 = "B"
        }
        pilihanC11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.20f
            pilihanC11.scaleX = 1.30f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 0
            statusJawab11 = "C"
        }
        pilihanD11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.20f
            pilihanD11.scaleX = 1.30f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 0
            statusJawab11 ="D"
        }
        pilihanE11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.20f
            pilihanE11.scaleX = 1.30f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 0
            statusJawab11 = "E"
        }
        pilihanF11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.20f
            pilihanF11.scaleX = 1.30f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 5
            statusJawab11 = "F"
        }
        pilihanG11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.20f
            pilihanG11.scaleX = 1.30f
            pilihanH11.scaleY = 1.00f
            pilihanH11.scaleX = 1.00f
            nilai11 = 0
            statusJawab11 = "G"
        }
        pilihanH11.setOnClickListener {
            pilihanA11.scaleY = 1.00f
            pilihanA11.scaleX = 1.00f
            pilihanB11.scaleY = 1.00f
            pilihanB11.scaleX = 1.00f
            pilihanC11.scaleY = 1.00f
            pilihanC11.scaleX = 1.00f
            pilihanD11.scaleY = 1.00f
            pilihanD11.scaleX = 1.00f
            pilihanE11.scaleY = 1.00f
            pilihanE11.scaleX = 1.00f
            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanG11.scaleY = 1.00f
            pilihanG11.scaleX = 1.00f
            pilihanH11.scaleY = 1.20f
            pilihanH11.scaleX = 1.30f
            nilai11 = 0
            statusJawab11 = "H"
        }

        nextGame11.setOnClickListener {
            pilihanA11.isClickable = false
            pilihanB11.isClickable = false
            pilihanC11.isClickable = false
            pilihanD11.isClickable = false
            pilihanE11.isClickable = false
            pilihanF11.isClickable = false
            pilihanG11.isClickable = false
            pilihanH11.isClickable = false

            pilihanF11.scaleY = 1.00f
            pilihanF11.scaleX = 1.00f
            pilihanF11.scaleY = 1.20f
            pilihanF11.scaleX = 1.30f
            hasilF11.visibility = View.VISIBLE

            if(statusJawab11 == "A") {
                hasilA11.visibility = View.VISIBLE
            } else if(statusJawab11 == "B") {
                hasilB11.visibility = View.VISIBLE
            } else if(statusJawab11 == "C") {
                hasilC11.visibility = View.VISIBLE
            } else if(statusJawab11 == "D") {
                hasilD11.visibility = View.VISIBLE
            } else if(statusJawab11 == "E") {
                hasilE11.visibility = View.VISIBLE
            } else if(statusJawab11 == "G") {
                hasilG11.visibility = View.VISIBLE
            } else if(statusJawab11 == "H") {
                hasilH11.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("total"))!!.toInt() + nilai11
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game12::class.java)
                        intent.putExtra("nilai", nilai11.toString())
                        intent.putExtra("total", total.toString())
                        intent.putExtra("nama", namaGame11)
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