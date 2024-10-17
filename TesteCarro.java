public class TesteCarro {
  public static void main(String[] args) {
    Carro carro1 = new Carro ("Ferrari", 100);
    Carro carro2 = new Carro ("Lamborghini", 120);

    carro1.acelerar(50);
    carro2.frear(30);

    System.out.println("Carro 1: " + carro1.getModelo() + " - Velocidade: " + carro1.getVelocidade() + " km/h");
    System.out.println("Carro 2: " + carro2.getModelo() + " - Velocidade: " + carro2.getVelocidade() + " km/h");
  }
}
