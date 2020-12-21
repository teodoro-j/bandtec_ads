package br.com.bandtec.scrolleclienterest_turmaa

import java.math.BigDecimal

data class Filme (
        val id: Integer,
        val nome: String,
        val custoProducao: BigDecimal,
        val calssico: Boolean,
        val ano: Integer
)