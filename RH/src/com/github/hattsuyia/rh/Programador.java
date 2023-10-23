package com.github.hattsuyia.rh;

public class Programador extends Funcionario{

    double valorBonus;
    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus<0) {
            throw new IllegalArgumentException("Valor do bonus deve ser maior que zero!!");
        }
        this.valorBonus = valorBonus;
    }

    @Override
    protected double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + getNome() + '\'' +
                ", valorHora=" + getValorHora() +
                ", valorBonus=" + valorBonus +
                '}';
    }
}
