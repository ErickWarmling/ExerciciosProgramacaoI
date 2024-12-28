public class Funcionário
{
    private String nome;
    private double horasTrabalhadas;
    private double salarioHora;
    private int quantidadeDependentes;
    
    public Funcionário (String nome, double horasTrabalhadas, double salarioHora, int quantidadeDependentes){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.quantidadeDependentes = quantidadeDependentes;
    }
    
    public boolean setNome (String nome){
        if (!nome.equals("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public boolean setHorasTrabalhadas (double horasTrabalhadas){
        if (horasTrabalhadas > 0 && horasTrabalhadas <= 220){
            this.horasTrabalhadas = horasTrabalhadas;
            return true;
        }else{
            return false;
        }
    }
    
    public double getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }
    
    public boolean setSalarioHora (double salarioHora){
        if (salarioHora > 0){
            this.salarioHora = salarioHora;
            return true;
        }else{
            return false;
        }
    }
    
    public double getSalarioHora(){
        return this.salarioHora;
    }
    
    public boolean setQuantidadeDependentes (int quantidadeDependentes){
        if (quantidadeDependentes >= 0){
            this.quantidadeDependentes = quantidadeDependentes;
            return true;
        }else{
            return false;
        }
    }
    
    public int getQuantidadeDependentes(){
        return this.quantidadeDependentes;
    }
    
    public double calcularSalarioBruto (){
        return (this.horasTrabalhadas * this.salarioHora) + (50 * this.quantidadeDependentes);
    }
    
    public double calcularDescontoINSS (){
        double salarioBruto = calcularSalarioBruto();
          if (salarioBruto <= 1000){
              return salarioBruto * 0.85;
          }else{
              return salarioBruto * 0.09;
    }
    }
    
    public double calcularDescontoIR (){
        double salarioBruto = calcularSalarioBruto();
        if (salarioBruto <= 500){
            return 0;
        }else if (salarioBruto > 500 && salarioBruto <= 1000){
            return salarioBruto * 0.05;
        }else{
            return salarioBruto * 0.07;
        }
    }
    
    public double calcularSalarioLiquido (){
        double salarioBruto = calcularSalarioBruto();
        double descontoINSS = calcularDescontoINSS();
        double descontoIR = calcularDescontoIR();
        
        return salarioBruto - descontoINSS - descontoIR;
    }
    
    public String toString(){
        String representacao = "Nome: " + this.nome +", Dependentes: " + this.quantidadeDependentes + ", Sal. Hora: " + this.salarioHora + 
        ", Qtd. Horas Trab.: " + this.horasTrabalhadas + ", Sal.Bruto: " + this.calcularSalarioBruto()
        + ", INSS: " + this.calcularDescontoINSS() + ", IR: " + this.calcularDescontoIR() 
        + ", Sal. Líquido: " + calcularSalarioLiquido();
        
        return representacao;
    }
}
    

