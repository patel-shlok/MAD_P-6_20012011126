package com.example.shlok_pr6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import androidx.core.view.WindowCompat
import com.example.shlok_pr6.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initVideoPlayer()
    }
    private fun initVideoPlayer(){
        var MediaController= mediaController
        val uri:Uri=Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        val myvideoview=findViewById<VideoView>(R.id.video)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
        val button=findViewById<FloatingActionButton>(R.id.floating)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply{startActivity(this)}
        }

    }
}