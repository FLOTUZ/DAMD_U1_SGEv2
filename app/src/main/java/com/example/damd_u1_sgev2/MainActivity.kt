package com.example.damd_u1_sgev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.damd_u1_sgev2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Se declara el binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.fab.setOnClickListener {
            val intent = Intent(this, DrawerActivity::class.java)
            startActivity(intent)
        }
    }
}