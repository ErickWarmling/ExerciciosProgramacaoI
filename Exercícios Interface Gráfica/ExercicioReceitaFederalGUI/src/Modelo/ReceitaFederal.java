/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class ReceitaFederal {
    
    private ArrayList<Pessoa> pessoas;

    public ReceitaFederal() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (!this.pessoas.contains(pessoa)) {
            this.pessoas.add(pessoa);
        }
    }

    public void imprimirContribuintesDadosBasicos() {
        System.out.println("Contribuintes: ");
        for (Pessoa pessoa : this.pessoas) {
            System.out.println(pessoa.toString());
        }
    }

    public void imprimirContribuintesDadosCompletos() {
        System.out.println("Contribuintes: ");
        for (Pessoa pessoa : this.pessoas) {
            System.out.println(pessoa.toString() + ", Imposto: " + pessoa.calcularImposto());
        }
    }
}
