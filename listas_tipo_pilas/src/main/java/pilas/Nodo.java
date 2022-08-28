
package pilas;

public class Nodo {
    
    int informacion; //informacion que va a contener el nodo 
    Nodo siguiente; //esto es un objeto de tipo nodo para apuntar al siguiente nodo
    
    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
}
