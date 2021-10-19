package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game19 : AppCompatActivity() {
    lateinit var pilihanA19: ImageView
    lateinit var pilihanB19: ImageView
    lateinit var pilihanC19: ImageView
    lateinit var pilihanD19: ImageView
    lateinit var pilihanE19: ImageView
    lateinit var pilihanF19: ImageView
    lateinit var pilihanG19: ImageView
    lateinit var pilihanH19: ImageView
    lateinit var nextGame19: LinearLayout
    var nilai19: Int = 0
    lateinit var statusJawab19: String
    lateinit var namaGame19: String

    lateinit var hasilA19: ImageView
    lateinit var hasilB19: ImageView
    lateinit var hasilC19: ImageView
    lateinit var hasilD19: ImageView
    lateinit var hasilE19: ImageView
    lateinit var hasilF19: ImageView
    lateinit var hasilG19: ImageView
    lateinit var hasilH19: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_19)

        pilihanA19 = findViewById(R.id.pilihanA19)
        pilihanB19 = findViewById(R.id.pilihanB19)
        pilihanC19 = findViewById(R.id.pilihanC19)
        pilihanD19 = findViewById(R.id.pilihanD19)
        pilihanE19 = findViewById(R.id.pilihanE19)
        pilihanF19 = findViewById(R.id.pilihanF19)
        pilihanG19 = findViewById(R.id.pilihanG19)
        pilihanH19 = findViewById(R.id.pilihanH19)
        nextGame19 = findViewById(R.id.nextGame19)

        hasilA19 = findViewById(R.id.hasilA19)
        hasilB19 = findViewById(R.id.hasilB19)
        hasilC19 = findViewById(R.id.hasilC19)
        hasilD19 = findViewById(R.id.hasilD19)
        hasilE19 = findViewById(R.id.hasilE19)
        hasilF19 = findViewById(R.id.hasilF19)
        hasilG19 = findViewById(R.id.hasilG19)
        hasilH19 = findViewById(R.id.hasilH19)

        namaGame19 = intent.getStringExtra("nama").toString()
        statusJawab19 = ""
        pilihanA19.setOnClickListener {
            pilihanA19.scaleY = 1.20f
            pilihanA19.scaleX = 1.30f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 0
            statusJawab19 = "A"
        }
        pilihanB19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.20f
            pilihanB19.scaleX = 1.30f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 0
            statusJawab19 = "B"
        }
        pilihanC19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.20f
            pilihanC19.scaleX = 1.30f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 5
            statusJawab19 = "C"
        }
        pilihanD19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.20f
            pilihanD19.scaleX = 1.30f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 0
            statusJawab19 ="D"
        }
        pilihanE19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.20f
            pilihanE19.scaleX = 1.30f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 0
            statusJawab19 = "E"
        }
        pilihanF19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.20f
            pilihanF19.scaleX = 1.30f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 0
            statusJawab19 = "F"
        }
        pilihanG19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.20f
            pilihanG19.scaleX = 1.30f
            pilihanH19.scaleY = 1.00f
            pilihanH19.scaleX = 1.00f
            nilai19 = 0
            statusJawab19 = "G"
        }
        pilihanH19.setOnClickListener {
            pilihanA19.scaleY = 1.00f
            pilihanA19.scaleX = 1.00f
            pilihanB19.scaleY = 1.00f
            pilihanB19.scaleX = 1.00f
            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanD19.scaleY = 1.00f
            pilihanD19.scaleX = 1.00f
            pilihanE19.scaleY = 1.00f
            pilihanE19.scaleX = 1.00f
            pilihanF19.scaleY = 1.00f
            pilihanF19.scaleX = 1.00f
            pilihanG19.scaleY = 1.00f
            pilihanG19.scaleX = 1.00f
            pilihanH19.scaleY = 1.20f
            pilihanH19.scaleX = 1.30f
            nilai19 = 0
            statusJawab19 = "H"
        }

        nextGame19.setOnClickListener {
            pilihanA19.isClickable = false
            pilihanB19.isClickable = false
            pilihanC19.isClickable = false
            pilihanD19.isClickable = false
            pilihanE19.isClickable = false
            pilihanF19.isClickable = false
            pilihanG19.isClickable = false
            pilihanH19.isClickable = false

            pilihanC19.scaleY = 1.00f
            pilihanC19.scaleX = 1.00f
            pilihanC19.scaleY = 1.20f
            pilihanC19.scaleX = 1.30f
            hasilC19.visibility = View.VISIBLE

            if(statusJawab19 == "A") {
                hasilA19.visibility = View.VISIBLE
            } else if(statusJawab19 == "B") {
                hasilB19.visibility = View.VISIBLE
            } else if(statusJawab19 == "D") {
                hasilD19.visibility = View.VISIBLE
            } else if(statusJawab19 == "E") {
                hasilE19.visibility = View.VISIBLE
            } else if(statusJawab19 == "F") {
                hasilF19.visibility = View.VISIBLE
            } else if(statusJawab19 == "G") {
                hasilG19.visibility = View.VISIBLE
            } else if(statusJawab19 == "H") {
                hasilH19.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai19
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai19
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game20::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame19)
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