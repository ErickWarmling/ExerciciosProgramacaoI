import java.util.ArrayList;

public class Banco
{
    private int codigo;
    private String nome;
    private ArrayList<Agencia> agencias;
    
    public Banco (int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }
    
    public boolean setNome (String nome){
        if (!nome.equals("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    
    public int getCodigo (){
        return this.codigo;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public void adicionarAgencia(Agencia agencia){
        if (!this.agencias.contains(agencia)){
            this.agencias.add(agencia);
        }
    }
    
    public void imprimirAgencia (){
        for (int i = 0; i < this.agencias.size(); i++){
            Agencia agencia = this.agencias.get(i);
            System.out.println ("Agência " + agencia.getNumero() + ", " + agencia.getCidade() + ", " + agencia.getAnoAbertura());
        }
    }
    
    public void imprimirAgencia (String cidade){
        for (int i = 0; i < this.agencias.size(); i++){
            Agencia agencia = this.agencias.get(i);
            if (agencia.getCidade().equals(cidade)){
                System.out.println ("Agência " + agencia.getNumero() + ", " + agencia.getCidade() + ", " + agencia.getAnoAbertura());
            }
        }
    }
    
    public void imprimirAgencia (int anoAbertura){
              for (int i = 0; i < this.agencias.size(); i++){
            Agencia agencia = this.agencias.get(i);
            if (agencia.getAnoAbertura() == anoAbertura){
                System.out.println ("Agência " + agencia.getNumero() + ", " + agencia.getCidade() + ", " + agencia.getAnoAbertura());
            }
        }
    }
    
    public Agencia consultarAgencia (int numero){
        for (int i = 0; i < this.agencias.size(); i++){
            Agencia agencia = this.agencias.get(i);
            if (agencia.getNumero() == numero){
                return agencia;
            }
        }
        return null;
    }
}
