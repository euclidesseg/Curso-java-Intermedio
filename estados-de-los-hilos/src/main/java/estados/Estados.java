
package estados;

public class Estados {
    public static void main(String args[]){
        
        /* un hilo presenta distintos estados desde su creacion hasta el final de su ejecucion
         * veamoslos
        */
        
        /*NEW*/
        //la instancia de los objetos del tipo de la clase padre representa al primer estado llamado NEW
        Clases hilo1 = new Clases();
        Clases hilo2 = new Clases();

        
        /*EJECUTABLE O RUNNABLE */
        //En la siguiente linea de codjigo el hilo se encuentra en estado de ejecucion cuando el metodo start() crea los recursos nesesarios 
        //para para ejecutar el programa 
        hilo1.start();
        
        
        /*BLOQUEADO O NOT RUNNABLE*/
        // en este punto el hilo se encuentra en ejecucion pero existe una actividad del mimo hilo que lo impide
        
        //para bloquear un hilo es necesario usamos el metodo sleep y encerrarlo en la centencia try catch
        try{
            hilo1.sleep(3000);
        }catch(InterruptedException err){
            System.out.println("error en el hilo 1"  + err);
        }
        
           hilo2.start();
          // hilo2.stop();//este metodo indica que estamos acesinando el  hilo 2
        /*BLOQUEADO O NOT RUNNABLE*/
        // en este punto el hilo se encuentra en ejecucion pero existe una actividad del mimo hilo que lo impide
        
        //para bloquear un hilo es necesario usamos el metodo sleep y encerrarlo en la centencia try catch
        try{
            hilo2.sleep(3000);
        }catch(InterruptedException err){
            System.out.println("error en el hilo 2"  + err);
        }
        
        /*MUERTO O FINALIZADO */
        /* un hilo muere por causa naturarl cuando termina su ejecucion sin problema 
         * y muere intencional mente cuando ejecutamos un metodo 
         * veamos el ejempo en la linea 34*/
    }
}
