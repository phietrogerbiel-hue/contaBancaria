package application;

import entities.Cliente;
import services.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Cliente cliente = new Cliente();
      cliente.novaConta();

      ContaBancaria conta = new ContaBancaria(cliente.getNome(), cliente.getCodigo(), cliente.getSaldo());
      System.out.println("Conta cadastrada com sucesso!");
      conta.limiteCheque(conta.getSaldo());

      System.out.println("===ESCOLHA O SERVIÇO===");
      do {

          conta.servicos();

          switch(new Scanner(System.in).nextInt()){
              case 1-> System.out.println(conta.getSaldo());
              case 2-> System.out.println(conta.getCheque());
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
                  System.out.println("Digite o número do boleto que quer pagar (ex: 1, 2; Consulte usando 7)");
                  int opcao = new Scanner(System.in).nextInt();
                  conta.pagarBoleto(opcao);
              }
              case 7-> conta.listarBoletos();
              case 8-> System.exit(0);
          }
      } while (true);
    }
}