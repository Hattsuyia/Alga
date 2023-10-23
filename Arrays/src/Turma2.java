import java.util.Arrays;

public class Turma2 {
    String identificacao;
    String nomeProfessora;
    Aluno[] alunos = new Aluno[0];
    //cria uma copia do array e adiciona uma posição e assim o array da ideia de ser escalavel
    void adicionarAlunos (Aluno aluno){
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length+1);
        alunos[alunos.length-1] = aluno;
    }
    void imprimirListaAlunos (){
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d - anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("Disponivel para matricula");
            }
        }
    }
}
