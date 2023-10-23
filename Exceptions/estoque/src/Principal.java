import com.thiago.estoque.Produto;

public class Principal {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook");
        produto.ativar();
        produto.adicionarEstoque(10);
        produto.retirarEstoque(5);

        System.out.printf("Estoque: %d %s%n", produto.getQuantidadeEstoque(), produto.getNome() );
    }
}
