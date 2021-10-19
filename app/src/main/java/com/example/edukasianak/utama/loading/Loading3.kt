package com.example.edukasianak.utama.loading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import com.example.edukasianak.R
import com.example.edukasianak.utama.Welcome

class Loading3 : AppCompatActivity() {
    private val splashDelay: Long = 2000 // 6 seconds
    private var mDelayHandler: Handler? = null
    private var progressStatus = 0
    private var dummy = 0
    lateinit var progressSplash: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_3)

        progressSplash = findViewById(R.id.progressSplash)
        mDelayHandler = Handler()
        mDelayHandler!!.postDelayed(mRunnable, splashDelay)
    }

    override fun onStart() {
        super.onStart()
        this.window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
    }

    private fun launchMainActivity() {
        val intent = Intent(this, Welcome::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        this.finish()
        mDelayHandler!!.removeCallbacks(mRunnable)
    }

    private val mRunnable: Runnable = Runnable {
        Thread {
            while (progressStatus < 100) {
                try {
                    dummy += 10
                    Thread.sleep(200)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
                progressStatus = dummy
                progressSplash.progress = progressStatus
            }
            launchMainActivity()
        }.start()
    }

    override fun onBackPressed() {}
}