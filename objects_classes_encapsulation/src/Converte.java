import java.util.Scanner;

class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void converteCF() {
        temperatura = (temperatura * 9.0 / 5.0) + 32;
    }

    public void converteFC() {
        temperatura = (temperatura - 32) * 5.0 / 9.0;
    }
}


public class Converte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        Temperatura temperatura = new Temperatura(temp);
        temperatura.converteCF();
        System.out.println("temperatura: " + temperatura.getTemperatura() + " graus fahrenheit");
        temperatura.converteFC();
        System.out.println("temperatura: " + temperatura.getTemperatura() + " graus celsius");
    }
}
