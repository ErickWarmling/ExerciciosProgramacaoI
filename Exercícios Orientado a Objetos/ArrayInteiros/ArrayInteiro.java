import java.util.Scanner;

public class ArrayInteiro
{
    private int [] vetor;
    
    public ArrayInteiro (int tamanho){
        vetor = new int [tamanho];
    }
    
    public void preencherVetor (){
        Scanner s = new Scanner (System.in);
        
        for (int i = 0; i < vetor.length; i++){
            System.out.println ("Informe os valores do Vetor");
            vetor[i] = s.nextInt();
        }
    }
    
    public void imprimirVetor (){
        for (int i = 0; i < vetor.length; i++){
             System.out.print (vetor[i]);
             if (i < vetor.length - 1)
             System.out.print (", ");
        }
    }
    
    public boolean consultarValor (int valor){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor)
            return true;
        }
        return false;
    }
    
    public void maiorValor (){
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaiorValor = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maiorValor){
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }
        
        System.out.println ("O Maior Valor contido no Vetor é: " + maiorValor);
        System.out.println ("Posição: " + posicaoMaiorValor);
    }
    
    public void calcularFrequenciaAbsoluta (){
        for (int valor = 0; valor <= 100; valor++){
            int frequenciaAbsoluta = 0;
            for (int i = 0; i < vetor.length; i++){
                if (vetor[i] == valor){
                    frequenciaAbsoluta++;
                }
            }
            System.out.println ("Valor: " + valor + " Frequência Absoluta: " + frequenciaAbsoluta);
        }
    }
    
    public void ordemCrescente (){
        for (int i = 0; i < vetor.length - 1; i++){
            for (int x = 0; x < vetor.length - i - 1; x++){
                if (vetor[x] > vetor [x + 1]){
                    int aux = vetor[x];
                    vetor[x] = vetor[x + 1];
                    vetor [x + 1] = aux;
                }
            }
        }
    }
}
