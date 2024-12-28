public class Treinador
{
    private String cpf;
    private String nome;
    private double salario;
    
    public Treinador (String cpf, String nome, double salario){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }
    
    public boolean setSalario (double salario){
        if (salario > 0){
            this.salario = salario;
            return true;
        }else{
            return false;
        }
    }
    
    public String getCpf (){
        return this.cpf;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public double getSalario (){
        return this.salario;
    }
    
    public String toString(){
        return "CPF: " + this.cpf + ", Nome: " + this.nome + ", Salário: " + this.salario;
    }
}
