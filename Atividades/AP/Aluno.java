public abstract class Aluno extends Pessoa {
    //Atributos
    protected int matricula;


    //Construtores
    public Aluno(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    //MÉTODOS:

    //Pagamento
    public void pagarMensalidade() {
        System.out.println("Pagamento Efetuado.");
    }


    @Override
    public void exibir() {
        System.out.println("Nome Aluno: " + getNome() + ", Matrícula: " + matricula);
    };

    //Get & Set

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
