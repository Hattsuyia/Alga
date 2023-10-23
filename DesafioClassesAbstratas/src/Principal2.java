import com.impostos.thiago.EmpresaLucroReal;
import com.impostos.thiago.EmpresaSimples;
import com.impostos.thiago.GestorImpostos;
import com.impostos.thiago.PessoaFisica;

public class Principal2 {
    public static void main(String[] args) {
        var gestorImpostos = new GestorImpostos();

        var rick = new PessoaFisica("Rick Legal", 42_000);
        var mariazinha = new PessoaFisica("Maria Alves", 150_000);

        var barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        var consultoriaBacana = new EmpresaLucroReal("Consultoria Bacana", 5_000_000, 2_000_000);

        gestorImpostos.adicionar(rick);
        gestorImpostos.adicionar(mariazinha);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(consultoriaBacana);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }
}
