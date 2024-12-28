public class Sistema
{
    public static void main (String[] args){
        
        Funcionário fun1 = new Funcionário ("Bob", 160, 6.15, 2);
        Funcionário fun2 = new Funcionário ("Bia", 200, 12.50, 0);
        
        //Manipulações fun1
        //i. Retornar e imprimir o salário bruto
        System.out.printf ("%.2f%n", fun1.calcularSalarioBruto());
        
        //ii. Retornar e imprimir o desconto do INSS
        System.out.printf ("%.2f%n", fun1.calcularDescontoINSS());
        
        //iii. Retornar e imprimir o desconto de IR
        System.out.printf ("%.2f%n", fun1.calcularDescontoIR());
        
        //iv. Retornar e imprimir o salário líquido
        System.out.printf ("%.2f%n", fun1.calcularSalarioLiquido());
        
        //v. Alterar o salário por hora para R$ 8,00
        fun1.setSalarioHora(8.00);
        
        //vi. Retornar e imprimir salário líquido
        System.out.printf ("%.2f%n", fun1.calcularSalarioLiquido());
        
        //vii. Retornar e imprimir a representação textual
        System.out.println (fun1.toString());
        
        //Manipulações fun2
        //i. Retornar e imprimir a representação textual
        System.out.println (fun2.toString());
        
        //ii. Alterar a quantidade de dependentes para -2 (permitido?)
        fun2.setQuantidadeDependentes(-2);
        
        //iii. Alterar o nome para Bianca
        fun2.setNome("Bianca");
        
        //iv. Retornar e imprimir a represntação textual
        System.out.println (fun2.toString());
        
        //v. Alterar a quantidade de dependentes para 1
        fun2.setQuantidadeDependentes(1);
        
        //vi. Alterar o salário por hora para R$ 15,00
        fun2.setSalarioHora(15.00);
        
        //vii. Alterar a quantidade de horas trabalhadas para 750 (permitido?)
        fun2.setHorasTrabalhadas(750);
        
        //viii. Retornar e imprimir a representação textual
        System.out.println (fun2.toString());
    }
}
