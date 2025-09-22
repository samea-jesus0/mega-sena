package com.example.megatigrinho

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.megatigrinho.databinding.ActivityMainBinding
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var prefs: SharedPreferences

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val botao = binding.button
        val resultado = binding.numerosAleatorios
        val numero = binding.editTextText

        prefs = getSharedPreferences("db", Context.MODE_PRIVATE)
        val result = prefs.getString("result", null)
        if(result != null){
            resultado.text = "Última aposta: \n $result"
        }

        botao.setOnClickListener {
            val text = numero.text.toString()
            numberGenerator(text, resultado)

        }
    }

    @SuppressLint("SetTextI18n")
    private fun numberGenerator(text: String, txt_result: TextView){

        if (text.isEmpty() || text.toInt() < 6 || text.toInt() > 15){
            txt_result.text = "Informe um número entre 6 e 15"
        }else{
            val qtd = text.toInt()
            val numbers = mutableSetOf<Int>()
            val random = java.util.Random()

            while (numbers.size < qtd) {
                val number = random.nextInt(60) + 1
                numbers.add(number)
            }

            val resultadoFinal = numbers.joinToString(" - ")

            txt_result.text = resultadoFinal

            prefs.edit {
                putString("result", resultadoFinal)
            }
        }

    }

}