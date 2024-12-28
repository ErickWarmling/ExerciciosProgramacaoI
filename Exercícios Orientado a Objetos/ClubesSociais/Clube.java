import java.util.ArrayList;

public class Clube
{
    private String nome;
    private String cidade;
    private ArrayList<Socio> socios;
    
    public Clube (String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.socios = new ArrayList<Socio>();
    }
    
    public void adicionarSocio (Socio socio){
        if (!this.socios.contains(socio)){
            this.socios.add(socio);
        }
    }
    
    public void imprimirSocios (){
        for (int i = 0; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            System.out.println (socio.toString());
        }
    }
    
    public void imprimirSociosMenoresDeIdade (){
        for (int i = 0; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            if (socio.getIdade() < 18){
                System.out.println (socio.toString());
            }
        }
    }
    
    public double getIdadeMediaSocios (){
        double somaIdade = 0;
        for (int i = 0; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            somaIdade = somaIdade + socio.getIdade();
        }
        
        double mediaIdade = somaIdade / this.socios.size();
        return mediaIdade;
    }
    
    public void imprimirSociosIdadeMaiorQueMedia (){
        for (int i = 0; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            if (socio.getIdade() > getIdadeMediaSocios()){
                System.out.println (socio.toString());
            }
        }
    }
    
    public double getArrecadacaoMensalidades (){
        double arrecadacaoMensalidades = 0;
        
        for (int i = 0; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            arrecadacaoMensalidades = arrecadacaoMensalidades + socio.getValorMensalidade();
        }
        
        return arrecadacaoMensalidades;
    }
    
    public boolean removerSocio (int matricula){
        for (int i = 0; i < this.socios.size(); i++){
            Socio socio = this.socios.get(i);
            if (socio.getMatricula() == matricula){
                this.socios.remove(i);
                return true;
            }
        }
        return false;
    }
}

