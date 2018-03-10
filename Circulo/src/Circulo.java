/**
 *
 * @author Matheus
 */
public class Circulo {
    
    private int raio;
    private Ponto C = new Ponto(); 
    
    public Circulo(int raio, Ponto c){
        this.setRaio(raio);
        this.C = c;
    }
    
    public boolean contem(Ponto p){
        if (   Math.sqrt(  Math.pow( this.C.getX() - p.getX(), 2 )+Math.pow( this.C.getY() - p.getY(), 2 )  ) <= raio   )
            return true;
        else 
            return false;
    }
    
    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
        if (raio < 0){
            this.raio = 0;
        }
    }

}
