package br.com.bandtec.scrolleclienterest_turmaa

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // criando um objeto do tipo TextView
        val novoTv = TextView(baseContext)
        // baseContext é para "atrelar" o componete à Activity atual

        // configurando a TextView
        novoTv.text = "Meu texto em tempo de execução"
        novoTv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15f)
        novoTv.setTextColor(Color.parseColor("#FF0099"))

        // adicionando a TextView no LinearLayout
        ll_conteudo.addView(novoTv)

    }


    fun consumirApi() {
        val retrofit = Retrofit.Builder()
        .baseUrl("https://5f861cfdc8a16a0016e6aacd.mockapi.io/bandtec-api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

        val request = retrofit.create(ApiFilmesRequests::class.java)

        val callFilmes = request.getFilmes()
    }
}