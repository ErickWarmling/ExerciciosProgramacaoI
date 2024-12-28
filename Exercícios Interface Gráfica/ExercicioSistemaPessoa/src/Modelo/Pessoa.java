/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Pessoa {
    
    private int codigo;
    private String nome;
    private String endereco;
    private char sexo;
    private double salario;

    public Pessoa(int codigo, String nome, char sexo, String endereco, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.salario = salario;
    }

    public boolean setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
            return true;
        } else {
            return false;
        }
    }

    public boolean setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    public boolean setEndereco(String endereco) {
        if (!endereco.isEmpty()) {
            this.endereco = endereco;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSexo(char sexo) {
        if (sexo == 'F' || sexo == 'M') {
            this.sexo = sexo;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Codigo: " + codigo + ", "
                + "Nome: " + nome + ", "
                + "Sexo: " + sexo + ", "
                + "Endereco: " + endereco + ", "
                + "Salario: " + salario;
    }
}
