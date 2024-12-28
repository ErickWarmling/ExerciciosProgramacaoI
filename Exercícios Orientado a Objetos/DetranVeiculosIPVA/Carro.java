public class Carro extends Veiculo {
    private int portas;
    private boolean carroParticular;
    
    public Carro (String modelo, int ano, String placa, double valor, int portas, boolean carroParticular){
        super (modelo, ano, placa, valor);
        this.portas = portas;
        this.carroParticular = carroParticular;
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
    
    public double calcularIPVA (){
        double valorIpva = 0;
        if (carroParticular == true){
            valorIpva = this.valor * 0.02;
        }else{
            valorIpva = this.valor * 0.01;
        }
        return valorIpva;
    }
    
    @Override
    public String toString() {
        return "Carro " + super.toString() + ", Portas: " + this.portas + ", IPVA: " + this.calcularIPVA();
    }
}