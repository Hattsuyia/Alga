import com.thiago.financeira.modelo.ClienteFinanciavel;
import com.thiago.financeira.modelo.Funcionario;
import com.thiago.financeira.modelo.PessoaBonificavel;
import com.thiago.financeira.servico.ServicoPagamentoBonus;

public class Principal2 {
    public static void main(String[] args) {
        ServicoPagamentoBonus bonus = new ServicoPagamentoBonus();
        PessoaBonificavel funcionario = new Funcionario("Joao Jose", 18_000);

        bonus.pagar(funcionario, 80);


    }
}
