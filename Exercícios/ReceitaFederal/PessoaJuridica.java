public class PessoaJuridica extends Pessoa
{
    private String cnpj;
    private double faturamento;
    private int enquadramento;
    
    public PessoaJuridica (String nome, String endereco, String cnpj, double faturamento, int enquadramento){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.enquadramento = enquadramento;
    }
    
    public boolean setCnpj (String cnpj) {
        if (!cnpj.equals("")){
            this.cnpj = cnpj;
            return true;
        }else{
            return false;
        }
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public boolean setFaturamento (double faturamento) {
        if (faturamento > 0){
            this.faturamento = faturamento;
            return true;
        }else{
            return false;
        }
    }
    
    public double getFaturamento() {
        return this.faturamento;
    }
    
    public boolean setEnquadramento (int enquadramento) {
        if (enquadramento >=1 && enquadramento <= 3){
            this.enquadramento = enquadramento;
            return true;
        }else{
            return false;
        }
    }
    
    public int getEnquadramento() {
        return this.enquadramento;
    }
    
    public double calcularImposto() {
        double imposto = 0;
        if (this.enquadramento == 1){
            imposto += this.faturamento * 0.02;
        }else if (this.enquadramento == 2){
            imposto += this.faturamento * 0.05;
        }else if (this.enquadramento == 3){
            imposto += this.faturamento * 0.15;
        }
        return imposto;
    }
    
    public String toString(){
        return super.toString() + ", CNPJ: " + this.cnpj + ", Faturamento: " + this.faturamento + ", Enquadramento: " + this.enquadramento;
    }
}
