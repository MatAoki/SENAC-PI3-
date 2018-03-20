public class Main {
    public static void main(String[] args) {
        Pessoa A = new Pessoa("Enzo", "logo ali", "70707070" );
        Pessoa B = new Pessoa("Maria");
        Pessoa C = new Pessoa();
        
        A.Imprime();
        B.Imprime();
        C.Imprime();
        
        Fornecedor D = new Fornecedor("Enzo Gabriel", "aqui perto", "70707070", 150.50, 100.0);
        D.Imprime();
        System.out.println("saldo = "+D.obterSaldo());
        System.out.println("");
        
        Empregado E = new Empregado("Enzo Gabriel", "logo ali", "70707070", 1234);
        E.Imprime();
        System.out.println("Salario Empregado: "+E.calcularSalario(2000.50, 200));
        System.out.println("");
        
        Administrador F = new Administrador(225.56);
        System.out.println("Salario adm = "+F.calcularSalario(3000, 300));
        
        Operario G = new Operario(75, 5);
        System.out.println("Salario operario = "+G.calcularSalario(1500, 50));
        
        Vendedor H = new Vendedor(200, 15.6);
        System.out.println("Salario Vendedor - "+H.calcularSalario(1300, 50));
        
   
    }
    
}
