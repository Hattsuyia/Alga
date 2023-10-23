package com.impostos.thiago;

public class GestorImpostos {
    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar (Pessoa pessoa){
        double valorImpostosCalculados = pessoa.calcularImpostos();
        System.out.printf("Impostos devidos de %s: R$%.2f%n", pessoa.getNome(), valorImpostosCalculados);

        valorTotalImpostos += valorImpostosCalculados;
    }

}
