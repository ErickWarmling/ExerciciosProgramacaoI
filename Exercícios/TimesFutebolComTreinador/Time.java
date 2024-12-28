public class Time
{
    private String nome;
    private int anoFundacao;
    private String cidadeSede;
    private Treinador treinador;
    
    public Time (String nome, int anoFundacao, String cidadeSede){
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.cidadeSede = cidadeSede;
    }
    
    public void setTreinador (Treinador treinador){
        this.treinador = treinador;
    }
    
    public String toString (){
        return "Nome: " + this.nome + ", Ano de Fundação: " + this.anoFundacao + 
               ", Cidade Sede: " + this.cidadeSede + ", Treinador: " + this.treinador.toString();
    }
}
