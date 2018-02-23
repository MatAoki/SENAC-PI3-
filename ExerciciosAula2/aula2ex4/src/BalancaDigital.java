public class BalancaDigital {
    
    double carga1;
    double carga2;
    double carga3;
    
    void carregaCarga(double c1, double c2, double c3){
        this.carga1 = c1;
        this.carga2 = c2;
        this.carga3 = c3;
    }
    
    void imprimirMaisPesado(){
        if (this.carga1 >= this.carga2 && this.carga1 >= this.carga3)
            System.out.println("Carga mais pesada: " + this.carga1);
        else if(this.carga2 >= this.carga1 && this.carga2 >= this.carga3)
            System.out.println("Carga mais pesada: " + this.carga2);
        else
            System.out.println("Carga mais pesada: " + this.carga3);
    }
    
    void imprimirMaisLeve(){
        if (this.carga1 <= this.carga2 && this.carga1 <= this.carga3)
            System.out.println("Carga mais leve: " + this.carga1);
        else if(this.carga2 <= this.carga1 && this.carga2 <= this.carga3)
            System.out.println("Carga mais leve: " + this.carga2);
        else
            System.out.println("Carga mais leve: " + this.carga3);
    }
    
    void imprimirOrdemCrescente(){
        if (this.carga1 <= this.carga2 && this.carga1 <= this.carga3){
            System.out.print("Cargas em ordem crescente: " + this.carga1 + ", ");
            if(this.carga2 <= this.carga3)
                System.out.println(this.carga2 + ", " + this.carga3);
            else
                System.out.println(this.carga3 + ", " + this.carga2);
        }
        else if(this.carga2 <= this.carga1 && this.carga2 <= this.carga3){
            System.out.print("Cargas em ordem crescente: " + this.carga2 + ", ");
            if(this.carga1 <= this.carga3)
                System.out.println(this.carga1 + ", " + this.carga3);
            else
                System.out.println(this.carga3 + ", " + this.carga1);
        }
        else{
            System.out.print("Cargas em ordem crescente: " + this.carga3 + ", ");
            if(this.carga1 <= this.carga2)
                System.out.println(this.carga1 + ", " + this.carga2);
            else
                System.out.println(this.carga2 + ", " + this.carga1);
        }
        
    }
    
}
