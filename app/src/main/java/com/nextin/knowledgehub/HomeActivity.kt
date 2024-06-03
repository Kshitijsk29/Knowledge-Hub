package com.nextin.knowledgehub

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nextin.knowledgehub.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding =ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.tvAndroid.setOnClickListener{
            intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }

        binding.tvJava.setOnClickListener{
            intent = Intent(applicationContext, JavaActivity::class.java)
            startActivity(intent)
        }

        binding.tvDs.setOnClickListener{
            intent = Intent(applicationContext, DataScienceActivity::class.java)
            startActivity(intent)
        }
        binding.tvWeb.setOnClickListener{
            intent = Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }
        binding.tvAws.setOnClickListener{
            intent = Intent(applicationContext, AwsActivity::class.java)
            startActivity(intent)
        }
        binding.tvMl.setOnClickListener{
            intent = Intent(applicationContext, AIActivity::class.java )
            startActivity(intent)
        }
    }
}