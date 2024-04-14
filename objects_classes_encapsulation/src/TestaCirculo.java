import java.util.Scanner;

class Circulo{
    private int x, y, raio;
    public static final double PI = 3.14;

    public Circulo(int x, int y, int raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getRaio(){
        return raio;
    }

    public void setRaio(int raio){
        this.raio = raio;
    }

    public double circunferencia(){
        return 2*PI*raio;
    }
}

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo[] vetor1 = new Circulo[3];
        for (int i = 0; i < vetor1.length; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int raio = scanner.nextInt();
            vetor1[i] = new Circulo(x, y, raio);
        }







    }
}

