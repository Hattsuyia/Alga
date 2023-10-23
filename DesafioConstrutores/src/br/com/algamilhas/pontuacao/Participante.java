package br.com.algamilhas.pontuacao;

import java.util.Objects;

public class Participante {
    private String nome;
    private int saldoDePontos;

    public Participante(String nome) {
        this (nome, 0);
    }

    private Participante(String nome, int saldoDePontos) {
        Objects.requireNonNull(nome,"Não pode ser nome nulo");

        if(saldoDePontos<0){
            throw new IllegalArgumentException("O Saldo inicial não pode ser menor que zero");
        }
        
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }
    public void creditarPontos (int pontos){
        if(pontos<0){
            throw new IllegalArgumentException("Não pode creditar pontos negativos");
        }

        this.saldoDePontos += pontos;
    }
}
