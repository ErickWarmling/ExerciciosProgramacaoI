public class Veiculo
{
    private String modelo;
    private double potencia;
    private double combustivelTanque;
    private int hodometro;
    
    public Veiculo (String modelo, int hodometro){
        this.modelo = modelo;
        this.hodometro = hodometro;
    }
    
    public String getModelo (){
        return this.modelo;
    }
    
    public boolean setPotencia (double potencia){
        if (potencia > 0){
            this.potencia = potencia;
            return true;
        }else{
            return false;
        }
    }
    
    public double getPotencia (){
        return this.potencia;
    }
    
    public double getCombustivelTanque (){
        return this.combustivelTanque;
    }
    
    public int getHodometro (){
        return this.hodometro;
    }
    
    public boolean abastecer (double litros){
        if (litros > 0 && (this.combustivelTanque + litros) <= 50){
            this.combustivelTanque = this.combustivelTanque + litros;
            return true;
        }else{
            return false;
        }
    }
    
    public double viajar (int quilometragem){
        if (quilometragem > 0){
            double consumoLitros = quilometragem / (15.0 / potencia);
            
            if (this.combustivelTanque >= consumoLitros){
                this.hodometro = this.hodometro + quilometragem;
                this.combustivelTanque = this.combustivelTanque - consumoLitros;
                return consumoLitros;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
    
    public String toString (){
        return "Veículo: " + this.modelo + ", Potência: " + this.potencia + ", Hodômetro: " + this.hodometro + ", Combustível no tanque: " + this.combustivelTanque;
    }
}
