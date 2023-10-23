package com.thiago.contaspagar.modelo;

import com.thiago.pagamento.Beneficiario;
import com.thiago.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {

    private double valorHora;
    private double quantidadeHoras;

    private Beneficiario funcionario;

    public Holerite(double valorHora, double quantidadeHoras, Beneficiario funcionario) {
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        this.funcionario = funcionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public Beneficiario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Beneficiario funcionario) {
        this.funcionario = funcionario;
    }


    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }
}
