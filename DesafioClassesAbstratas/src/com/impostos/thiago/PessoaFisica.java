package com.impostos.thiago;

public class PessoaFisica extends Pessoa{

    public static double RECEITA_ANUAL_ISENCAO = 50_000;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        double imposto = 0;

        if (getReceitaAnual()> RECEITA_ANUAL_ISENCAO){
            imposto = getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
        }

        return imposto;
    }

}
