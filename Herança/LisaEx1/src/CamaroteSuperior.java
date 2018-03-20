public class CamaroteSuperior extends VIP{
    
    private String localizacao  = "";
    
    public CamaroteSuperior(){
        super();
        this.setValor(this.getValor() + 15);
        this.localizacao = "Superior";
    }

    /**
     * @return the localizacao
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void ImprimeLocal(){
        System.out.println("Local = " + this.getLocalizacao());
    }
}
