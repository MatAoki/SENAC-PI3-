public class Ingresso {
    
    private double valor = 15;
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void ImprimeValor(){
        System.out.println("Valor = "+getValor());
    }
    
}
