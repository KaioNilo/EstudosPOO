public class Visitante extends Pessoa {

    //Construtor
    public Visitante (String cpf, String nome, int idade) {
      super(cpf, nome, idade);
    };

    //MÉTODOS
    @Override
    public void exibir() {
        System.out.println("Nome Visitante: " + getNome() + ", CPF: " + getCpf());
    };

}
