import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do Funcionario: ");
        funcionario.nome = scanner.nextLine();

        System.out.println("Funcionario tem filhos? SIM ou NAO ");
        char opcao = scanner.next().toLowerCase().charAt(0);

        if (opcao =='s') {
            System.out.println("Quantos filhos o funcionario possui? ");
            funcionario.quantidadeDeFilhos = scanner.nextInt();
        }
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;

        System.out.println("Qual valor da hora normal? ");
        contratoTrabalho.valorHoraNormal = scanner.nextDouble();
        System.out.println("Qual valor da hora extra? ");
        contratoTrabalho.valorHoraExtra = scanner.nextDouble();

        FolhaPagamento folhaPagamento = new FolhaPagamento();

        System.out.println("Quantas horas o funcionario trabalhou? ");
        int horasTrabalhadasNormais = scanner.nextInt();
        System.out.println("Quantas horas Extras o funcionario trabalhou? ");
        int horasTrabalhadasExtras = scanner.nextInt();

        Holerite holerite = folhaPagamento.calcularSalario(horasTrabalhadasNormais, horasTrabalhadasExtras,
                contratoTrabalho);
        System.out.println();
        holerite.imprime();

        scanner.close();
    }
}
