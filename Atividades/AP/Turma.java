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
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }


    //Get & Set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
