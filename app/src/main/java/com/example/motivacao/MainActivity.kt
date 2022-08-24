package com.example.motivacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //esconder barra de navegação
        supportActionBar?.hide()

        handleUserName()

        //eventos
        binding.buttonNewPhrase.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_new_phrase){
            var s = ""
        }
    }

    private fun handleUserName(){
        val name = SecurityPreferences(this).getString("USER_NAME")
        binding.textUserName.text ="Olá, ${name}!"
    }
}