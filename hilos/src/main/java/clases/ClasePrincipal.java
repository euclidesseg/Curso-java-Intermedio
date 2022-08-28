
package clases;


public class ClasePrincipal {
    public static void main(String args[]){
     
        Proceso1 hilo1 = new Proceso1("HILO 1");//este primer objeto hace referencia a la clase proceso2 en la cual hicimos uso de la herencia //recomendable
        Proceso1 hilo2 = new Proceso1("HILO 2");
        
        hilo1.numeCondicion(5);
        hilo2.numeCondicion(10);
        
        //hilo1.start();//se debe poner el metodo start para que arranque los hiloc que queremos ejecutar
        //hilo2.start();
    }
}
