package com.thiago.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5;

    public void transferir (Conta contaOrigem, Conta contaDestino, double valorTransferencia){


        System.out.printf("Transferindo R$%.2f da conta %d/%d para conta %d/%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia+TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

   /* public void imprimirDemonstrativo(Conta conta){

        if (conta instanceof ContaInvestimento contaInvestimento){
            //ContaInvestimento contaInvestimento = (ContaInvestimento) conta; poderia ter feito assim
            if (contaInvestimento.getValorTotalRendimentos()>0){
                System.out.println("Impressão de demonstrativo Gratuita");
            } else {

                debitarTarifaImpressaoDemonstrativo(conta);
            }
        } else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }
        //downcasting

        conta.imprimirDemonstrativo();
    }*/

    //substituindo o instanceof, importante evitar o instanceof

    public void imprimirDemonstrativo (Conta conta){
        if (conta.possuiGratuidadeImpressao()){
            System.out.println("Impressão de demonstrativo Gratuita");
        } else {
            debitarTarifaImpressaoDemonstrativo(conta);
        }
        conta.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressaoDemonstrativo(Conta conta) {
        System.out.printf("Tarifa de impressão do demonstrativo R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);

        conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
    }
}
