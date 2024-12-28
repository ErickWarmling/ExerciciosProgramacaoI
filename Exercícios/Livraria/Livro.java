import java.util.ArrayList;

public class Livro
{
    private String titulo;
    private int ano;
    private int paginas;
    private ArrayList<Autor> autor;
    private Editora editora;
    
    public Livro (String titulo, int ano, int paginas){
        this.titulo = titulo;
        this.ano = ano;
        this.paginas = paginas;
        this.autor = new ArrayList<Autor>();
    }
    
    public void adicionarAutor (Autor autor){
        if (!this.autor.contains(autor)){
            this.autor.add(autor);
        }
    }
    
    public void setEditora (Editora editora){
        this.editora = editora;
    }
    
    public String toString(){
        String representacao = "Título: " + this.titulo + ", Ano: " + this.ano + ", Qtd. Páginas: " + this.paginas + "\n";
        representacao = representacao + "Autor(es): \n";
        for (int i = 0; i < this.autor.size(); i++){
            Autor autor = this.autor.get(i);
            representacao = representacao + autor.getNome();
            if (autor.getPseudonimo() != null){
                representacao = representacao + "(Pseudonimo: " + autor.getPseudonimo() +")";
            }
            representacao = representacao + "\n";
        }
        representacao = representacao + "Editora: " + "\n";
        representacao = representacao + this.editora.getNome() + "("+this.editora.getCidade()+")";
        return representacao;
    }
}

