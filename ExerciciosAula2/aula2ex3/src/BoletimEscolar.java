public class BoletimEscolar {
    
    double nota1;
    double nota2;
    double nota3;
    
    void carregarNotas(double n1, double n2, double n3){
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    
    double maiorNota(){
        if (this.nota1 >= this.nota2 && this.nota1 >= this.nota3)
            return this.nota1;
        else if(this.nota2 >= this.nota1 && this.nota2 >= this.nota3)
            return this.nota2;
        else
            return this.nota3;
    }
    
    double menorNota(){
        if (this.nota1 <= this.nota2 && this.nota1 <= this.nota3)
            return this.nota1;
        else if(this.nota2 <= this.nota1 && this.nota2 <= this.nota3)
            return this.nota2;
        else
            return this.nota3;
    }
    
    double mediaAritmetica(){
        return (this.nota1 + this.nota2 + this.nota3)/3;
    }
}
