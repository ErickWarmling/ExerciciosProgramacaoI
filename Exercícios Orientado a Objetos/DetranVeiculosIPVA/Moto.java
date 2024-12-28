public class Moto extends Veiculo{
    private int cilindradas;
    
    public Moto (String modelo, int ano, String placa, double valor, int cilindradas){
        super(modelo, ano, placa, valor);
        this.cilindradas = cilindradas;
    }
    
    public boolean setCilindradas (int cilindradas){
        if (cilindradas > 0){
            this.cilindradas = cilindradas;
            return true;
        }else{
            return false;
        }
    }
    
    public int getCilindradas (){
        return this.cilindradas;
    }
    
    public double calcularIpva (){
        double valorIpva = 0;
        if (this.cilindradas < 200){
            valorIpva = 0;
        }else{
            valorIpva = this.valor * 0.02;
        }
        return valorIpva;
    }
    
    @Override
    public String toString() {
        return "Moto " + super.toString() + ", Cilindradas: " + this.cilindradas + ", IPVA: " + this.calcularIpva();
    }
}
