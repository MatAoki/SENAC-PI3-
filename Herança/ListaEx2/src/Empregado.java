public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase, imposto;
    
    public Empregado(String nome, String endereco, String telefone, int codigo){
        super(nome,endereco,telefone);
        
        this.setCodigoSetor(codigo);
    }
    
    public Empregado(){
        super();
    }
    
    public double calcularSalario(double salarioBase, double imposto){
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
        return this.getSalarioBase()-this.getImposto();
    }

    /**
     * @return the imposto
     */
    public double getImposto() {
        return imposto;
    }

    /**
     * @param imposto the imposto to set
     */
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    /**
     * @return the codigoSetor
     */
    public int getCodigoSetor() {
        return codigoSetor;
    }

    /**
     * @param codigoSetor the codigoSetor to set
     */
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
