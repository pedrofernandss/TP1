import java.util.Scanner;

class Retangulo{
    private int comprimento = 1;
    private int largura = 1;

    public void lerDados(Scanner ler){
        setComprimento(ler.nextInt());
        setLargura(ler.nextInt());
    }

    public int getComprimento(){
        return comprimento;
    }

    public int getLargura(){
        return largura;
    }

    public void setComprimento(int comprimento){
        if(comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }
    }

    public void setLargura(int largura){
        if(largura > 0 && largura < 20) {
            this.largura = largura;
        }
    }

    public int perimetro(){
        return 2*(comprimento + largura);
    }

    public int area(){
        return comprimento * largura;
    }
}

public class Formas{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo retangulo01 = new Retangulo();
        Retangulo retangulo02 = new Retangulo();
        retangulo01.lerDados(ler);
        retangulo02.lerDados(ler);

        System.out.println(retangulo01.getComprimento() + " " + retangulo01.getLargura() + " " + retangulo01.perimetro() + " " + retangulo01.area());
        System.out.println(retangulo02.getComprimento() + " " + retangulo02.getLargura() + " " + retangulo02.perimetro() + " " + retangulo02.area());

        ler.close();
    }
}