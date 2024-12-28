import java.util.ArrayList;

public class Detran
{
    private String estado;
    private ArrayList<Veiculo> veiculos;
    
    public Detran (String estado){
        this.estado = estado;
        this.veiculos = new ArrayList<Veiculo>();
    }
    
    public void adicionarVeiculo (Veiculo veiculo){
        if (!this.veiculos.contains(veiculo)){
            this.veiculos.add(veiculo);
        }
    }
    
    public String toString() {
        String texto = "Estado: " + this.estado + "\n";
        for (Veiculo veiculo : this.veiculos){
            texto += veiculo.toString() + "\n";
        }
        return texto;
    }
}
