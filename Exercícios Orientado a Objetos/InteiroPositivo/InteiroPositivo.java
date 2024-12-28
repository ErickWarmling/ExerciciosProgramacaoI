public class InteiroPositivo
{
    private int x;
    
    public InteiroPositivo (int x){
        this.x = x;
    }
    
    public boolean setValor (int x){
        if (x > 0){
            this.x = x;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean verificaImpar(){
        if (this.x % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void divisoresX (){
        int contDivisores = 0;
        System.out.printf ("Divisores: ");
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                System.out.printf (i + ",");
                contDivisores++;
            }
        }
        System.out.println ("Quantidade de Divisores: " + contDivisores);
    }
    
    public int fatorial (){
        return calculaFatorial(this.x);
    }
    
    private int calculaFatorial (int valor){
        if (this.x >= 1){
            int fatorial = valor;
            
            for (int i = valor - 1; i >= 1; i--){
                fatorial = fatorial * i;
            }
            return fatorial;
        }else{
            return 1;
        }
    }
    
    public double calculaFuncaoH (){
        double resultado = 0;
        for (int i = 1; i <= x; i++){
            resultado += (double)1/(double)i;
        }
        return resultado;
    }
    
    public double calculaFuncaoP (){
        double resultado = 0;
        for(int i = 1; i <= this.x; i++){
            if (i % 2 == 0){
                resultado = resultado - ((double)i / calculaFatorial(i * 2));
            }else{
                resultado = resultado + ((double)i / calculaFatorial(i * 2));
            }
        }
        return resultado;
    }
    
    public double calculaRaizQuadrada (){
        return Math.sqrt(x);
    }
    }

