package com.thiago.pagamento;

public class Transferencia implements MetodoPagamento{
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Beneficiario não possui conta bancária");
        }

        System.out.printf("Debug: Efetuando Transferencia para %s no valor de %.2f na conta bancária %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
