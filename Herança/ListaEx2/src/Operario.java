public class Operario extends Empregado{
    
    private double valorProducao, comissao;
    
    public Operario(double valorProducao, double comissao){
        super();        
        this.setComissao(comissao);
        this.setValorProducao(valorProducao);
    }    
    
    @Override
    public double calcularSalario(double salarioBase, double imposto){
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
        return this.getSalarioBase() + (this.getValorProducao() * (this.getComissao() / 100)) - this.getImposto();
    }

    /**
     * @return the valorProducao
     */
    public double getValorProducao() {
        return valorProducao;
    }

    /**
     * @param valorProducao the valorProducao to set
     */
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    /**
     * @return the comissao
     */
    public double getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
}
