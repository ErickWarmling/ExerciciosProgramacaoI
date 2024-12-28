public class AnuncioPago extends Anuncio
{
    private int quantidadeDias;
    private double valorPago;
    
    public AnuncioPago (String produto, double valorVenda, String cidade, String estado){
        super(produto, valorVenda, cidade, estado);
        this.quantidadeDias = quantidadeDias;
        this.valorPago = valorPago;
    }
    
    public boolean setQuantidadeDias (int quantidadeDias) {
        if (quantidadeDias > 0){
            this.quantidadeDias = quantidadeDias;
            return true;
        }else{
            return false;
        }
    }
    
    public int getQuantidadeDias() {
        return this.quantidadeDias;
    }
    
    public boolean setValorPago (double valorPago){
        if (valorPago > 0){
            this.valorPago = valorPago;
            return true;
        }else{
            return false;
        }
    }
    
    public double getValorPago() {
        return this.valorPago;
    }
    
    public String toString() {
        return super.toString() + ", QuantidadeDias: " + this.quantidadeDias + ", Valor Pago: " + this.valorPago;
    }
}
