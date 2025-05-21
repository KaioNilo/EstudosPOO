public class Carro {
    private String tipoCombustivel;
    private int quilometragem;
    private int velocidadeMax;

    public Carro(String tipoCombustivel, int quilometragem, int velocidadeMax) {
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.velocidadeMax = velocidadeMax;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public void andar () {
        System.out.println("Andando");
    }

    public void frear () {
        System.out.println("Freando");
    }

    public void ligar (String dono ) {
        System.out.println("Ligou com o" + dono);
    }

    public void ligar (int hora, int min) {
        if (hora == 12 && min == 0) {
            System.out.println("Ligando na hora certa");
        }
    }


    public void desligar () {
        System.out.println("Desligando");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", quilometragem=" + quilometragem +
                ", velocidadeMax=" + velocidadeMax +
                '}';
    }
}
