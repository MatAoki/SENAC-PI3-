/**
 *
 * @author Matheus
 */
public class Calculos {
    private int numerador;
    private int denominador;
    Fracao fracoes[];//inicia vetor de fracoes
    public void ListaFracoes(int n){//instancia vetor contendo as fracoes
        fracoes = new Fracao[n];
    }
    
    public void somaFracao(Fracao f1, Fracao f2){//soma fracoes
        
        this.numerador = (f1.getNumerador()*f2.getDenominador()) + (f2.getNumerador()*f1.getDenominador());
        this.denominador = f1.getDenominador()*f2.getDenominador();
        
        Fracao fSoma = new Fracao();
        fSoma.atribui(this.numerador, this.denominador);
        fracoes[2] = fSoma;
    }
    
    public void multiplicaFracao(Fracao f1, Fracao f2){//multiplica fracoes
        this.numerador = f1.getNumerador()*f2.getNumerador();
        this.denominador = f1.getDenominador()*f2.getDenominador();
        
        Fracao fMultiplica = new Fracao();
        fMultiplica.atribui(this.numerador, this.denominador);
        this.fracoes[3] = fMultiplica;
    }
    
    public void divideFracao(Fracao f1, Fracao f2){//divide as fracoes
        this.numerador = f1.getNumerador()*f2.getDenominador();
        this.denominador = f1.getDenominador()*f2.getNumerador();
        
        Fracao fDivide = new Fracao();
        fDivide.atribui(this.numerador, this.denominador);
        this.fracoes[4] = fDivide;
    }
    
    public boolean igualdade(Fracao f1, Fracao f2){//verifica igualdade
        if (f1.getNumerador()*f2.getDenominador() == f1.getDenominador()*f2.getNumerador())
            return true;
        else
            return false;
    }
    
    public int mdc(int a, int b){//calcula mdc pelo diagrama de euclides
        int y = b;
        int x = a;
        int aux = y;
        x = x % y;
        y = aux;
        if(x == 0)
            return y;
        else 
            return mdc(y,x);
    }
    
    public void simplificaFracao(Fracao f){//simplifica as fracoes
        int mdc = this.mdc(f.getNumerador(),f.getDenominador());
        this.numerador = f.getNumerador()/mdc;
        this.denominador = f.getDenominador()/mdc;
        
        Fracao fSimplifica = new Fracao();
        fSimplifica.atribui(this.numerador, this.denominador);
        this.fracoes[5] = fSimplifica;
    }
    
}
