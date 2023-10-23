package com.thiago.banco;

import java.util.Objects;

public class Conta {

    private Titular titular;
    private int agencia;
    private int numero;
    double saldo;

    public Conta(Titular titular, int agencia, int numero) {
    }

    public Conta(Titular titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean possuiGratuidadeImpressao(){
        return false;
    }
    protected void validarSaque(double valorSaque){
        if (getSaldo() <valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaque(valorSaque);

        saldo -= valorSaque;
    }

    public void depositar (double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor do deposito tem que ser maior que 0");
        }

        saldo += valorDeposito;
    }
    public void imprimirDemonstrativo (){
        System.out.println();
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }
}
