package com.example.edukasianak.utama

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.edukasianak.R
import com.example.edukasianak.adapter.HomeAdapter
import com.example.edukasianak.adapter.HomeItem
import com.example.edukasianak.isi.sejarah.Sejarah1
import com.example.edukasianak.isi.Tentang
import com.example.edukasianak.isi.Video
import com.example.edukasianak.isi.game.Game1
import java.lang.Math.abs

class Home : AppCompatActivity() {
    lateinit var sliderItemList: ArrayList<HomeItem>
    lateinit var sliderAdapter: HomeAdapter
    lateinit var sliderHandle: Handler
    lateinit var viewPagerImgSlider: ViewPager2
    lateinit var namaHome: TextView
    lateinit var namaUser: String
    lateinit var backHome: LinearLayout
    lateinit var nextHome: LinearLayout
    lateinit var exitHome: ImageView
    var mp = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        viewPagerImgSlider = findViewById(R.id.viewPagerImgSlider)
        backHome = findViewById(R.id.backHome)
        nextHome = findViewById(R.id.nextHome)
        exitHome = findViewById(R.id.exitHome)

        namaUser = intent.getStringExtra("nama").toString()
        namaHome = findViewById(R.id.namaHome)
        sliderItem()
        itemSliderView()

        backHome.visibility = View.GONE
        nextHome.setOnClickListener {
            viewPagerImgSlider.currentItem = viewPagerImgSlider.currentItem + 1
            if(viewPagerImgSlider.currentItem == 1) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.VISIBLE
            } else if(viewPagerImgSlider.currentItem == 2) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.VISIBLE
            } else if(viewPagerImgSlider.currentItem == 3) {
                nextHome.visibility = View.GONE
                backHome.visibility = View.VISIBLE
            }
        }
        backHome.setOnClickListener {
            viewPagerImgSlider.currentItem = viewPagerImgSlider.currentItem - 1
            if(viewPagerImgSlider.currentItem == 0) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.GONE
            } else if(viewPagerImgSlider.currentItem == 1) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.VISIBLE
            } else if(viewPagerImgSlider.currentItem == 2) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.VISIBLE
            }
        }
        exitHome.setOnClickListener {
            val intent = Intent(this, Keluar::class.java)
            intent.putExtra("nama", namaUser)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        this.window.decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        namaHome.text = "Hi, " + intent.getStringExtra("nama") + "..."
    }

    private fun sliderItem() {
        sliderItemList = ArrayList()
        sliderAdapter = HomeAdapter(viewPagerImgSlider, sliderItemList)
        viewPagerImgSlider.adapter = sliderAdapter
        viewPagerImgSlider.clipToPadding = false
        viewPagerImgSlider.clipChildren = false
        viewPagerImgSlider.offscreenPageLimit = 1
        viewPagerImgSlider.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        val comPosPageTarn = CompositePageTransformer()
        comPosPageTarn.addTransformer(MarginPageTransformer(40))
        comPosPageTarn.addTransformer { page, position ->
            val r: Float = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.15f
            page.setOnClickListener {
                if(viewPagerImgSlider.currentItem == 0) {
                    val intent = Intent(this, Sejarah1::class.java)
                    intent.putExtra("nama", namaUser)
                    startActivity(intent)
                    finishAffinity()
                } else if(viewPagerImgSlider.currentItem == 1){
                    val intent = Intent(this, Video::class.java)
                    intent.putExtra("nama", namaUser)
                    startActivity(intent)
                    finishAffinity()
                } else if(viewPagerImgSlider.currentItem == 2){
                    val intent = Intent(this, Tentang::class.java)
                    intent.putExtra("nama", namaUser)
                    startActivity(intent)
                    finishAffinity()
                } else if(viewPagerImgSlider.currentItem == 3){
                    val intent = Intent(this, Game1::class.java)
                    intent.putExtra("nama", namaUser)
                    startActivity(intent)
                    finishAffinity()
                }
            }

            if(viewPagerImgSlider.currentItem == 0) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.GONE
            } else if(viewPagerImgSlider.currentItem == 1) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.VISIBLE
            } else if(viewPagerImgSlider.currentItem == 2) {
                nextHome.visibility = View.VISIBLE
                backHome.visibility = View.VISIBLE
            } else if(viewPagerImgSlider.currentItem == 3) {
                nextHome.visibility = View.GONE
                backHome.visibility = View.VISIBLE
            }

        }
        viewPagerImgSlider.setPageTransformer(comPosPageTarn)
        sliderHandle = Handler()
    }

    private fun itemSliderView() {
        sliderItemList.add(HomeItem(R.drawable.img_home_sejarah))
        sliderItemList.add(HomeItem(R.drawable.img_home_video))
        sliderItemList.add(HomeItem(R.drawable.img_home_tentang))
        sliderItemList.add(HomeItem(R.drawable.img_home_game))
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        mp = MediaPlayer.create(applicationContext, R.raw.home)
        mp.isLooping = true
        mp.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mp.pause()
    }

    override fun onBackPressed() {}
}