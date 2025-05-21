public abstract class Aluno extends Pessoa {
    //Atributos
    private int matricula;

    //Métodos

    //Construtores
    public Aluno(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    //Getters && Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Pagamento
    public void pagarMensalidade() {
        System.out.println("Pagamento Efetuado.");
    }

    //To String
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                '}';
    }


}
