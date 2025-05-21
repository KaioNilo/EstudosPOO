public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Gás", 2000, 180);

        System.out.println(carro1);

        Passeio passeio = new Passeio("Disel", 1500, 160);
        Esportivo esportivo = new Esportivo("Gasolina", 2500, 220);

        //esportivo.ligar();
        esportivo.turbinar();
        esportivo.frear();
        passeio.frear();
        passeio.passear();


    }
}
