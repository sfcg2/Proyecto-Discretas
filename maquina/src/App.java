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
            int n = scanner.nextInt();

            for(int i=0; i<n; i++){
                System.out.print("Moneda: ");
                //int moneda = scanner.nextInt();
                dinero.add(scanner.nextInt());
            }
        }
        System.out.println(dinero.toString());
        //maquina.IngresoDinero(dinero);
    }
}
