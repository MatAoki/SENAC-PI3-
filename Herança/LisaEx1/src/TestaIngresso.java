public class TestaIngresso {
    public static void main(String [] args){
        Ingresso Ing = new Ingresso();
        VIP V = new VIP();
        Normal N = new Normal();
        CamaroteInferior I = new CamaroteInferior();
        CamaroteSuperior S = new CamaroteSuperior();
        
        Ing.ImprimeValor();
        V.ImprimeValor();
        N.imprimeNormal();
        N.ImprimeValor();
        I.ImprimeLocal();
        I.ImprimeValor();
        S.ImprimeLocal();
        S.ImprimeValor();
        
        
    }
}