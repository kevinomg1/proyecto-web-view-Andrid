package com.example.huaweicon

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.widget.SearchView
import com.example.huaweicon.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val Base_URL = "https://www.google.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Webview
        binding.webWiev.webChromeClient = object : WebChromeClient() {

        }
      /*  webWiev.webChromeClient = object : WebChromeClient() {

        }
        */
        binding.webWiev.webViewClient = object : WebViewClient(){

        }


        binding.webWiev.settings.javaScriptEnabled= true

        binding.webWiev.loadUrl(Base_URL)

    }

    override fun onBackPressed() {

        if(binding.webWiev.canGoBack() ){
            binding.webWiev.goBack()
        }else{
            super.onBackPressed()

        }
    }
}