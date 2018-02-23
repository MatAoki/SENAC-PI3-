public class Main {
    public static void main(String[] args) {
        
        ContaBancariaSimples Conta = new ContaBancariaSimples();
        Conta.carregarSaldo(1000);
        Conta.imprimirSaldo();
        Conta.depositar(39);
        Conta.imprimirSaldo();
        Conta.sacar(20.62);
        Conta.imprimirSaldo();
        
    }
    
}
