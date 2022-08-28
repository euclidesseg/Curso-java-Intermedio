
package clases;

/**
 *
 * @author euder
 */
public class Hilo1 extends Thread {
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ": G" );
            
             try{
                Hilo2.sleep(1000);
            }catch(InterruptedException err){
                System.out.println("error en la clase hilo1" + err);
            }
        }
    }
}
