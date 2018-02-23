public class Main {
    public static void main(String[] args) {
   
        double c1 = 0.100;
        double c2 = 0.200;
        double c3 = 0.300;
        
        BalancaDigital B = new BalancaDigital();
        
        B.carregaCarga(c1, c2, c3);
        B.imprimirMaisLeve();
        B.imprimirMaisPesado();
        B.imprimirOrdemCrescente();
    
    }
    
}
