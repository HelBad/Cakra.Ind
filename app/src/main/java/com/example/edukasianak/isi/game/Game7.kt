package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game7 : AppCompatActivity() {
    lateinit var pilihanA7: ImageView
    lateinit var pilihanB7: ImageView
    lateinit var pilihanC7: ImageView
    lateinit var pilihanD7: ImageView
    lateinit var pilihanE7: ImageView
    lateinit var pilihanF7: ImageView
    lateinit var pilihanG7: ImageView
    lateinit var pilihanH7: ImageView
    lateinit var nextGame7: LinearLayout
    var nilai7: Int = 0
    lateinit var statusJawab7: String
    lateinit var namaGame7: String

    lateinit var hasilA7: ImageView
    lateinit var hasilB7: ImageView
    lateinit var hasilC7: ImageView
    lateinit var hasilD7: ImageView
    lateinit var hasilE7: ImageView
    lateinit var hasilF7: ImageView
    lateinit var hasilG7: ImageView
    lateinit var hasilH7: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_7)

        pilihanA7 = findViewById(R.id.pilihanA7)
        pilihanB7 = findViewById(R.id.pilihanB7)
        pilihanC7 = findViewById(R.id.pilihanC7)
        pilihanD7 = findViewById(R.id.pilihanD7)
        pilihanE7 = findViewById(R.id.pilihanE7)
        pilihanF7 = findViewById(R.id.pilihanF7)
        pilihanG7 = findViewById(R.id.pilihanG7)
        pilihanH7 = findViewById(R.id.pilihanH7)
        nextGame7 = findViewById(R.id.nextGame7)

        hasilA7 = findViewById(R.id.hasilA7)
        hasilB7 = findViewById(R.id.hasilB7)
        hasilC7 = findViewById(R.id.hasilC7)
        hasilD7 = findViewById(R.id.hasilD7)
        hasilE7 = findViewById(R.id.hasilE7)
        hasilF7 = findViewById(R.id.hasilF7)
        hasilG7 = findViewById(R.id.hasilG7)
        hasilH7 = findViewById(R.id.hasilH7)

        namaGame7 = intent.getStringExtra("nama").toString()
        statusJawab7 = ""
        pilihanA7.setOnClickListener {
            pilihanA7.scaleY = 1.20f
            pilihanA7.scaleX = 1.30f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 0
            statusJawab7 = "A"
        }
        pilihanB7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.20f
            pilihanB7.scaleX = 1.30f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 0
            statusJawab7 = "B"
        }
        pilihanC7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.20f
            pilihanC7.scaleX = 1.30f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 5
            statusJawab7 = "C"
        }
        pilihanD7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.20f
            pilihanD7.scaleX = 1.30f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 0
            statusJawab7 ="D"
        }
        pilihanE7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.20f
            pilihanE7.scaleX = 1.30f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 0
            statusJawab7 = "E"
        }
        pilihanF7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.20f
            pilihanF7.scaleX = 1.30f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 0
            statusJawab7 = "F"
        }
        pilihanG7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.20f
            pilihanG7.scaleX = 1.30f
            pilihanH7.scaleY = 1.00f
            pilihanH7.scaleX = 1.00f
            nilai7 = 0
            statusJawab7 = "G"
        }
        pilihanH7.setOnClickListener {
            pilihanA7.scaleY = 1.00f
            pilihanA7.scaleX = 1.00f
            pilihanB7.scaleY = 1.00f
            pilihanB7.scaleX = 1.00f
            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanD7.scaleY = 1.00f
            pilihanD7.scaleX = 1.00f
            pilihanE7.scaleY = 1.00f
            pilihanE7.scaleX = 1.00f
            pilihanF7.scaleY = 1.00f
            pilihanF7.scaleX = 1.00f
            pilihanG7.scaleY = 1.00f
            pilihanG7.scaleX = 1.00f
            pilihanH7.scaleY = 1.20f
            pilihanH7.scaleX = 1.30f
            nilai7 = 0
            statusJawab7 = "H"
        }

        nextGame7.setOnClickListener {
            pilihanA7.isClickable = false
            pilihanB7.isClickable = false
            pilihanC7.isClickable = false
            pilihanD7.isClickable = false
            pilihanE7.isClickable = false
            pilihanF7.isClickable = false
            pilihanG7.isClickable = false
            pilihanH7.isClickable = false

            pilihanC7.scaleY = 1.00f
            pilihanC7.scaleX = 1.00f
            pilihanC7.scaleY = 1.20f
            pilihanC7.scaleX = 1.30f
            hasilC7.visibility = View.VISIBLE

            if(statusJawab7 == "A") {
                hasilA7.visibility = View.VISIBLE
            } else if(statusJawab7 == "B") {
                hasilB7.visibility = View.VISIBLE
            } else if(statusJawab7 == "D") {
                hasilD7.visibility = View.VISIBLE
            } else if(statusJawab7 == "E") {
                hasilE7.visibility = View.VISIBLE
            } else if(statusJawab7 == "F") {
                hasilF7.visibility = View.VISIBLE
            } else if(statusJawab7 == "G") {
                hasilG7.visibility = View.VISIBLE
            } else if(statusJawab7 == "H") {
                hasilH7.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai7
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai7
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game8::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame7)
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