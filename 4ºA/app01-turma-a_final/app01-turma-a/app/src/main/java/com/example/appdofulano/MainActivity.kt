package com.example.appdofulano

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    Para associar uma função a eventos de componentes no XML,
    ela deve, NECESSARIAMENTE, ter um argumento do tipo View
     */
    fun cliqueAqui(componente:View) {
        Toast.makeText(this, "É nois", Toast.LENGTH_LONG).show()
    }

    fun mexerTextos(componente:View) {
        val novoTexto = et_usuario.text
        tv_topo.text = novoTexto

        // mudar a cor do tv_segundo para qualquer outra
        tv_segundo.setTextColor(Color.parseColor("#0000FF"))
        //tv_segundo.setTextColor(Color.BLUE)

        // mudar a visibilidade de qualquer um dos TextViews (escolha um)
        tv_secreto.visibility = View.VISIBLE
        //tv_secreto.visibility = View.GONE
        //tv_secreto.visibility = View.INVISIBLE

        // Conventendo um valor de EditText em número
        val numeroQualquer = et_usuario.text.toString().toInt()
        // val numeroQualquer = et_usuario.text.toString().toDouble()

        Toast.makeText(this, "O dobro é ${numeroQualquer*2}", Toast.LENGTH_SHORT).show()

    }
}