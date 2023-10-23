public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean temAdicionalFilhos (){
        return funcionario.temFilhos();
    }
}
