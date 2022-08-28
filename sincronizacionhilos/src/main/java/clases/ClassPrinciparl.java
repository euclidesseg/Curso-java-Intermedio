
package clases;

public class ClassPrinciparl {
    public static void main(String args[]){
        
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        hilo1.start();
        try{
            hilo1.sleep(15);
        }catch(InterruptedException err){
            System.out.println("error en el hilo 1" + err);
        }
        
        hilo2.start();
        try{
            hilo2.sleep(15);
        }catch(InterruptedException err){
            System.out.println("error en el hilo 2" + err);
        }
        
        hilo3.start();
        try{
            hilo3.sleep(15);
        }catch(InterruptedException err){
            System.out.println("error en el hilo 3" + err);
        }
        
        hilo4.start();
        try{
            hilo4.sleep(15);
        }catch(InterruptedException err){
            System.out.println("error en el hilo 4" + err);
        }
    
    }
}
