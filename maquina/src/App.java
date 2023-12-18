import java.util.ArrayList;
import java.util.Scanner;

public class App {

    boolean valor = true;
    ArrayList<Integer> dinero = new ArrayList<Integer>();
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
        ArrayList<Integer> dinero1 = dinero;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nINGRESE MONEDAS");
            
                while(valor == true){

                    System.out.print("Moneda: ");
                    int moneda = scanner.nextInt(); 

                    if(moneda == 500 || moneda == 1000){
                        dinero1.add(moneda);

                    }else if(moneda == 0){
                        valor = false;
                        break;
                    }
                    else{
                        System.out.println("Moneda no aceptada");
                    }   
                }   
            
            System.out.println("\nINGRESE BILLETES");

                while (true) {
                    
                    System.out.print("Billete: ");
                    int billete = scanner.nextInt();

                    if(billete == 2000 || billete == 5000 || billete == 10000){
                        dinero1.add(billete);

                    }else if(billete == 0){
                        valor = false;
                        break;
                    }
                    else{System.out.println("Billete no aceptado");}
            }
            dinero.add(0);
            dinero.add(0);
            
            System.out.println(dinero.toString());

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
}

