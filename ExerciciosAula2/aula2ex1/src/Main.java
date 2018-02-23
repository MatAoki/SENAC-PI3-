public class Main {
    
    public static void main(String[] args) {
        
        CalculadoraEspecial C1 = new CalculadoraEspecial();
        
        int n1 = 4;
        int n2 = 2;
        int soma, subtrai, multiplica, divide;
        
        C1.carregarNumeros(n1, n2);
        
        soma = C1.somar();
        subtrai = C1.subtrair();
        multiplica = C1.multiplicar();
        divide = C1.dividir();
        
        System.out.println("Numeros: " + C1.numero1 + " e " + C1.numero2);
        System.out.println("Soma = " + soma);
        System.out.println("Subtracao = " + subtrai);
        System.out.println("Multiplicacao = " + multiplica);
        System.out.println("Divisao = " + divide);
        
    }
    
}
