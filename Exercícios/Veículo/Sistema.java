public class Sistema
{
    public static void main (String[] args){
        
        Veiculo veiculo1 = new Veiculo ("Fusca", 150000);
        Veiculo veiculo2 = new Veiculo ("Gol", 75000);
        
        //Ativação metódos necessários
        veiculo1.setPotencia(1.0);
        veiculo1.abastecer(30);
        veiculo2.setPotencia(1.6);
        veiculo2.abastecer(10);
        
        //Manipulações Veiculo 1
        veiculo1.viajar(100);
        veiculo1.viajar(150);
        veiculo1.viajar(300);
        veiculo1.abastecer(50);
        System.out.println (veiculo1.toString());
        veiculo1.abastecer(30);
        veiculo1.viajar(300);
        veiculo1.viajar(45);
        System.out.println (veiculo1.toString());
        
        //Manipulações Veiculo 2
        veiculo2.viajar(50);
        veiculo2.setPotencia(2.0);
        veiculo2.viajar(50);
        System.out.println (veiculo2.toString());
        veiculo2.viajar(15);
        veiculo2.abastecer(45);
        veiculo2.viajar(100);
        System.out.println (veiculo2.toString());
        }
    }

