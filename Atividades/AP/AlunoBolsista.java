public class AlunoBolsista extends Aluno {
    //Métodos

    //Construtores
    public AlunoBolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    public void pagarMensalidade() {
        System.out.println("Pagamento com desconto.");
    }

}
