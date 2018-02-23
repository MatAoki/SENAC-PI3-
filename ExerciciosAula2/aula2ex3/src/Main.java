public class Main {
    public static void main(String[] args) {
        double n1 = 8.5;
        double n2 = 5;
        double n3 = 4.5;
        
        double maior, menor, media;
        
        BoletimEscolar B = new BoletimEscolar();
        
        B.carregarNotas(n1, n2, n3);
        maior = B.maiorNota();
        menor = B.menorNota();
        media = B.mediaAritmetica();
        
        System.out.println("Notas: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Maior Nota: " + maior);
        System.out.println("Menor Nota: " + menor);
        System.out.println("Media: " + media);
    }
    
}
