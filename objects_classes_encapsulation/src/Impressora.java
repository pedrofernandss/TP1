import java.util.Scanner;

public class Impressora {
    String modelo;
    String cor;
    String tipoPapel;
    boolean bluetooth = true;
    boolean wifi = true;
    boolean colorida = true;
    boolean ligada = false;
    boolean papel = true;
    boolean digitalizadora = true;
    boolean copiadora = false;

    public void lerDados(){
        Scanner leitor = new Scanner(System.in);
        this.modelo = leitor.next();
        this.cor = leitor.next();
        this.tipoPapel = leitor.next();
    }

    public void ligar() {
        if(!ligada) {
            System.out.println("ligando...");
            ligada = true;
        }
    }

    public void desligar() {
        if(ligada) {
            System.out.println("desligando...");
            ligada = false;
        }
    }

    public void imprimir(){
        if(ligada & papel){
            System.out.println("imprimindo...");
        }
        else if(ligada & !papel){
            System.out.println("sem papel");
        }
        else{
            System.out.println("impressora desligada");
        }
    }

    public void digitalizar(){
        if(ligada & digitalizadora){
            System.out.println("digitalização sendo realizada...");
        }
        else if(ligada & !digitalizadora){
            System.out.println("não é possível digitalizar");
        }
        else{
            System.out.println("impressora desligada");
        }
    }

    public void copiar(){
        if(ligada & copiadora){
            System.out.println("cópia sendo realizada");
        }
        else if(ligada & !copiadora){
            System.out.println("não é possível copiar");
        }
        else{
            System.out.println("impressora desligada");
        }
    }

    public void status(){
        if(bluetooth){
            System.out.println("bluetooth on");
        } else{
            System.out.println("bluetooth off");
        }
        if (wifi){
            System.out.println("wifi on");
        } else{
            System.out.println("wifi off");
        }
        if(colorida){
            System.out.println("impressão colorida");
        } else{
            System.out.println("impressão preto e branco");
        }
        if(ligada){
            System.out.println("impressora on");
        } else{
            System.out.println("impressora off");
        }
        if(papel){
            System.out.println("tem papel");
        } else{
            System.out.println("não tem papel");
        }
        if(digitalizadora){
            System.out.println("digitalizadora on");
        } else{
            System.out.println("digitalizadora off");
        }
        if(copiadora){
            System.out.println("copiadora on");
        } else{
            System.out.println("copiadora off");
        }
    }

    public static void main(String[] args) {
        Impressora imp = new Impressora();
        imp.lerDados();
        System.out.println(imp.modelo);
        System.out.println(imp.cor);
        System.out.println(imp.tipoPapel);
        imp.status();
        imp.ligar();
        imp.digitalizar();
        imp.copiar();
        imp.desligar();
        imp.imprimir();
    }
}