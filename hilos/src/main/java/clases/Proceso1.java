
package clases;

/* Un hilo es un flujo de control dentro de un programa el cual permite 
 * tener multiples procesos corriendo de forma simultanea 
 * como por ejemplo dos ciclos for ejecutandose al tiempo
*/
public class Proceso1 extends Thread{
    //para este metodo debemos heredar la de la clase Thread(Hilo)
    //el metodo run y dentro de el se debe poner el codigo que queremos que se ejecute
    int numero;
    public Proceso1(String nombre){
        super(nombre);
    }
    @Override
    public void run(){
         for (int i = 0; i <= numero; i++) {
            System.out.println(i + this.getName());
        }
    }
    public void numeCondicion(int numero){
        this.numero = numero;
    }
}
