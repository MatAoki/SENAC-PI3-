public class CalculadoraEspecial {
    
    int numero1;
    int numero2;
    
    void carregarNumeros(int n1, int n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }
    
    int somar(){
        return this.numero1 + this.numero2;
    }
    
    int multiplicar (){
        return this.numero1 * this.numero2;
    }
    
    int dividir(){
        return this.numero1 / this.numero2;
    }
    
    int subtrair(){
        return this.numero1 - this.numero2;
    }
}
