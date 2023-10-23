package com.thiago;

import com.thiago.banco.ContaEspecial;
import com.thiago.banco.Titular;

public class Principal3 {
    public static void main(String[] args) {
        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 9999,90);

        conta1.setAgencia(1234);
        conta1.setNumero(999999);
        conta1.setLimiteChequeEspecial(1000);
        conta1.setTarifaMensal(90);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(200);
        conta1.imprimirDemonstrativo();

        conta1.debitarTarifaMensal();
        conta1.imprimirDemonstrativo();
    }

}
