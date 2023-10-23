package refatoracao.entities;

public class Calendario {
    static final String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho","Agosto", "Setembro",
    "Outubro", "Novembro", "Dezembro"};
    public static String obterNomeMes(int numeroMes) {
        if (numeroMes<1 || numeroMes> 12){
            return null;
        }
        return meses[numeroMes-1];
    }
}
