public class CamaroteInferior extends VIP{
    
    private String localizacao  = "";
    
    public CamaroteInferior(){
        super();
        this.localizacao = "Inferior";
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
