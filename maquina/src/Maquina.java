import java.util.ArrayList;

public class Maquina {
    
    

    public void IngresoDinero(ArrayList<Integer> listaDinero){

        
        char estadoInicial = 'x';
        int credito = 0;
        ArrayList<Integer> dinero = listaDinero;

        for(Integer d : dinero){

            switch (estadoInicial) {

                case 'x':
                    switch (d) {
                        case 500:
                            estadoInicial = 500; credito = 500; break;
                        case 1000:
                            estadoInicial = 1000; credito = 1000; break;
                        case 2000:
                            estadoInicial = 2000; credito = 2000; break;
                        case 5000:
                            estadoInicial = 5000; credito = 5000; break;
                        case 10000:
                            estadoInicial = 10000; credito = 10000; break;
                        default:
                            estadoInicial = 'x'; break;
                    }
                
                    break;
                case 500:

            
                default:
                    break;
            }
            
        }






    }










}
