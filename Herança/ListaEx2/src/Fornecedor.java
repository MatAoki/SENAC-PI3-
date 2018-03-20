public class Fornecedor extends Pessoa{
    
    private double valorCredito,valorDivida;
    public Fornecedor(String nome, String endereco, String telefone, double credito ,double divida){
        super(nome,endereco,telefone);
        this.valorCredito = credito;
        this.valorDivida  = divida;
    }

    public double obterSaldo(){
        return  this.getValorCredito() - this.getValorDivida();
    }
    
    /**
     * @return the valorCredito
     */
    public double getValorCredito() {
        return valorCredito;
    }

    /**
     * @param valorCredito the valorCredito to set
     */
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    /**
     * @return the valorDivida
     */
    public double getValorDivida() {
        return valorDivida;
    }

    /**
     * @param valorDivida the valorDivida to set
     */
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
