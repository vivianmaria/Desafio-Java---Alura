import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;
        int opcao = 0;
        System.out.println("*****************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("saldo atutal: " + saldo);
        System.out.println("\n*****************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor 
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in); //ler informações do reclado System.in
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);

            } else if (opcao == 2) {
                System.out.println("qual o valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("N]ao há saldo para realizar transferencia");

                } else {
                    saldo -= valor;
                    System.out.println("novo saldo: " + saldo);
                }
            }else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("novo saldo: " + saldo);

            } else if (opcao != 4){
                System.out.println("opção invalida");
            }
        }
    }
}