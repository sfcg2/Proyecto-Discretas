import java.util.ArrayList;
import java.util.Scanner;

public class App {

    boolean valor = true;
    static ArrayList<Integer> dinero = new ArrayList<Integer>();
    Maquina maquina = new Maquina();
    static StringBuilder menu = new StringBuilder();

    public static void main(String[] args) throws Exception {        
        App app = new App();
        
        menu.append("    M  E N U \n\n  TINTO -> $7.500 pesos.\n\n");
        menu.append("- Se aceptan Monedas de: $500, $1000 pesos.\n- Billetes de: $2000, $5000, $10.000 pesos.\n\n");
        menu.append("- Presione '0' para no ingresar más dinero.\n- Presione '1' para comprar el tinto.");
        app.IngresoDinero();
    } 
    
    public void IngresoDinero(){

        System.out.println(menu.toString());
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nINGRESE EL DINERO");
            
                while(valor == true){

                    System.out.print("$: ");
                    int moneda = scanner.nextInt(); 

                    if(moneda == 500 || moneda == 1000 || moneda == 2000 || moneda == 5000 || moneda == 10000){
                        dinero.add(moneda);

                    }else if(moneda == 0){
                        valor = false;
                        break;
                    }
                    else{
                        System.out.println("dinero no aceptado");
                    }   
                }   
            
            //System.out.println(dinero.toString());
            limpiarPantalla();
            esperarSegundos(300);
            System.out.print("Presione '1' para comprar el tinto o '2' para salir: ");
            int num = scanner.nextInt();
            
            if(num == 1){
                
                maquina.Automata(dinero);

            }if(num == 2){
                System.out.println("bibibib");
                return;
            }
            }
        }
        
        public static void limpiarPantalla() {
            try{ new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            }catch (Exception e){
    
                e.printStackTrace();
            }
        }
        public static void esperarSegundos(int sg) {
            try {
                Thread.sleep(sg); // Convierte segundos a milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}

