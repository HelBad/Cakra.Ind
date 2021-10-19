package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game9 : AppCompatActivity() {
    lateinit var pilihanA9: ImageView
    lateinit var pilihanB9: ImageView
    lateinit var pilihanC9: ImageView
    lateinit var pilihanD9: ImageView
    lateinit var pilihanE9: ImageView
    lateinit var pilihanF9: ImageView
    lateinit var pilihanG9: ImageView
    lateinit var pilihanH9: ImageView
    lateinit var nextGame9: LinearLayout
    var nilai9: Int = 0
    lateinit var statusJawab9: String
    lateinit var namaGame9: String

    lateinit var hasilA9: ImageView
    lateinit var hasilB9: ImageView
    lateinit var hasilC9: ImageView
    lateinit var hasilD9: ImageView
    lateinit var hasilE9: ImageView
    lateinit var hasilF9: ImageView
    lateinit var hasilG9: ImageView
    lateinit var hasilH9: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_9)

        pilihanA9 = findViewById(R.id.pilihanA9)
        pilihanB9 = findViewById(R.id.pilihanB9)
        pilihanC9 = findViewById(R.id.pilihanC9)
        pilihanD9 = findViewById(R.id.pilihanD9)
        pilihanE9 = findViewById(R.id.pilihanE9)
        pilihanF9 = findViewById(R.id.pilihanF9)
        pilihanG9 = findViewById(R.id.pilihanG9)
        pilihanH9 = findViewById(R.id.pilihanH9)
        nextGame9 = findViewById(R.id.nextGame9)

        hasilA9 = findViewById(R.id.hasilA9)
        hasilB9 = findViewById(R.id.hasilB9)
        hasilC9 = findViewById(R.id.hasilC9)
        hasilD9 = findViewById(R.id.hasilD9)
        hasilE9 = findViewById(R.id.hasilE9)
        hasilF9 = findViewById(R.id.hasilF9)
        hasilG9 = findViewById(R.id.hasilG9)
        hasilH9 = findViewById(R.id.hasilH9)

        namaGame9 = intent.getStringExtra("nama").toString()
        statusJawab9 = ""
        pilihanA9.setOnClickListener {
            pilihanA9.scaleY = 1.20f
            pilihanA9.scaleX = 1.30f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 0
            statusJawab9 = "A"
        }
        pilihanB9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.20f
            pilihanB9.scaleX = 1.30f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 0
            statusJawab9 = "B"
        }
        pilihanC9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.20f
            pilihanC9.scaleX = 1.30f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 0
            statusJawab9 = "C"
        }
        pilihanD9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.20f
            pilihanD9.scaleX = 1.30f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 0
            statusJawab9 ="D"
        }
        pilihanE9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.20f
            pilihanE9.scaleX = 1.30f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 0
            statusJawab9 = "E"
        }
        pilihanF9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.20f
            pilihanF9.scaleX = 1.30f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 5
            statusJawab9 = "F"
        }
        pilihanG9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.20f
            pilihanG9.scaleX = 1.30f
            pilihanH9.scaleY = 1.00f
            pilihanH9.scaleX = 1.00f
            nilai9 = 0
            statusJawab9 = "G"
        }
        pilihanH9.setOnClickListener {
            pilihanA9.scaleY = 1.00f
            pilihanA9.scaleX = 1.00f
            pilihanB9.scaleY = 1.00f
            pilihanB9.scaleX = 1.00f
            pilihanC9.scaleY = 1.00f
            pilihanC9.scaleX = 1.00f
            pilihanD9.scaleY = 1.00f
            pilihanD9.scaleX = 1.00f
            pilihanE9.scaleY = 1.00f
            pilihanE9.scaleX = 1.00f
            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanG9.scaleY = 1.00f
            pilihanG9.scaleX = 1.00f
            pilihanH9.scaleY = 1.20f
            pilihanH9.scaleX = 1.30f
            nilai9 = 0
            statusJawab9 = "H"
        }

        nextGame9.setOnClickListener {
            pilihanA9.isClickable = false
            pilihanB9.isClickable = false
            pilihanC9.isClickable = false
            pilihanD9.isClickable = false
            pilihanE9.isClickable = false
            pilihanF9.isClickable = false
            pilihanG9.isClickable = false
            pilihanH9.isClickable = false

            pilihanF9.scaleY = 1.00f
            pilihanF9.scaleX = 1.00f
            pilihanF9.scaleY = 1.20f
            pilihanF9.scaleX = 1.30f
            hasilF9.visibility = View.VISIBLE

            if(statusJawab9 == "A") {
                hasilA9.visibility = View.VISIBLE
            } else if(statusJawab9 == "B") {
                hasilB9.visibility = View.VISIBLE
            } else if(statusJawab9 == "C") {
                hasilC9.visibility = View.VISIBLE
            } else if(statusJawab9 == "D") {
                hasilD9.visibility = View.VISIBLE
            } else if(statusJawab9 == "E") {
                hasilE9.visibility = View.VISIBLE
            } else if(statusJawab9 == "G") {
                hasilG9.visibility = View.VISIBLE
            } else if(statusJawab9 == "H") {
                hasilH9.visibility = View.VISIBLE
            }

            val total1 = (intent.getStringExtra("nilai"))!!.toInt() + nilai9
            val total2 = (intent.getStringExtra("total"))!!.toInt() + nilai9
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game10::class.java)
                        intent.putExtra("nilai", total1.toString())
                        intent.putExtra("total", total2.toString())
                        intent.putExtra("nama", namaGame9)
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