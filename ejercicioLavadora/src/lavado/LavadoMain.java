
package lavado;
import lavado.Lavado;

import java.util.Scanner;

public class LavadoMain {
    
    public static void main(String args[]){
        Scanner datos = new Scanner(System.in);
        
        int kilos;
        String tipoRopa;
        
        System.out.println("cuantos kilos de ropa desea lavar");
        kilos = datos.nextInt();
        
        datos.nextLine();
        System.out.println("que tipo de ropa desea introducir");
        tipoRopa = datos.nextLine();
        
        Lavado lavado = new Lavado(kilos,tipoRopa);
        lavado.fin();
    }
}
        