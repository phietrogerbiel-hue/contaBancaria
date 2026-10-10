public class Boleto {
    private final Integer CODIGO;
    private final Double VALOR;

    public Boleto(Integer codigo, Double valor){
        this.CODIGO = codigo;
        this.VALOR = valor;
    }

    public Integer getCODIGO() {
        return CODIGO;
    }

    public Double getVALOR() {
        return VALOR;
    }

    public String toString(){
        return "BOLETO: " +
                getCODIGO() +
                " VALOR: " +
                getVALOR();
    }
}
