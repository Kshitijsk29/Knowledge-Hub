package com.nextin.knowledgehub

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nextin.knowledgehub.databinding.ActivityAwsBinding
import com.nextin.knowledgehub.databinding.ActivityDataScienceBinding

class DataScienceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDataScienceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDataScienceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        webViewSetUp(binding.webViewDataScience)
    }

    private fun webViewSetUp(webView: WebView) {
        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.javaScriptEnabled =true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.simplilearn.com/tutorials/data-science-tutorial")

        }
    }
}