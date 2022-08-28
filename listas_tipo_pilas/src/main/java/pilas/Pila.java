
package pilas;

import javax.swing.JOptionPane;


public class Pila {
    private Nodo ultimoValorIngresado; //----este objeto servira como referencia para conocer cual fue el ultimo valor que ingreso a la pila
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
    }
    
    //metodo para saber si la pila esta vacia
    public boolean pilaVacia(){
        return ultimoValorIngresado == null;  
    }
    
    //metodo  para insertar un nodo a la lista 
    public void insertarNodo(int nodo){
        Nodo nuevoNodo = new Nodo(nodo);
        nuevoNodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevoNodo;
        tamano ++;
    }
    //metodo para eliminar un nodo de la pila 
    public int eliminarNodo(){
        int aux = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamano --;
        return aux;
    }
    //metodo para conocer cual fue el ultimo valor ingresado
    public int ultimovaloringresado(){
        return ultimoValorIngresado.informacion;
    }
    //metodo para conocer el tamaño de la pila;
    public int tamanoPila(){
        return tamano;
    }
    //metodo para vaciar la pila 
    public void vaciarPila(){
        while(!pilaVacia()){
            eliminarNodo();
        }
    }
    //metodo para mostrar el contenido de la pila
    public void mostrarPila(){
        Nodo recorrido = ultimoValorIngresado;
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
