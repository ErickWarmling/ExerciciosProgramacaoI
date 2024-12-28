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
