package com.thiago.banco;

public class ContaEspecial extends ContaInvestimento{

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }
    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel(){
        return getSaldo()+getLimiteChequeEspecial();
    }
    public void debitarTarifaMensal(){
        sacar(getTarifaMensal());
    }

    protected void validarSaque(double valorSaque){
        if (getSaldoDisponivel() <valorSaque){
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
    @Override
    public void imprimirDemonstrativo (){
        super.imprimirDemonstrativo();
        System.out.printf("Saldo Disponível: %.2f%n", getSaldoDisponivel());
    }
}
