package com.thiago.pagamento;

public class Pix implements MetodoPagamento{
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiPix()){
            throw new RuntimeException("Beneficiario não possui chave PIX");
        }

        System.out.printf("Debug: Efetuando PIX para %s no valor de %.2f com a chave %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
    }
}
