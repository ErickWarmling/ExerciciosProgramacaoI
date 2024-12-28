package Modelo;

public class PessoaFisica extends Pessoa {

    private String rg;
    private String cpf;
    private double salarioMensal;
    private int dependentes;

    public PessoaFisica(String nome, String endereco, String rg, String cpf, double salarioMensal, int dependentes) {
        super(nome, endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
        this.dependentes = dependentes;
    }

    public boolean setRg(String rg) {
        if (!rg.equals("")) {
            this.rg = rg;
            return true;
        } else {
            return false;
        }
    }

    public String getRg() {
        return this.rg;
    }

    public boolean setCpf(String cpf) {
        if (!cpf.equals("")) {
            this.cpf = cpf;
            return true;
        } else {
            return false;
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public boolean setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
            return true;
        } else {
            return false;
        }
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public boolean setDependentes(int dependentes) {
        if (dependentes >= 0) {
            this.dependentes = dependentes;
            return true;
        } else {
            return false;
        }
    }

    public int getDependentes() {
        return this.dependentes;
    }

    public double calcularImposto() {
        double impostoPercentual = 0;
        if (this.salarioMensal <= 500) {
            impostoPercentual = 0.0;
        } else {
            if (this.salarioMensal >= 501 && salarioMensal <= 1000) {
                impostoPercentual += salarioMensal * 0.05;
            } else {
                impostoPercentual += salarioMensal * 0.07;
            }
        }

        double descontoDependentes = this.dependentes * 50;
        double valorTotalImposto = impostoPercentual - descontoDependentes;
        return valorTotalImposto;
    }

    public String toString() {
        return super.toString() + ", RG: " + this.rg + ", CPF: " + this.cpf + ", Salário Mensal: " + this.salarioMensal + ", Dependentes: " + this.dependentes;
    }
}
