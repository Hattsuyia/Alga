package com.thiago.financeira.servico;

import com.thiago.financeira.modelo.ClienteFinanciavel;

import javax.crypto.Cipher;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado){
        double limiteAprovado = cliente.calcularLimiteAprovado();
        double calculoJuros = cliente.calcularJuros(valorSolicitado);
        if (limiteAprovado < valorSolicitado){
            throw new RuntimeException(String.format("Financiamento não aprovado." +
                    "limite máximo de %.2f%n", limiteAprovado));
        }
        // registraríamos a solicitação do financiamento aqui em alguma classe de persistência de dados,
        // mas por enquanto, apenas imagine isso acontecendo...
        System.out.printf("DEBUG: Financiamento aprovado no valor de R$%.2f com taxa de juros de %.2f%%. Limite máximo de %.2f%n",
                valorSolicitado,calculoJuros, limiteAprovado);
    }

    public double consultarLimiteAprovado(ClienteFinanciavel cliente) {
        // aqui poderia registrar a consulta em algum lugar para um consultor comercial entrar em contato
        // com o cliente (não vamos fazer isso, porque o objetivo agora é estudar OO primeiro)

        return cliente.calcularLimiteAprovado();
    }
}
