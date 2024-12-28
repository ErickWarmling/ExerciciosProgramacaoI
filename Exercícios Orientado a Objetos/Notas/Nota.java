public class Nota
{
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;
    
    public Nota (int matricula){
        this.matricula = matricula;
    }
    
    public boolean setNome (String nome){
        if (!nome.equals ("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    
    public int getMatricula (){
        return this.matricula;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public boolean setNotaProva1 (double notaProva1){
        if (notaProva1 >=  0){
            this.notaProva1 = notaProva1;
            return true;
        }else{
            return false;
        }
    }
    
    public double getNotaProva1 (){
        return this.notaProva1;
    }
    
    public boolean setNotaProva2 (double notaProva2){
        if (notaProva2 >= 0){
            this.notaProva2 = notaProva2;
            return true;
        }else{
            return false;
        }
    }
    
    public double getNotaProva2 (){
        return this.notaProva2;
    }
    
    public boolean setNotaTrabalho (double notaTrabalho){
        if (notaTrabalho >= 0){
            this.notaTrabalho = notaTrabalho;
            return true;
        }else{
            return false;
        }
    }
    
    public double getNotaTrabalho (){
        return this.notaTrabalho;
    }
    
    public double media (double peso1, double peso2, double pesoTrabalho){
        double media = ((this.notaProva1 * peso1) + (this.notaProva2 * peso2) + 
                       (this.notaTrabalho * pesoTrabalho)) / (peso1 + peso2 + pesoTrabalho);
                       
        return media;
    }   
    
    public double notaFinal (){
        double notaFinal = this.media(2.5, 2.5, 2.0);
        if (notaFinal < 7.0){
            return (7.0 - notaFinal);
        }else{
            return 0;
        }
    }
}


