package com.thiago.financeira.modelo;

public class Fazenda extends EmpresaFinanciavel {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE = 1.2;
    public static final double TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE = 5;

    private double tamnhoEmHectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamnhoEmHectares) {
        super(razaoSocial, totalFaturamento);
        this.tamnhoEmHectares = tamnhoEmHectares;
    }

    public double getTamnhoEmHectares() {
        return tamnhoEmHectares;
    }

    public void setTamnhoEmHectares(double tamnhoEmHectares) {
        this.tamnhoEmHectares = tamnhoEmHectares;
    }


    @Override
    public double calcularLimiteAprovado() {
        double limiteAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if (getTamnhoEmHectares() > TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE){
            limiteAprovado*=TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE;
        }
        return limiteAprovado;
    }
}
