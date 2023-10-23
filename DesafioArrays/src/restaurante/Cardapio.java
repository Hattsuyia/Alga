package restaurante;

import java.util.ArrayList;

public class Cardapio {
    ArrayList<ItemCardapio>itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
        //implementar inclusão de item do cardápio
        itens.add(item);
    }

    void removerItem(int indice) {
        //implementar exclusão de item do cardápio da posição informada
       itens.remove(indice);
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        //implementar código para imprimir na console os itens
        //do cardápio que estiverem entre o preço mínimo e máximo
        for (ItemCardapio item : itens) {
            if(item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }
    }
}
