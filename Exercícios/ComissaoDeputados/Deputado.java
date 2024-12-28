public class Deputado
{
    private int matricula;
    private String nome;
    private int numeroPartido;
    private String estado;
    
    public Deputado (int matricula, String nome, String estado){
        this.matricula = matricula;
        this.nome = nome;
        this.numeroPartido = numeroPartido;
        this.estado = estado;
    }
    
    public boolean setNumeroPartido (int numeroPartido){
        if (numeroPartido >= 10 && numeroPartido <= 99){
            this.numeroPartido = numeroPartido;
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
    
    public int getNumeroPartido (){
        return this.numeroPartido;
    }
    
    public String getEstado (){
        return this.estado;
    }
    
    public String toString() {
        return "Matrícula: " + this.matricula + ", Nome: " + this.nome + ", Número Partido: " + this.numeroPartido + ", Estado: " + this.estado;
    }
}