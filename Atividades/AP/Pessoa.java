public abstract class Pessoa {
    //ATRIBUTOS:
    protected String cpf;
    protected String nome;
    protected int idade;


    //Construtores
    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    //MÉTODOS:

    //To String
    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    //Exibir
    public void exibir() {

    }

    //Aniversário
    public void fazerAniversario() {
        this.idade+= 1;
    }

}
