package BancoDigital;

public class Main {
    public static void main(String[] args) {
     Cliente jair = new Cliente();
     jair.setNome("Jair Freitas");

    Conta corrente = new ContaCorrente(jair);
    Conta poupanca = new ContaPoupanca(jair);

    corrente.depositar(560);
    corrente.transferir(200, poupanca);

    corrente.imprimirExtrato();
    poupanca.imprimirExtrato();



    }
}
