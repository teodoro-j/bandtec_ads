package com.example.dados_offline

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    var preferencias: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferencias = getPreferences(Context.MODE_PRIVATE)

        val usuario = preferencias?.getString("usuario", null)

        if (usuario != null) {

        }
    }

    fun entrar(componente:View) {
        if (findViewById<Switch>(R.id.sw_lembrar).isChecked){
            val editor = preferencias?.edit()
            editor?.putString("usuario", findViewById<EditText>(R.id.et_login).text.toString())

            editor?.commit()
        }
    }
}