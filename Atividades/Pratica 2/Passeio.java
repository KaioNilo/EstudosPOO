public class Passeio extends Carro {

    public void passear () {
        System.out.println("Passeando");
    }

    public Passeio(String tipoCombustivel, int quilometragem, int velocidadeMax) {
        super(tipoCombustivel, quilometragem, velocidadeMax);
    }
}
