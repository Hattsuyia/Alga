package com.thiago.contaspagar.servicos;

import com.thiago.pagamento.Beneficiario;
import com.thiago.pagamento.DocumentoPagavel;
import com.thiago.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        metodoPagamento.pagar(documento);
    }
}
