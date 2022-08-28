/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author euder
 */
public class Hilo2 extends Thread{
   @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print("E" );
            
            try{
                Hilo2.sleep(1000);
            }catch(InterruptedException err){
                System.out.println("error en la clase hilo2" + err);
            }
        }
    } 
}
