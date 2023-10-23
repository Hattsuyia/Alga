public class Holerite {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;
    double valorAdicionalFilhos;

    double calcularValorTotal (){
        return valorHoraNormal+valorHoraExtra + valorAdicionalFilhos;
    }

    void imprime (){
        System.out.println("HOLERITE");
        System.out.println("-----------------");
        System.out.printf("Nome do funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das horas normais: R$ %.2f%n", valorHoraNormal);
        System.out.printf("Valor das horas extras: R$ %.2f%n", valorHoraExtra);
        System.out.printf("Adicional para filhos: R$ %.2f%n", valorAdicionalFilhos);
        System.out.printf("Valor total: R$ %.2f%n", calcularValorTotal());
    }
}
