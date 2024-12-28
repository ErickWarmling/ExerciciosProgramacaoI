/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public abstract class Pessoa {
    
    protected String nome;
    protected String endereco;
    
    public Pessoa (String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public boolean setNome (String nome) {
        if (!nome.equals("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public boolean setEndereco (String endereco) {
        if (!endereco.equals("")){
            this.endereco = endereco;
            return true;
        }else{
            return false;
        }
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public String toString() {
        return "Nome: " + this.nome + ", Endereço: " + this.endereco;
    }
    
    public abstract double calcularImposto();
}
