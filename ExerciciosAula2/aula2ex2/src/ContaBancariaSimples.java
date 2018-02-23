public class ContaBancariaSimples {
    
    private double saldo = 0;
    
    void carregarSaldo(double s){
        this.saldo = s;
    }
    
    void depositar(double a){
        this.saldo = this.saldo + a;
    }
    
    void sacar(double b){
        this.saldo = this.saldo - b;
    }
    
    void imprimirSaldo(){
        System.out.println("Saldo = " + this.saldo);
    }
    
}
