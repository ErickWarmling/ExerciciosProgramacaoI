import java.util.ArrayList;

public class Portal
{
    private String nome;
    private String url;
    private ArrayList<Anuncio> anuncios;
    
    public Portal (String nome, String url){
        this.nome = nome;
        this.url = url;
        this.anuncios = new ArrayList<Anuncio>();
    }
    
    public boolean setNome (String nome){
        if (!nome.equals("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public boolean setUrl (String url){
        if (!url.equals("")){
            this.url = url;
            return true;
        }else{
            return false;
        }
    }
    
    public String getUrl() {
        return this.url;
    }
    
    public void adicionarAnuncio (Anuncio anuncio){
        if (!this.anuncios.contains(anuncio)){
            this.anuncios.add(anuncio);
        }
    }
        
    public String toString() {
        String texto = "Nome: " + this.nome + ", URL: " + this.url + "\n";
        texto += "Anúncios: " + "\n";
        for (Anuncio anuncio : this.anuncios){
            texto += anuncio.toString() + "\n";
        }
        return texto;
    }
}
