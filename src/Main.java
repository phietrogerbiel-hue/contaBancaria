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

    }
}