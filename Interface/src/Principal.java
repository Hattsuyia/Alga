import com.thiago.contaspagar.modelo.Holerite;
import com.thiago.contaspagar.modelo.OrdemServico;
import com.thiago.contaspagar.servicos.ServicoContaPagar;
import com.thiago.pagamento.Beneficiario;
import com.thiago.pagamento.MetodoPagamento;
import com.thiago.pagamento.Transferencia;

public class Principal {
    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("Zeca do Pao", "88877744499", "88557");
        Holerite holerite = new Holerite(100, 168, funcionario) ;

        Beneficiario fornecedor = new Beneficiario("Consultoria Legal", "55789654000188", "123456");
        OrdemServico ordemServico = new OrdemServico(65_000, fornecedor);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(ordemServico);
    }
}
