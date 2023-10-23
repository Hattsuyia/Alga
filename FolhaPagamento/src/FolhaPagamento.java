public class FolhaPagamento {

    Holerite calcularSalario (int HorasNormaisTrabalhadas, int HorasExtrasTrabalhadas,
                            ContratoTrabalho contratoTrabalho){

        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorHoraNormal = HorasNormaisTrabalhadas* contratoTrabalho.valorHoraNormal;
        holerite.valorHoraExtra = HorasExtrasTrabalhadas* contratoTrabalho.valorHoraExtra;

        double valorTotal = holerite.valorHoraNormal + holerite.valorHoraExtra;

        if (contratoTrabalho.temAdicionalFilhos()){
            holerite.valorAdicionalFilhos = valorTotal *0.1;
        }

        return holerite;
    }
}
