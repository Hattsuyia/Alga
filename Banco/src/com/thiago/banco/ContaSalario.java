package com.thiago.banco;

public class ContaSalario extends Conta{
    double salario;

    public ContaSalario(Titular titular, int agencia, int numero, double saldo) {
        super(titular, agencia, numero, saldo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
