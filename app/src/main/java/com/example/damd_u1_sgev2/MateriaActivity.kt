package com.example.damd_u1_sgev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.damd_u1_sgev2.databinding.ActivityMainBinding
import com.example.damd_u1_sgev2.databinding.ActivityMateriaBinding

class MateriaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMateriaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMateriaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent.getStringExtra("ID_MATERIA")
        Toast.makeText(this, "$intent", Toast.LENGTH_SHORT).show()
    }
}