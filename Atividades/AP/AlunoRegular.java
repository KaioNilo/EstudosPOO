public class AlunoRegular extends  Aluno {

    //Construtores
    public AlunoRegular(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    //Métodos

    //Pagamento
    public void pagarMensalidade() {
        System.out.println("Pagamento regular.");
    }

}
