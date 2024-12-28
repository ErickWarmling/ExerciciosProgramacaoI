public class Estudante
{
    private String nome;
    private int matricula;
    private int quantidadeCreditos = 0;
    
    public Estudante(int matricula){
        this.matricula = matricula;
    }
    
    public boolean setNome(String nome){
        if (!nome.equals("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public int getQuantidadeCreditos(){
        return this.quantidadeCreditos;
    }
    
    public void acrescentarCreditos (int creditos){
        if (creditos > 0){
            this.quantidadeCreditos = this.quantidadeCreditos + creditos;
        }
    }
    
    public String determinarLogin(){
        String nomeNovo = nome.substring(0,3);
        int numeroMatricula = (matricula % 1000);
        
        return nomeNovo + numeroMatricula;
    }
    
    public String toString(){
        String representacao = "Nome: " + this.nome +", Matrícula: " +
        this.matricula +", Login: " + this.determinarLogin() +", Créditos: " + 
        this.quantidadeCreditos;
        
        return representacao;
    }
}
