public class Medico extends Pessoa{
    public String crm;

    public Medico (String cpf, String nome, String email, String senha, String crm) {
        super(cpf, nome, email, senha);
        this.crm = crm;
    }

    @Override
    public void exibir() {
        System.out.println(crm);
    }


}
