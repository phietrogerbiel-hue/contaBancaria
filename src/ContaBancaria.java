import java.util.ArrayList;

public class ContaBancaria {
    private final String NAME;
    private final Integer NUMERO;
    private Double saldo;
    private Double cheque;
    private ArrayList<Boleto> boletos = new ArrayList<>();

    public ContaBancaria(String name, Integer numero, Double saldo){
        this.NAME = name;
        this.NUMERO = numero;
        this.saldo = saldo;
    }

    public String getNAME() {
        return NAME;
    }

    public Integer getNUMERO() {
        return NUMERO;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double saldo){
        this.saldo += saldo;
        System.out.print("O valor depositado foi de: " + saldo);
        System.out.print("O saldo atual é de: " + getSaldo());
    }

    public void sacar (Double saldo){
        if(this.saldo < saldo){
            System.out.println("A conta não possui saldo suficiente para sacar");
            System.out.println("Saldo atual: " + getSaldo());
            return;
        }
        this.saldo -= saldo;
        System.out.println("O valor sacado foi de : " + saldo);
        System.out.println("Saldo atual: " + getSaldo());
    }

    public void criarBoleto(Integer codigo, Double valor){
        Boleto boleto = new Boleto(codigo, valor);
        boletos.add(boleto);
        System.out.println("O boleto criado foi: " + boleto);
    }

    public void pagarBoleto(Boleto boleto){
        if(this.saldo < boleto.getVALOR()){
            System.out.println("Saldo insuficiente para pagar o boleto!");
            return;
        }
        this.saldo -= boleto.getVALOR();
        System.out.println("O boleto: " + boleto + " foi pago!");
        boletos.remove(boleto);
    }

    public void listarBoletos(){
        for(Boleto boleto : boletos){
            System.out.println(boleto);
        }
        System.out.println("Sem boletos para pagar");
    }

    public Double getCheque() {
        return cheque;
    }





}
