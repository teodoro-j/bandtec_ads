package com.example.fragmentado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trazerEnsinamentoSuave(component: View) {
        findViewById<FrameLayout>(R.id.fr_ensinamento).removeAllViews()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fr_ensinamento, FragmentoSuave()).commit()
    }

    fun trazerEnsinamentoForte(component: View) {
        findViewById<FrameLayout>(R.id.fr_ensinamento).removeAllViews()

        val parametros = Bundle()
        parametros.putString("Usuario", "ZeRuela")
        parametros.putInt("idade", 26)

        val fragmento = FragmentoForte()

        fragmento.arguments = parametros

        supportFragmentManager.beginTransaction()
            .replace(R.id.fr_ensinamento, fragmento).commit()
    }
}