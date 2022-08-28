
package lavado;

import java.util.Scanner;

public class Lavado {
    
    private int kilosRopa;
    private String tipoRopa;
    private int llenadoCompleto = 0, lavadoCompleto = 0, secadoCompleto = 0;
    //mettodo constructor
    public Lavado(int kilosRopa, String tipoRopa){
        this.kilosRopa = kilosRopa;
        this.tipoRopa = tipoRopa;
    }    
    
    private void llenadoAgua(){
        this.kilosRopa = kilosRopa;
        if(kilosRopa <= 12){
            llenadoCompleto = 1;
            System.out.println("LLENADO EN PROCESO");
        }else{
            System.out.println(" NOS SE PUDO INICIAR EL PROCESO DE LLENADO,"
                               + " MUCHA CARGA DE ROPA, POR FAVOR VAJE LA CARGA");
        }
    }
    private void lavado(){
        if(llenadoCompleto == 1){
            lavadoCompleto = 1;
            System.out.println("LAVADO EN PROCESO....." + tipoRopa);
            System.out.println("FIN LAVADO");
        }else{
            System.out.println("NO SE PUEDE COMENZAR EL LAVADO, LLENADO INCOMPLETO");
        }
    }
    private void secado(){
        if(lavadoCompleto == 1){
            secadoCompleto = 1;
            System.out.println("SECADO EN PROCESO...."); 
        }else{
            System.out.println("NO SE PUEDE INICIAR EL SECADO, LAVADO INCOMPLETO");
        }
      }
    public void fin(){
        llenadoAgua();
        lavado();
        secado();
        if(secadoCompleto == 1){
            System.out.println("PROCESO FINALIZADO");
        }else{
            System.out.println("NO SE A PODIDO FINALIZAR PROCESO");
        }
    }
}
