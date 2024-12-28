public class Anuncio
{
    private String produto;
    private double valorVenda;
    private String cidade;
    private String estado;
    
    public Anuncio (String produto, double valorVenda, String cidade, String estado){
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public boolean setProduto (String produto) {
        if (!produto.equals("")){
            this.produto = produto;
            return true;
        }else{
            return false;
        }
    }
    
    public String getProduto() {
        return this.produto;
    }
    
    public boolean setValorVenda (double valorVenda) {
        if (valorVenda > 0){
            this.valorVenda = valorVenda;
            return true;
        }else{
            return false;
        }
    }
    
    public double getValorVenda() {
        return this.valorVenda;
    }
    
    public boolean setCidade (String cidade) {
        if (!cidade.equals("")){
            this.cidade = cidade;
            return true;
        }else{
            return false;
        }
    }
    
    public String getCidade() {
        return this.cidade;
    }
    
    public boolean setEstado (String estado){
        if (!estado.equals("") && estado.length() == 2){
            this.estado = estado;
            return true;
        }else{
            return false;
        }
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public String toString() {
        return "Produto: " + this.produto + ", Valor Venda: " + this.valorVenda + ", Cidade: " + this.cidade + ", Estado: " + this.estado;
    }
}
