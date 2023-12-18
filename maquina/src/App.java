import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean valor = true;
        
        //moneda = new tipoGenerico<String>();
        Maquina maquina = new Maquina();
        ArrayList<Integer> dinero = new ArrayList<Integer>();

        System.out.println(" M  E N U ");
        System.out.println("Tinto -> $7.500 pesos.");
        System.out.println("Se aceptan Monedas de: $500, $1000 pesos.");
        System.out.println("Billetes de: $2000, $5000, $10.000 pesos." + "\nPresione '0' para no ingresar mas dinero\nPresione '1' para comprar tinto");
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese las Monedas");
            
            
            //for(int i=0; i<m; i++){
        
                while(valor == true){

                    System.out.print("Moneda: ");
                    int moneda = scanner.nextInt(); 

                    if(moneda == 500 || moneda == 1000){
                        dinero.add(moneda);

                    }else if(moneda == 0){
                        valor = false;
                        break;
                    }
                    else{
                        System.out.println("Moneda no aceptada");
                    }   
                }   
            //}
            
            System.out.println("Ingrese los Billetes");
            

            //for(int i=0; i<b; i++){

                while (true) {
                    
                    System.out.print("Billete: ");
                    int billete = scanner.nextInt();

                    if(billete == 2000 || billete == 5000 || billete == 10000){
                        dinero.add(billete);

                    }else if(billete == 0){
                        valor = false;
                        break;
                    }
                    else{
                        System.out.println("Billete no aceptado");
                    }
                //}
            }
            dinero.add(0);
            dinero.add(0);
            System.out.println(dinero.toString());

            System.out.println("Presione 1 para comprar el tinto");
            int num = scanner.nextInt();
            
            if(num == 1){

                maquina.IngresoDinero(dinero);
            }else{

                System.out.println("bibibib");
            }
       
    
    } 
    
}

}
