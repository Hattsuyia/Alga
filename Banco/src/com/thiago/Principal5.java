package com.thiago;

import com.thiago.banco.*;

public class Principal5 {
    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("João da Silva", "12312312300"),
                1234, 999999);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(new Titular("João da Silva", "12312312300"),
                1234, 999999, 18_000);
        conta3.depositar(100);

        caixaEletronico.imprimirDemonstrativo(conta3);
    }
}
