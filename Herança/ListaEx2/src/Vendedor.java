public class Vendedor extends Empregado{
    
    private double valorVendas, comissao;
    
    public Vendedor(double valorVendas, double comissao){
        super();        
        this.setComissao(comissao);
        this.setValorVendas(valorVendas);
    }    
    
    @Override
    public double calcularSalario(double salarioBase, double imposto){
        this.setSalarioBase(salarioBase);
        this.setImposto(imposto);
        return this.getSalarioBase() + (this.getValorVendas() * (this.getComissao() / 100));
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
}
