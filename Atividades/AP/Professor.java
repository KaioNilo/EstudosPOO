public class Professor extends Pessoa {
    //Atributo
    private String centro;

    //Métodos

    //Construtores
    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    //Getters && Setters
    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    //To String
    @Override
    public String toString() {
        return "Professor{" +
                "centro='" + centro + '\'' +
                '}';
    }

    //Dar Aula
    public void darAula() {
        System.out.println("Professor dando aula.");
    }


}
