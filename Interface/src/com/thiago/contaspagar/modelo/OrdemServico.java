package com.thiago.contaspagar.modelo;

import com.thiago.pagamento.Beneficiario;
import com.thiago.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {
    private double valorTotal;
    private Beneficiario fornecedor;

    public OrdemServico(double valorTotal, Beneficiario fornecedor) {
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return fornecedor;
    }
}
