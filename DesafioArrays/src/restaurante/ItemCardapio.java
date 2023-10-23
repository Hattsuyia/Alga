package restaurante;

public class ItemCardapio {
    String descricao;
    double preco;

    boolean possuiPrecoEntre (double precoMinimo, double precoMaximo){
        return preco >= precoMinimo && preco<=precoMaximo;
    }

    void imprimir(){
        System.out.printf("%s - R$%.2f%n", descricao, preco);
    }

}
