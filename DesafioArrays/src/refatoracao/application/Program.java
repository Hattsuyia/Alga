package refatoracao.application;

import refatoracao.entities.Calendario;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual mes será mostrado: ");
        int numero = scanner.nextInt();
        String mes = Calendario.obterNomeMes(numero);

        System.out.println(mes);
    }
}
