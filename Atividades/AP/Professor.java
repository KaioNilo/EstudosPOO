public class Professor extends Pessoa {
    //Atributo
    private String centro;

    //Construtores
    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    //Métodos

    //Getters && Setters
    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    //Dar Aula
    public void darAula() {
        System.out.println("Professor dando aula.");
    }

    @Override
    public void exibir() {
        System.out.println("Nome Professor: " + getNome() + ", Centro: " + centro);
    };

}
