import java.util.Scanner;

class Veiculo {
    private String placa;
    public String modelo;
    public String marca;
    public String cor;
    public int ano;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}

class Motorista{
    public int id;
    private String nome;
    public String telefone;
    public String cnh;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Cliente{
    public int id;
    public String nome;
    public String telefone;
    private String rg;
    public String cpf;

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getRg(){
        return rg;
    }
}

class Chamado{
    private int id;
    public String data;
    public String tipo;
    public String origem;
    private String destino;
    public float horarioPartida;
    public float horarioRetorno;
    public double kmInicial;
    public double kmFinal;
    public double valorTotal;
    public Motorista motorista;
    public Cliente cliente;
    public Veiculo veiculo;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public String getDestino(){
        return destino;
    }

}

public class Locadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        Motorista motorista = new Motorista();
        Cliente cliente = new Cliente();
        Chamado chamado = new Chamado();

        String linha01 = entrada.nextLine();
        String[] informacoesVeiculos = linha01.split(" ");

        veiculo.setPlaca(informacoesVeiculos[0]);
        veiculo.marca = informacoesVeiculos[1];
        veiculo.modelo = informacoesVeiculos[2];
        veiculo.cor = informacoesVeiculos[3];
        veiculo.ano = Integer.parseInt(informacoesVeiculos[4]);

        String linha02 = entrada.nextLine();
        String[] informacoesMotorista = linha02.split(" ");

        motorista.id = Integer.parseInt(informacoesMotorista[0]);
        motorista.setNome(informacoesMotorista[1]);
        motorista.telefone = informacoesMotorista[2];
        motorista.cnh = informacoesMotorista[3];

        String linha03 = entrada.nextLine();
        String[] informacoesCliente = linha03.split(" ");

        cliente.id = Integer.parseInt(informacoesCliente[0]);
        cliente.nome = informacoesCliente[1];
        cliente.telefone = informacoesCliente[2];
        cliente.setRg(informacoesCliente[3]);
        cliente.cpf = informacoesCliente[4];

        String linha04 = entrada.nextLine();
        String[] informacoesChamado = linha04.split(" ");

        chamado.setId(Integer.parseInt(informacoesChamado[0]));
        chamado.data = informacoesChamado[1];
        chamado.tipo = informacoesChamado[2];
        chamado.origem = informacoesChamado[3];
        chamado.setDestino(informacoesChamado[4]);
        chamado.horarioPartida = Float.parseFloat(informacoesChamado[5]);
        chamado.horarioRetorno = Float.parseFloat(informacoesChamado[6]);
        chamado.kmInicial = Float.parseFloat(informacoesChamado[7]);
        chamado.kmFinal = Float.parseFloat(informacoesChamado[8]);
        chamado.valorTotal = Float.parseFloat(informacoesChamado[9]);
        chamado.veiculo = veiculo;
        chamado.motorista = motorista;
        chamado.cliente = cliente;


        System.out.println(chamado.getId());
        System.out.println(chamado.getDestino());
        System.out.println(chamado.veiculo.getPlaca());
        System.out.println(chamado.cliente.getRg());
        System.out.println(chamado.motorista.getNome());


    }
}
