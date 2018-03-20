public class Administrador extends Empregado{
    
    private double ajudaDeCusto;
    
    public Administrador(double ajudaDeCusto){
        super();
        this.setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double calcularSalario(double salarioBase, double imposto){
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
        return this.getAjudaDeCusto()+this.getSalarioBase()-this.getImposto();
        
    }
    
}
