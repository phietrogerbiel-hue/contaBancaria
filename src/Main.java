import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Cliente cliente = new Cliente();
      ArrayList<Boleto> boletos = new ArrayList<>();

      cliente.novaConta();

      ContaBancaria conta = new ContaBancaria(cliente.getNome(), cliente.getCodigo(), cliente.getSaldo());
      System.out.println("Conta cadastrada com sucesso!");

      System.out.println("===ESCOLHA O SERVIÇO===");
      do {

          conta.servicos();

          switch(new Scanner(System.in).nextInt()){
              case 1-> conta.getSaldo();
              case 2-> conta.getCheque();
              case 3-> {
                  System.out.println("Quanto você quer depositar?");
                  Double n = new Scanner(System.in).nextDouble();
                  conta.depositar(n);
              }
              case 4-> {
                  System.out.println("Quanto você deseja sacar?");
                  Double n = new Scanner(System.in).nextDouble();
                  conta.sacar(n);
              }
              case 5-> {
                  System.out.println("Qual o código do boleto? ");
                  Integer n = new Scanner(System.in).nextInt();
                  System.out.println("Qual o valor do boleto? ");
                  Double v = new Scanner(System.in).nextDouble();
                  conta.criarBoleto(n, v);
              }
              case 6-> {
                  System.out.println("Digite o indice do boleto que quer pagar (ex: 1,2; Consulte usando 7)");
                  conta.pagarBoleto(boletos.get(new Scanner(System.in).nextInt()));
              }
              case 7-> conta.listarBoletos();
              case 8-> System.exit(0);
          }
      } while (true);
    }
}