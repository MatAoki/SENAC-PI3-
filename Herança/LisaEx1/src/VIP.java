public class VIP extends Ingresso{
    
    public VIP(){
        super();
        this.setValor(this.getValor() + 10);
    }
    
    public double getValorVIP() {
        return this.getValor();
    }
}
