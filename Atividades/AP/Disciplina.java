public class Disciplina {
    //ATRIBUTOS:
    public int codigo;
    public String nome;
    public int semestre;
    public Professor professor;


    //Construtores
    public Disciplina(int codigo, String nome, int semestre, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
        this.professor = professor;
    }

    //MÉTODOS:
    //Adc Aluno
    public void adcProf(Professor p) {

    }

    //Get & Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
