package com.example.edukasianak.isi.game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.edukasianak.R

class Game16 : AppCompatActivity() {
    lateinit var pilihanA16: ImageView
    lateinit var pilihanB16: ImageView
    lateinit var pilihanC16: ImageView
    lateinit var pilihanD16: ImageView
    lateinit var pilihanE16: ImageView
    lateinit var pilihanF16: ImageView
    lateinit var pilihanG16: ImageView
    lateinit var pilihanH16: ImageView
    lateinit var nextGame16: LinearLayout
    var nilai16: Int = 0
    lateinit var statusJawab16: String
    lateinit var namaGame16: String

    lateinit var hasilA16: ImageView
    lateinit var hasilB16: ImageView
    lateinit var hasilC16: ImageView
    lateinit var hasilD16: ImageView
    lateinit var hasilE16: ImageView
    lateinit var hasilF16: ImageView
    lateinit var hasilG16: ImageView
    lateinit var hasilH16: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_16)

        pilihanA16 = findViewById(R.id.pilihanA16)
        pilihanB16 = findViewById(R.id.pilihanB16)
        pilihanC16 = findViewById(R.id.pilihanC16)
        pilihanD16 = findViewById(R.id.pilihanD16)
        pilihanE16 = findViewById(R.id.pilihanE16)
        pilihanF16 = findViewById(R.id.pilihanF16)
        pilihanG16 = findViewById(R.id.pilihanG16)
        pilihanH16 = findViewById(R.id.pilihanH16)
        nextGame16 = findViewById(R.id.nextGame16)

        hasilA16 = findViewById(R.id.hasilA16)
        hasilB16 = findViewById(R.id.hasilB16)
        hasilC16 = findViewById(R.id.hasilC16)
        hasilD16 = findViewById(R.id.hasilD16)
        hasilE16 = findViewById(R.id.hasilE16)
        hasilF16 = findViewById(R.id.hasilF16)
        hasilG16 = findViewById(R.id.hasilG16)
        hasilH16 = findViewById(R.id.hasilH16)

        namaGame16 = intent.getStringExtra("nama").toString()
        statusJawab16 = ""
        pilihanA16.setOnClickListener {
            pilihanA16.scaleY = 1.20f
            pilihanA16.scaleX = 1.30f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 0
            statusJawab16 = "A"
        }
        pilihanB16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.20f
            pilihanB16.scaleX = 1.30f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 0
            statusJawab16 = "B"
        }
        pilihanC16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.20f
            pilihanC16.scaleX = 1.30f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 0
            statusJawab16 = "C"
        }
        pilihanD16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.20f
            pilihanD16.scaleX = 1.30f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 0
            statusJawab16 ="D"
        }
        pilihanE16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.20f
            pilihanE16.scaleX = 1.30f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 0
            statusJawab16 = "E"
        }
        pilihanF16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.20f
            pilihanF16.scaleX = 1.30f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 5
            statusJawab16 = "F"
        }
        pilihanG16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.20f
            pilihanG16.scaleX = 1.30f
            pilihanH16.scaleY = 1.00f
            pilihanH16.scaleX = 1.00f
            nilai16 = 0
            statusJawab16 = "G"
        }
        pilihanH16.setOnClickListener {
            pilihanA16.scaleY = 1.00f
            pilihanA16.scaleX = 1.00f
            pilihanB16.scaleY = 1.00f
            pilihanB16.scaleX = 1.00f
            pilihanC16.scaleY = 1.00f
            pilihanC16.scaleX = 1.00f
            pilihanD16.scaleY = 1.00f
            pilihanD16.scaleX = 1.00f
            pilihanE16.scaleY = 1.00f
            pilihanE16.scaleX = 1.00f
            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanG16.scaleY = 1.00f
            pilihanG16.scaleX = 1.00f
            pilihanH16.scaleY = 1.20f
            pilihanH16.scaleX = 1.30f
            nilai16 = 0
            statusJawab16 = "H"
        }

        nextGame16.setOnClickListener {
            pilihanA16.isClickable = false
            pilihanB16.isClickable = false
            pilihanC16.isClickable = false
            pilihanD16.isClickable = false
            pilihanE16.isClickable = false
            pilihanF16.isClickable = false
            pilihanG16.isClickable = false
            pilihanH16.isClickable = false

            pilihanF16.scaleY = 1.00f
            pilihanF16.scaleX = 1.00f
            pilihanF16.scaleY = 1.20f
            pilihanF16.scaleX = 1.30f
            hasilF16.visibility = View.VISIBLE

            if(statusJawab16 == "A") {
                hasilA16.visibility = View.VISIBLE
            } else if(statusJawab16 == "B") {
                hasilB16.visibility = View.VISIBLE
            } else if(statusJawab16 == "C") {
                hasilC16.visibility = View.VISIBLE
            } else if(statusJawab16 == "D") {
                hasilD16.visibility = View.VISIBLE
            } else if(statusJawab16 == "E") {
                hasilE16.visibility = View.VISIBLE
            } else if(statusJawab16 == "G") {
                hasilG16.visibility = View.VISIBLE
            } else if(statusJawab16 == "H") {
                hasilH16.visibility = View.VISIBLE
            }

            val total = (intent.getStringExtra("total"))!!.toInt() + nilai16
            val background = object : Thread() {
                override fun run() {
                    try {
                        sleep(500)
                        val intent = Intent(applicationContext, Game17::class.java)
                        intent.putExtra("nilai", nilai16.toString())
                        intent.putExtra("total", total.toString())
                        intent.putExtra("nama", namaGame16)
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