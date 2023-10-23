package com.thiago;

import com.thiago.banco.Conta;
import com.thiago.banco.Titular;

public class Principal {
    public static void main(String[] args) {

        var titular = new Titular("Joazinho", "12345678911");

        Conta conta1 = new Conta(titular, 1589, 778590);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);

        conta1.imprimirDemonstrativo();

        conta1.sacar(50.50);

        conta1.imprimirDemonstrativo();
    }
}
