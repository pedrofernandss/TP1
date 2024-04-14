import java.util.Objects;
import java.util.Scanner;

class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    public Conta(Scanner scanner) {
        this.numeroConta = scanner.nextInt();
        this.senha = scanner.nextInt();
        this.nomeCliente = scanner.next();
        this.saldo = scanner.nextDouble();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo(int senha) {
        if(senha == this.senha){
            return this.saldo;
        }
        return 0;
    }

    public boolean saque(double valor, int senha){
        if(senha == this.senha){
            if(valor > 0 && valor < this.saldo){
                this.saldo -= valor;
                return true;
            }
            return false;
        }
        return false;

    }

    public boolean deposito(double valor, int senha){
        if(senha == this.senha && valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferencia(double valor, int senha, Conta destino){
        if(senha == this.senha && valor > 0 && valor < this.saldo){
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
        return false;
    }
}


public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta01 = new Conta(scanner);
        Conta conta02 = new Conta(scanner);

        int operacao = scanner.nextInt();
        while(operacao != 5){
            if(operacao == 1){
                int senha = scanner.nextInt();
                if(conta01.getSaldo(senha) != 0){
                    System.out.printf("%.2f\n", conta01.getSaldo(senha));
                } else {
                    System.out.println("senha incorreta");
                }
            }
            if(operacao == 2){
                double valor = scanner.nextInt();
                int senha = scanner.nextInt();
                if(conta01.saque(valor, senha)){
                    System.out.println("saque realizado");
                } else{
                    System.out.println("saque não realizado");
                }

            }
            if(operacao == 3){
                double valor = scanner.nextInt();
                int senha = scanner.nextInt();
                if(conta01.deposito(valor, senha)){
                    System.out.println("depósito realizado");
                } else{
                    System.out.println("depósito não realizado");
                }
            }
            if(operacao == 4){
                String nomeCliente = scanner.next();
                if(Objects.equals(nomeCliente, conta02.getNomeCliente())){
                    double valor = scanner.nextDouble();
                    int senha = scanner.nextInt();
                    if(conta01.transferencia(valor, senha, conta02)){
                        System.out.println("transferência realizada");
                    } else{
                        System.out.println("transferência não realizada");
                    }
                } else{
                    System.out.println("nenhum usuário encontrado");
                }
            }
            operacao = scanner.nextInt();
        }
        scanner.close();
    }

}
