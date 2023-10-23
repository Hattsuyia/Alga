public class Principal2 {
    public static void main(String[] args) {

        Turma2 turmaA = new Turma2();
        turmaA.identificacao = "Maternal";
        turmaA.nomeProfessora = "Fernanda";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Nadia";
        aluno1.idade = 5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Crono";
        aluno2.idade = 4;

        turmaA.adicionarAlunos(aluno1);
        turmaA.adicionarAlunos(aluno2);

        turmaA.imprimirListaAlunos();
    }
}
