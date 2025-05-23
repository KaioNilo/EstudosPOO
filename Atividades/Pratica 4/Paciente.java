public class Paciente extends Pessoa{

    public Paciente (String cpf, String nome, String email, String senha) {
        super(cpf, nome, email, senha);
    }

    @Override
    public void exibir() {
        System.out.println(cpf);
    }

}
