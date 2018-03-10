/**
 *
 * @author Matheus
 */
public class Main {
    public static void main(String[] args) {
        
        Calculos X = new Calculos();
        X.ListaFracoes(6);
        
        int a = 4;
        int b = 10;
        Fracao f1 = new Fracao();
        f1.atribui(a, b);
        X.fracoes[0] = f1;
        
        int c = 2;
        int d = 5;
        Fracao f2 = new Fracao();
        f2.atribui(c, d);
        X.fracoes[1] = f2;
        
        
        X.somaFracao(f1, f2);
        X.multiplicaFracao(f1, f2);
        X.divideFracao(f1, f2);
        X.simplificaFracao(f1);
        
        System.out.println("Soma: " + X.fracoes[2].getNumerador()+"/"+X.fracoes[2].getDenominador());
        System.out.println("Multiplica: " + X.fracoes[3].getNumerador()+"/"+X.fracoes[3].getDenominador());
        System.out.println("Divide: " + X.fracoes[4].getNumerador()+"/"+X.fracoes[4].getDenominador());
        System.out.println("As fracoes sao iguais? " + X.igualdade(f1, f2));
        System.out.println("Simplifica: " + X.fracoes[5].getNumerador()+"/"+X.fracoes[5].getDenominador());
        
    }
    
}
