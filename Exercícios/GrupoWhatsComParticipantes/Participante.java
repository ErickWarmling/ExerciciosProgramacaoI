public class Participante
{
    private String nome;
    private String telefone;
    
    public Participante (String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public String getTelefone (){
        return this.telefone;
    }
}
