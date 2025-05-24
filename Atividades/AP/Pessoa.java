public abstract class Pessoa {
    //ATRIBUTOS:
    private String cpf;
    private String nome;
    private int idade;


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


    //Get & Set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
