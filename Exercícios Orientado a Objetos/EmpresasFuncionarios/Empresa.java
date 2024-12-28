import java.util.ArrayList;

public class Empresa
{
    private String cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa (String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    public void adicionarFuncionario (Funcionario fun){
        if (!this.funcionarios.contains(fun)){
            this.funcionarios.add(fun);
        }
    }
    
    public void imprimeFuncionarios (){
        for (int i = 0; i < this.funcionarios.size(); i++){
            Funcionario fun = this.funcionarios.get(i);
            System.out.println ("Matrícula: " + fun.getMatricula() + ", Nome: " + fun.getNome() +
            ", Salário: " + fun.getSalarioMensal());
        }
    }
    
    public double getDespesasFolhaPagamento (){
        double despesas = 0;
        
        for (int i = 0; i < this.funcionarios.size(); i++){
            Funcionario fun = this.funcionarios.get(i);
            despesas = despesas + fun.getSalarioMensal();
        }
        return despesas;
    }
}
