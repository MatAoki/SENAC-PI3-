/**
 *
 * @author Matheus
 */
public class Main {
    public static void main(String[] args) {
        
        Ponto c = new Ponto();
        c.carregaPonto(0, 0);
        Circulo O = new Circulo(3, c);
        
        Ponto p = new Ponto();
        p.carregaPonto(3, 0);
        
        System.out.println("O ponto P esta contido no circulo? "+ O.contem(p));
        
        Ponto A = new Ponto();
        A.carregaPonto(0, 4);
        
        System.out.println("O ponto P esta contido no circulo? "+ O.contem(A));
        
    }
    
}
