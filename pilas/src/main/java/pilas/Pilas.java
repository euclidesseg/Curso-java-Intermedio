
package pilas;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Pilas {
    String aux = "";
    int tope  = -1;
    int pila[] = new int[5];;
    
    public void push(){
        if(tope >= pila.length -1){
            JOptionPane.showMessageDialog(null,"la pila esta llena");
            
        }else{
            tope  += 1;
            pila[tope] = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor"));
        }
    }
    public void pop(){
        if(tope == -1){
            JOptionPane.showMessageDialog(null,"la pila esta  vacia");
        }else{
            pila[tope] = 0;
            JOptionPane.showMessageDialog(null,"se ha eliminado un elemento");
        }
    }
    public void mostrarPila(){
        for (int tope = 0; tope >= 0; tope--) {
            aux += pila[tope ] + "\n";
            JOptionPane.showMessageDialog(null,aux);
            aux="";
        }
    }
}
