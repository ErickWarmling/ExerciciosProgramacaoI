public class Sistema
{
   public static void main(String[] args){
    
       Estudante est1 = new Estudante (556644);
       Estudante est2 = new Estudante (579035);
       
       est1.setNome("Fernando");
       est1.acrescentarCreditos(35);
       
       est2.setNome("Beth");
       est2.acrescentarCreditos(80);
       
       //Manipulações Est1
        //i. Retornar e imprimir o login
        System.out.println (est1.determinarLogin());
        
        //ii. Retornar e imprimir a representação textual
        System.out.println(est1.toString());
        
        //iii. Adicionar 4 créditos
        est1.acrescentarCreditos(4);
        
        //iv. Retornar e imprimir a representação textual
        System.out.println(est1.toString());
        
        //v. Alterar o nome para Fernando Santos
        est1.setNome("Fernando Santos");
        
        //vi. Retornar e imprimir o login
        System.out.println (est1.determinarLogin());
        
        //vii. Retornar e imprimir a representação textual
        System.out.println(est1.toString());
        
        //Manipulações Est2
        //i. Retornar e imprimir a representação textual
        System.out.println(est2.toString());
        
        //ii. Adicionar -8 créditos (Atenção: valor negativo para testar)
        est2.acrescentarCreditos(-8);
        
        //iii. Retornar e imprimir a representação textual
        System.out.println(est2.toString());
        
        //iv. Alterar o nome para Elizabeth
        est2.setNome("Elizabeth");
        
        //v. Retornar e imprimir o login
        System.out.println (est2.determinarLogin());
   }
}
