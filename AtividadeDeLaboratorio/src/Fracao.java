/**
 *
 * @author Matheus
 */
public class Fracao {
    private int numerador;
    private int denominador;
    
    public void atribui(int numerador, int denominador){
        this.setNumerador(numerador);
        this.setDenominador(denominador);
    }
    
    public void printaFracao(){
        System.out.println(this.numerador + "/" + this.denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int a) {
        this.numerador = a;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int b) {
        this.denominador = b;
    }
    
    
    
}
