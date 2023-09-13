package com.example.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navegar.setOnClickListener{
            val intent = Intent(this,Tela2::class.java)
            val nom = binding.nome.text.toString()

            intent.putExtra("nome",nom)
            startActivity(intent)
        }
    }
}