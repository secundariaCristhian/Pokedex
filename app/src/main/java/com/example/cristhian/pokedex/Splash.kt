package com.example.cristhian.pokedex

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        showGif()
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this@Splash , MainActivity :: class.java))
        }, 3000)
    }
    fun showGif(){
        val imageView : ImageView = findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.rotomdex_hp).into(imageView)
    }
}