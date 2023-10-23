import com.impostos.thiago.GestorImpostos;
import com.impostos.thiago.PessoaFisica;

public class Principal1 {
    public static void main(String[] args) {
        GestorImpostos gestorImpostos = new GestorImpostos();

        PessoaFisica rick = new PessoaFisica("Rick", 60000);
        var mariazinha = new PessoaFisica("Mariazinha", 190_000);

        rick.calcularImpostos();
        mariazinha.calcularImpostos();

        gestorImpostos.adicionar(rick);
        gestorImpostos.adicionar(mariazinha);

        System.out.println("Total de impostos a ser recolhido é de: R$ " +gestorImpostos.getValorTotalImpostos());

    }
}
