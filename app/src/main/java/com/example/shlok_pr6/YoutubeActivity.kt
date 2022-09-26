package com.example.shlok_pr6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="xvGhUopECJc"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube_activity)
        val mywebview=findViewById<WebView>(R.id.web)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true

        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}