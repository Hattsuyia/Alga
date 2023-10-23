package com.thiago.financeira.modelo;

public interface ClienteFinanciavel {

    //em interfaces não conseguimos colocar variveis de instancia, é tudo final.
    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    //essa forma de escrever é a mesma que a anterior, mas não eh necessario declarar desta forma
    //quando estamos falando de interfaces
    public static final double JUROS_ALTO_RISCO = 2.0;

    //definir tipo sem implementação objetivo das interface
    double calcularLimiteAprovado();

    //usa o "default" quando tem uso da interface em outras classes que não temos acesso e precisamos
    //implementar algum metodo novo
    default double calcularJuros (double valorSolicitado){
        if (isFinancimentoPequenoValor(valorSolicitado)){
            return JUROS_BAIXO_RISCO;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }
        return JUROS_ALTO_RISCO;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    private static boolean isFinancimentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }
}
