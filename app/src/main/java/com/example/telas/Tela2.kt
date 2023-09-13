package com.example.telas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.telas.databinding.ActivityMainBinding
import com.example.telas.databinding.ActivityTela2Binding

class Tela2 : AppCompatActivity() {
    private lateinit var binding : ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.voltar.setOnClickListener{

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
recuperar()
        binding.botao.setOnClickListener { mensagem() }
    }


private fun recuperar(){
   val nome = intent.getStringExtra("nome")
    binding.nome.setText(nome)
}
    private fun mensagem(){
        val dial = AlertDialog.Builder(this)
        dial.setTitle("Hello!!")
        dial.setMessage("Você clicou em uma mensagem!")
        dial.setNeutralButton("OK",null)
        dial.show()

    }

}