package br.com.bandtec.scrolleclienterest_turmaa

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiFilmesRequest {

    @GET("/filmes")
    fun getFilmes(): Call<List<Filme>>

    @GET("/filmes/{id}")
    fun getFilmes(@Path("id")id:Integer): Call<Filme>

}