import com.github.hattsuyia.rh.Funcionario;
import com.github.hattsuyia.rh.Holerite;
import com.github.hattsuyia.rh.Programador;

public class Principal {
    public static void main(String[] args) {
        var funcionario = new Funcionario("Juquinha", 30);
        System.out.println(funcionario);

        Holerite holerite1 = funcionario.gerarHolerite(180, "julho/2023");

        holerite1.imprimir();

        System.out.println();

        var programador = new Programador("Rafaela", 30);
        programador.setValorBonus(3000);
        System.out.println(programador);

        Holerite holerite2 = programador.gerarHolerite(180, "julho/2023");

        holerite2.imprimir();

    }
}
