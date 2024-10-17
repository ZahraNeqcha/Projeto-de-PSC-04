public class Carro {
    private String modelo;
    private double velocidade;

    public String getModelo() {
        return modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(double incremento) {
        this.velocidade += incremento;
        System.out.println("Acelerando... Nova velocidade: " + this.velocidade + " km/h");
    }


    public void frear(double decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
        System.out.println("Freando... Nova velocidade: " + this.velocidade + " km/h");
    }
}
