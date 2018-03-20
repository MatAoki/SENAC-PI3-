public class Pessoa {
    
    private String nome, telefone, endereco;
    
    public Pessoa(String nome, String endereco, String telefone){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }
    
    public Pessoa(){
        this.setNome("Enzo(vazio kek)");
        this.setEndereco("?");
        this.setTelefone("?");
    }
    
    public Pessoa(String nome){
        this.setNome(nome);
        this.setEndereco("?");
        this.setTelefone("?");
    }
    
    public void Imprime(){
        System.out.println("nome: "+this.getNome());
        System.out.println("endereco: "+this.getEndereco());
        System.out.println("tel: "+this.getTelefone());
        System.out.println(" ");
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
