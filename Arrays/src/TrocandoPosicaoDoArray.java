import java.util.Arrays;

public class TrocandoPosicaoDoArray {
    public static void main(String[] args) {

        int[] jogoAtual = {15, 18, 33, 55, 27, 8, 21};
        int[] novoJogo = new int[jogoAtual.length-1];

        int indiceExclusao = 2;

        System.arraycopy(jogoAtual,0,novoJogo,0, indiceExclusao);
        System.arraycopy(jogoAtual,indiceExclusao+1,novoJogo,indiceExclusao,novoJogo.length-indiceExclusao);

        System.out.println(Arrays.toString(jogoAtual));
        System.out.println(Arrays.toString(novoJogo));
    }
}
