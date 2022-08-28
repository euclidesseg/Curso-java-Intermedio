
package estados;

public class Clases extends Thread{
    
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + this.getName());
            
            try{
                Clases.sleep(2000);
            }catch(InterruptedException err){
                System.out.println("ERROR EN LA CLASE" + err);
            }
        }
    }
}
