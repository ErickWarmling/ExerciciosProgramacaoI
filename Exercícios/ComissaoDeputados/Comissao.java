import java.util.ArrayList;

public class Comissao
{
    private String titulo;
    private ArrayList<Deputado> deputados;
    
    public Comissao (String titulo){
        this.titulo = titulo;
        this.deputados = new ArrayList<Deputado>();
    }
    
    public boolean setTitulo (String titulo){
        if (!titulo.equals("")){
            this.titulo = titulo;
            return true;
        }else{
            return false;
        }
    }
    
    public String getTitulo (){
        return this.titulo;
    }
    
    public void adicionarDeputado (Deputado deputado){
        if (!this.deputados.contains(deputado)){
            this.deputados.add(deputado);
        }
    }
    
    public void imprimirDeputados() {
        for (int i = 0; i < this.deputados.size(); i++){
            Deputado deputado = this.deputados.get(i);
            System.out.println (deputado.toString());
        }
    }
    
    public void imprimirDeputados (int numeroPartido){
        for (int i = 0; i < this.deputados.size(); i++){
            Deputado deputado = this.deputados.get(i);
            if (deputado.getNumeroPartido() == numeroPartido){
                System.out.println(deputados.toString());
            }
        }
    }
    
        public void imprimirDeputados (String estado){
        for (int i = 0; i < this.deputados.size(); i++){
            Deputado deputado = this.deputados.get(i);
            if (deputado.getEstado().equals(estado)){
                System.out.println(deputados.toString());
            }
        }
    }
    
    public void imprimirQuantidadePorPartido(){
        for (int partido = 10; partido <= 99; partido++){
            int contQuantidadePorPartido = 0;
            for (int i = 0; i < this.deputados.size(); i++){
                Deputado deputado = this.deputados.get(i);
                if (deputado.getNumeroPartido() == partido){
                    contQuantidadePorPartido++;
                }
            }
            if (contQuantidadePorPartido > 0){
                System.out.println ("Partido " + partido + ": " + contQuantidadePorPartido + " deputados");
            }
        }
    }
}

