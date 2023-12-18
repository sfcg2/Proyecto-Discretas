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
                    System.out.println("1");
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
                    System.out.println("2");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_1000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_1500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_2500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_5500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break; //+
                            default:
                                estadoInicial = Estado.Estado_500; //credito = 500; 
                                return;
                    }break;

                case Estado_1000:
                    System.out.println("3");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_1500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_2000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_3000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_6000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_1000; //credito = 1000; 
                                return;
                    }break;
                case Estado_1500:
                    System.out.println("4");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_2000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_2500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_3500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_6500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_1500; //credito = 1500;
                                 return;
                    }break;
                case Estado_2000:
                    System.out.println("5");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_2500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_3000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_4000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_7000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_2000; //credito = 2000; 
                                return;
                    }break;
                case Estado_2500:
                    System.out.println("6");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_3000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_3500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_4500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_7500; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_2500; //credito = 2500; 
                                return;
                    }System.out.println(credito);break;
                case Estado_3000:
                    System.out.println("7");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_3500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_4000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_5000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_Error;
                                break;
                    }break;
                case Estado_3500:
                    System.out.println("8");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_4500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_5500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_3500; //credito = 3500; 
                                return;
                    }break;
                case Estado_4000:
                    System.out.println("9");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_4500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_5000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4000; //credito = 4000; 
                                return;
                    }break;
                
                case Estado_4500:

                    System.out.println("10");
                    //credito = 0;
                    
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_5000; credito = 500; break;
                            case 1000:estadoInicial = Estado.Estado_5500; credito = 1000; break;
                            case 2000:estadoInicial = Estado.Estado_6500; credito = 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito = 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito = 10000; break;
                            default:
                                estadoInicial = Estado.Estado_4500; //credito = 4500; 
                                return;
                    }
                    break;
                case Estado_5000:
                    System.out.println("11");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_5500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_6000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_7000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_5000; //credito = 4000; 
                                return;
                    }break;
                case Estado_5500:
                    System.out.println("12");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_6000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_6500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_7500; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_5500; //credito = 4000; 
                                break;
                    }break;
                case Estado_6000:
                   System.out.println("13");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_6500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_7000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_10000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_6000; //credito = 4000; 
                                return;
                    }break;
                case Estado_6500:
                    System.out.println("14");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_7000; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_7500; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_10000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_6500; //credito = 4000; 
                                return;
                    }break;
                case Estado_7000:
                    System.out.println("15");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_7500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_10000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_10000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_10000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_7000; //credito = 4000; 
                                return;
                    }break;
                case Estado_7500:
                    System.out.println("16");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_1000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_2000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_5000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_y;
                                System.out.println("16"+ credito);  
                                break;
                    }
                    break;
                    
                case Estado_10000:
                    System.out.println("17");
                    switch (d) {
                            case 500:estadoInicial = Estado.Estado_500; credito += 500; break;
                            case 1000:estadoInicial = Estado.Estado_1000; credito += 1000; break;
                            case 2000:estadoInicial = Estado.Estado_2000; credito += 2000; break;
                            case 5000:estadoInicial = Estado.Estado_5000; credito += 5000; break;
                            case 10000:estadoInicial = Estado.Estado_10000; credito += 10000; break;
                            default:
                                estadoInicial = Estado.Estado_y;
                                System.out.println("17 "+ credito);  //credito = 4000; 
                                break;
                    }break;
                case Estado_y:
                    
                    System.out.println("Tinto comprado -> $7500");
                    System.out.println("Devuelta -> $" + (credito-7500) + " pesos");
                    System.out.println("Gracias por su compra!!");
                    break;

                case Estado_Error:
                    System.out.println("ERROR -> Dinero Insuficiente, Ingrese mas");
                    break;
                default:
                    System.out.println("no entro a ninguno");
                    break;
            }
            
        }

    }

}
