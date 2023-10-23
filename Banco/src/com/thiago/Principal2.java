package com.thiago;

import com.thiago.banco.ContaInvestimento;
import com.thiago.banco.Titular;

public class Principal2 {
    public static void main(String[] args) {

        var titular = new Titular("João da Silva", "12312312300");
        ContaInvestimento conta1 = new ContaInvestimento(titular, 1223, 555889);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }

}
