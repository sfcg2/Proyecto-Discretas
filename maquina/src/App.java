import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Maquina maquina = new Maquina();
        ArrayList<Integer> dinero = new ArrayList<Integer>();

        System.out.println(" M  E N U ");
        System.out.println("Tinto -> $7.500 pesos.");
        System.out.println("Se aceptan Monedas de: $500, $1000 pesos.");
        System.out.println("Billetes de: $2000, $5000, $10.000 pesos." + "\nIngrese 'x' para no ingresar mas dinero\nIngrese 'y' para obtener tinto");
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cuantas monedas va a ingresar?: ");
            int m = scanner.nextInt();
            
            for(int i=0; i<m; i++){
        
                while(true){

                    System.out.print("Moneda: ");
                    int moneda = scanner.nextInt();

                    if(moneda == 500 || moneda == 1000){
                        dinero.add(moneda);
                        break;

                    }else{
                        System.out.println("Moneda no aceptada");
                    }   
                }   
            }
            
            System.out.print("¿Cuantos billetes va a ingresar?: ");
            int b = scanner.nextInt();

            for(int i=0; i<b; i++){

                while (true) {
                    
                    System.out.print("Billete: ");
                    int billete = scanner.nextInt();

                    if(billete == 2000 || billete == 5000 || billete == 10000){
                        dinero.add(billete);
                        break;

                    }else{
                        System.out.println("Billete no aceptado");
                    }
                }
            }

            System.out.println(dinero.toString());
            
       
    
    } maquina.IngresoDinero(dinero);
    
}

}
