package com.algoritmo.viewbindingexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.algoritmo.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btRegister.setOnClickListener {
            Toast.makeText(this, "Registro aún no disponible", Toast.LENGTH_SHORT).show()
        }
        binding.btLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

//        setContentView(R.layout.activity_main)
//        val loginButton = findViewById<Button>(R.id.btLogin)
//        loginButton.setOnClickListener {
//            startActivity(Intent(this, HomeActivity::class.java))
//        }
    }
}
