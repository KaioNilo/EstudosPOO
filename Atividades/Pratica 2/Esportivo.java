public class Esportivo extends Carro {
    public Esportivo(String tipoCombustivel, int quilometragem, int velocidadeMax) {
        super(tipoCombustivel, quilometragem, velocidadeMax);
    }

    public void turbinar () {
        System.out.println("Turbinando");
    }

    public void frear () {
        System.out.println("Freio esportivo");
    }
}
