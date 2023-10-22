package AbstracaoDominioBancario;



import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}

interface OperacoesBancarias{
    Double depositar(double valor);
}
abstract class ContaBancaria implements OperacoesBancarias{
    public Integer numero;

    @Override
    public Double depositar(double valor) {
        return null;
    }

    public  void print(){
        System.out.println("Teste");
    }
}
class PessoaJuridica extends ContaBancaria{

    public void printPessoaJuridica(){
        System.out.println("Teste Pessoa Juridica");
    }
}
class ContaPessoaFisica extends ContaBancaria {
    double altura;
    public static void main(String[] args) {

    }
}
public class Desafio {
    public static void main(String[] args) {

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        ContaBancaria contaBancaria = new PessoaJuridica();
        pegarDividas(contaBancaria);


        ContaBancaria contaBancaria1 = new ContaPessoaFisica();
        pegarDividas(contaBancaria1);


        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {


        }
    }

    public static void pegarDividas(ContaBancaria contaBancaria){
        System.out.println(contaBancaria.numero);
    }
}

/*package AbstracaoDominioBancario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
        //TODO: Implementar adequadamente esta sobrecarga de construtores.
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        //TODO: Complementar as informações com a taxa de juros.
        System.out.println("Taxa de juros: "+ this.taxaJuros +"%");
    }
}









package AbstracaoDominioBancario;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Desafio {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("####.0");


        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        System.out.println("Conta: " + contaBancaria.numero);
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Saldo: R$ " + df.format(contaBancaria.saldo));
    }
}


class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
*/