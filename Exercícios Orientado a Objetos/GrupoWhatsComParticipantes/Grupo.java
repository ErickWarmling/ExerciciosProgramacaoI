import java.util.ArrayList;

public class Grupo
{
    private String nome;
    private ArrayList<Participante> participante;
    
    public Grupo (String nome){
        this.nome = nome;
        this.participante = new ArrayList<Participante>();
    }
    
    public void adicionarParticipante (Participante participante){
        if (!this.participante.contains(participante)){
            this.participante.add(participante);
        }
    }
    
    public void imprimirDados (){
        for (int i = 0; i < this.participante.size(); i++){
            Participante participante = this.participante.get(i);
            System.out.println ("Nome: " + participante.getNome() + ", Telefone: " + participante.getTelefone());
        }
    }
}
