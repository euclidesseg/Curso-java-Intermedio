
package excepciones;

import java.util.Scanner;

/* Una excepcion en java es una situcion  que puede tener lugar cuando ejecutamos un
 * determinado programa ed decir, el control de errores son una forma de intentar conseguir 
 * que si el codigo de nuestro programa da error podamsos darle un comportamiento diferente */
public class Excepciones {
    public static void main(String args[]){
        try{
            //entre las llaves del try siempre ira codigo de nuestro programa 
            Scanner entrada = new Scanner(System.in);
            int numero1, numero2,resultado;
            System.out.println("dame el numero 1");
            numero1 = entrada.nextInt();
            System.out.println("dame el nmero 2");
            numero2 = entrada.nextInt();
        
            resultado = numero1 / numero2;
        
            System.out.println(resultado);
        }catch(Exception err){
            //la Excepcion es una clase que en este caso tiene un objeto que le dimos por nombnre estandar err
            //y va a capturar el error o excepcion que tengamos en el codigo
            
            System.out.println("Error...." + err);
            //en la imprecion siempre se se llamara al objeto de tipo que colocamos para que se ejecute el comportamiento
        }finally{
            System.out.println("operacion terminada");
            /* el finally ira siempre y cuando el programador asi lo requiera 
             * el codigo que se uvique dentro de esta sentencia siempre se va a ejecuar
             * aunque haya o no on error excepcion */
        }
    }
}
