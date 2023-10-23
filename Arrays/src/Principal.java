
public class Principal {
    public static void main(String[] args) {
        Turma turmaA = new Turma();

        turmaA.identificacao = "Infantil 1";
        turmaA.nomeProfessora = "Fernanda";
        turmaA.alunos = new Aluno[2];

        turmaA.alunos[0] = new Aluno();
        turmaA.alunos[0].nome = "Juquinha";
        turmaA.alunos[0].idade = 3;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Rafaela";
        aluno1.idade = 4;

        turmaA.alunos[1]= aluno1;

        for(Aluno aluno : turmaA.alunos){
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Idade: "+ aluno.idade);
        }

        System.out.println("-----------------------------------");
        System.out.println("com printf");

        for (int i = 0; i < turmaA.alunos.length; i++) {
            Aluno aluno = turmaA.alunos[i];
            if (aluno != null) {
                System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, aluno.idade);
            } else {
                System.out.printf("%d - Vago%n", i);
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("usando metodo de classe");

        turmaA.imprimirListaAlunos();
    // fazer a interação do array usando o for.

    //        for (int i=0; i<turmaA.alunos.length; i++){
    //            Aluno aluno = new Aluno();
    //            aluno.nome = "Novo Aluno" + i+1;
    //            aluno.idade = i+2;
    //            turmaA.alunos[i]= aluno;
    //        }
    }
}
