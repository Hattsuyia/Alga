package com.github.hattsuyia.rh;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        setNome(nome);
        setValorHora(valorHora);
    }

    public String getNome() {
        Objects.requireNonNull(nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora<0){
            throw new RuntimeException("Valor da hora tem que ser maior que zero!!!");
        }
        this.valorHora = valorHora;
    }

    protected double calcularSalario (int horasTrabalhadas){
        return getValorHora()*horasTrabalhadas;
    }
    public Holerite gerarHolerite (int horasTrabalhadas, String mesAno){
        double valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno, valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
