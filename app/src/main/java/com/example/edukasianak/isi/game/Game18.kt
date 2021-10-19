package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game18 : AppCompatActivity() {
    lateinit var pilihanA18: ImageView
    lateinit var pilihanB18: ImageView
    lateinit var pilihanC18: ImageView
    lateinit var pilihanD18: ImageView
    lateinit var pilihanE18: ImageView
    lateinit var pilihanF18: ImageView
    lateinit var pilihanG18: ImageView
    lateinit var pilihanH18: ImageView
    lateinit var nextGame18: LinearLayout
    var nilai18: Int = 0
    lateinit var statusJawab18: String
    lateinit var namaGame18: String

    lateinit var hasilA18: ImageView
    lateinit var hasilB18: ImageView
    lateinit var hasilC18: ImageView
    lateinit var hasilD18: ImageView
    lateinit var hasilE18: ImageView
    lateinit var hasilF18: ImageView
    lateinit var hasilG18: ImageView
    lateinit var hasilH18: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_18)

        pilihanA18 = findViewById(R.id.pilihanA18)
        pilihanB18 = findViewById(R.id.pilihanB18)
        pilihanC18 = findViewById(R.id.pilihanC18)
        pilihanD18 = findViewById(R.id.pilihanD18)
        pilihanE18 = findViewById(R.id.pilihanE18)
        pilihanF18 = findViewById(R.id.pilihanF18)
        pilihanG18 = findViewById(R.id.pilihanG18)
        pilihanH18 = findViewById(R.id.pilihanH18)
        nextGame18 = findViewById(R.id.nextGame18)

        hasilA18 = findViewById(R.id.hasilA18)
        hasilB18 = findViewById(R.id.hasilB18)
        hasilC18 = findViewById(R.id.hasilC18)
        hasilD18 = findViewById(R.id.hasilD18)
        hasilE18 = findViewById(R.id.hasilE18)
        hasilF18 = findViewById(R.id.hasilF18)
        hasilG18 = findViewById(R.id.hasilG18)
        hasilH18 = findViewById(R.id.hasilH18)

        namaGame18 = intent.getStringExtra("nama").toString()
        statusJawab18 = ""
        pilihanA18.setOnClickListener {
            pilihanA18.scaleY = 1.20f
            pilihanA18.scaleX = 1.30f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 = "A"
        }
        pilihanB18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.20f
            pilihanB18.scaleX = 1.30f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 = "B"
        }
        pilihanC18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.20f
            pilihanC18.scaleX = 1.30f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 = "C"
        }
        pilihanD18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.20f
            pilihanD18.scaleX = 1.30f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 ="D"
        }
        pilihanE18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.20f
            pilihanE18.scaleX = 1.30f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 = "E"
        }
        pilihanF18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.20f
            pilihanF18.scaleX = 1.30f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 = "F"
        }
        pilihanG18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.20f
            pilihanG18.scaleX = 1.30f
            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            nilai18 = 0
            statusJawab18 = "G"
        }
        pilihanH18.setOnClickListener {
            pilihanA18.scaleY = 1.00f
            pilihanA18.scaleX = 1.00f
            pilihanB18.scaleY = 1.00f
            pilihanB18.scaleX = 1.00f
            pilihanC18.scaleY = 1.00f
            pilihanC18.scaleX = 1.00f
            pilihanD18.scaleY = 1.00f
            pilihanD18.scaleX = 1.00f
            pilihanE18.scaleY = 1.00f
            pilihanE18.scaleX = 1.00f
            pilihanF18.scaleY = 1.00f
            pilihanF18.scaleX = 1.00f
            pilihanG18.scaleY = 1.00f
            pilihanG18.scaleX = 1.00f
            pilihanH18.scaleY = 1.20f
            pilihanH18.scaleX = 1.30f
            nilai18 = 5
            statusJawab18 = "H"
        }

        nextGame18.setOnClickListener {
            pilihanA18.isClickable = false
            pilihanB18.isClickable = false
            pilihanC18.isClickable = false
            pilihanD18.isClickable = false
            pilihanE18.isClickable = false
            pilihanF18.isClickable = false
            pilihanG18.isClickable = false
            pilihanH18.isClickable = false

            pilihanH18.scaleY = 1.00f
            pilihanH18.scaleX = 1.00f
            pilihanH18.scaleY = 1.20f
            pilihanH18.scaleX = 1.30f
            hasilH18.visibility = View.VISIBLE

            if(statusJawab18 == "A") {
                hasilA18.visibility = View.VISIBLE
            } else if(statusJawab18 == "B") {
                hasilB18.visibility = View.VISIBLE
            } else if(statusJawab18 == "C") {
                hasilC18.visibility = View.VISIBLE
            } else if(statusJawab18 == "D") {
                hasilD18.visibility = View.VISIBLE
            } else if(statusJawab18 == "E") {
                hasilE18.visibility = View.VISIBLE
            } else if(statusJawab18 == "F") {
                hasilF18.visibility = View.VISIBLE
            } else if(statusJawab18 == "G") {
                hasilG18.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai18
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai18
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game19::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame18)
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