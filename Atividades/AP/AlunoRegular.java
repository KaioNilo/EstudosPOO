public class AlunoRegular extends  Aluno {
    //Métodos

    //Construtores
    public AlunoRegular(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    //Pagamento
    public void pagarMensalidade() {
        System.out.println("Pagamento regular.");
    }

}
