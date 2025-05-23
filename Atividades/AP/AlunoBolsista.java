public class AlunoBolsista extends Aluno {

    //Construtores
    public AlunoBolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    //MÉTODOS

    //Pagar Mensalidade
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagamento com desconto.");
    }

}
