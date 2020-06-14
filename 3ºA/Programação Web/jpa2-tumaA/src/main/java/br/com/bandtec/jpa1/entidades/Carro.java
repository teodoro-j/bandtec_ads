package br.com.bandtec.jpa1.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carro {

    @Id
    @GeneratedValue
    private Integer id;

    // Esta anotação mapeia detalhes da coluna na tabela
    // nullable - diz se a coluna aceita null
    // length - indica o tamanho da coluna
    @Column(nullable = false, length = 15)
    private String marca;

    @Column(nullable = false, length = 20)
    private String modelo;

    private Double potencia;

    private Double preco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
