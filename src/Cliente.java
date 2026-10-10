import java.util.Scanner;

public class Cliente {
    private String nome;
    private Integer Codigo;
    private Double saldo;

    public void novaConta(){
        Scanner str = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta");
        this.nome = str.nextLine();
        System.out.println("Digite o código da conta");
        this.Codigo = valor.nextInt();
        System.out.println("Digite o valor do depósito inicial da conta");
        this.saldo = valor.nextDouble();
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return Codigo;
    }


    public Double getSaldo() {
        return saldo;
    }

}
