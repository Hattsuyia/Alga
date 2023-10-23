package com.thiago.pagamento;

public interface DocumentoPagavel {

    //Classe abstrata é muito parecida com a Interface, mas a abstração de interface é maior,
    //serve para definir o contrato, alem do que outras classes poderem ter mais de uma
    //implementação na mesma classe, e quando falamos em herdar as outras
    //classes podem apenas herdar 1 classe.

    //public abstract dentro de interface não precisa declarar

    public abstract double getValorTotal();

    Beneficiario getBeneficiario();
}
