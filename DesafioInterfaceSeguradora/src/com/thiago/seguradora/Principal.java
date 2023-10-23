package com.thiago.seguradora;

import com.thiago.seguradora.model.Caminhao;
import com.thiago.seguradora.model.CarroParticular;
import com.thiago.seguradora.model.ImovelResidencial;
import com.thiago.seguradora.service.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        var imovelResidencial = new ImovelResidencial(2_300_000, 320);
        var carroParticular = new CarroParticular("BMW", 150_000, 2022);
        var caminhao = new Caminhao("IVECO",780_000, 2021, 4);

        servicoPropostaSeguro.emitir(imovelResidencial);
        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);
    }
}
