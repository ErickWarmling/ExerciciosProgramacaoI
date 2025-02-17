public class Carro extends Veiculo {
    private int portas;
    
    public Carro (String modelo, int ano, String placa, double valor, int portas){
        super (modelo, ano, placa, valor);
        this.portas = portas;
    }
    
    public boolean setPortas (int portas){
        if (portas > 0){
            this.portas = portas;
            return true;
        }else{
            return false;
        }
    }
    
    public int getPortas (){
        return this.portas;
    }
    
    @Override
    public String toString() {
        return "Carro " + super.toString() + ", Portas: " + this.portas;
    }
}
