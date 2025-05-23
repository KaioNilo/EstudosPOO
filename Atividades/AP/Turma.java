import java.util.ArrayList;
import java.util.List;

public class Turma {
    //Atributos
    public int codigo;
    public Professor professor;
    public Disciplina disciplina;
    public ArrayList<Aluno> alunos;

    //Construtores
    public Turma (int codigo, Professor professor, Disciplina disciplina) {
      this.codigo = codigo;
      this.professor = professor;
      this.disciplina = disciplina;
      this.alunos = new ArrayList<>();
    };

    //MÉTODOS
    //Adc Aluno
    public void adcAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    //Remover Aluno
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    //Listar Alunos
    public void listarAlunos() {
        for (Aluno aluno: alunos) {
            System.out.println(aluno.nome + " - Matrícula: " + aluno.matricula + ".");
        }
    }

    public List<Aluno> exibir() {
        return alunos;
    }


}
