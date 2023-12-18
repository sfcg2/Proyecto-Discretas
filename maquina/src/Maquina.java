import java.net.Socket;
import java.util.ArrayList;

public class Maquina {


    public void IngresoDinero(ArrayList<Integer> listaDinero){

        ArrayList<Integer> dinero = listaDinero;
        Estado estadoInicial = Estado.Estado_x;
        int credito = 0;
        

        for(Integer d : dinero){
            
            switch (estadoInicial) {
                
                case Estado_x:

                    switch (d) {
                        case 500:estadoInicial = Estado.Estado_500; credito += 500; break;
                        case 1000:estadoInicial = Estado.Estado_1000; credito += 1000; break;
                        case 2000:estadoInicial = Estado.Estado_2000; credito += 2000; break;
                        case 5000:estadoInicial = Estado.Estado_5000; credito += 5000; break;
                        case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                        default:
                            estadoInicial = Estado.Estado_10000; //credito = 0; 
                            return;
                    }break;

                case Estado_500:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_1000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_1500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_2500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_5500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10500; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_500; //credito = 500; 
                                return;
                    }break;

                case Estado_1000:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_1500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_2000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_3000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_6000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_11500; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_1000; //credito = 1000; 
                                return;
                    }break;
                case Estado_1500:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_2000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_2500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_3500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_6500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_11500; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_1500; //credito = 1500;
                                 return;
                    }break;
                case Estado_2000:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_2500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_3000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_4000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_7000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_12000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_2000; //credito = 2000; 
                                return;
                    }break;
                case Estado_2500:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_3000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_3500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_4500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_7500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_12500; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_2500; //credito = 2500; 
                                return;
                    }break;
                case Estado_3000:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_3500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_4000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_5000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_8000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_13000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_3000; //credito = 3000; 
                                return;
                    }break;
                case Estado_3500:

                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_4500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_7500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_8500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_13500; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_3500; //credito = 3500; 
                                return;
                    }break;
                case Estado_4000:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                
                case Estado_4500:

                    System.out.println("entra pues gonorrea");
                    //credito = 0;
                    
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_500; credito = 500; break;
                            case 1000:estadoInicial = Estado.Estado_1000; credito = 1000; break;
                            case 2000:estadoInicial = Estado.Estado_2000; credito = 2000; break;
                            case 5000:estadoInicial = Estado.Estado_5000; credito = 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito = 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4500; //credito = 4500; 
                                return;
                    }estadoInicial = Estado.Estado_y;
                    break;
                case Estado_5000:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                case Estado_5500:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                case Estado_6000:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                case Estado_6500:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                case Estado_7000:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                case Estado_7500:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                    
                case Estado_10000:
                    System.out.println("googo");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_9000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_14000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                default:
                    System.out.println("no entro a ninguno");
                    break;
            }
            
        }if(estadoInicial == Estado.Estado_y){
            System.out.println("Tinto comprado -> $7500");
            System.out.println("Devuelta -> $" + (credito-4500) + " pesos");
            System.out.println("Gracias por su compra!!");

        }

    }

}
