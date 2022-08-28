
package pilas;

import javax.swing.JOptionPane;
public class Principal {
    public static void main(String args[]){
        int opcion = 0;
        int nodo = 0;
        Pila pila = new Pila();
        
        do{
            try{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES \n\n"
                            + " 1: INCERTAR UN NODO \n"
                            + " 2: ELIMINAR UN NODO \n"
                            + " 3: LA PILA ESTA VACIA? \n"
                            + " 4: CUAL ES EL ULTIMO VALOR INGRESADO EN LA PILA? \n"
                            + " 5: CUANTOS NODO TIENE LA PILA? \n"
                            + " 6: VACIAR PILA \n"
                            + " 7: MOSTRAR CONTENIDO DE LA PILA \n"
                            + " 8: SALIR"));
            
            switch(opcion){
                case 1:
                    nodo = Integer.parseInt(JOptionPane.showInputDialog(null,"POR FAVOR INGRESE EL VALOR A INGRESAR EN EL NODO"));
                        pila.insertarNodo(nodo);
                        break;
                        
                case 2:
                    if(!pila.pilaVacia()){
                    JOptionPane.showMessageDialog(null,"SE HA ELIMINADO UN NODO CON EL VALOR" 
                        + pila.eliminarNodo());
                }else JOptionPane.showMessageDialog(null,"LA PILA ESTA VACIA");
                        break;
                        
                case 3:
                    if(!pila.pilaVacia()){
                        JOptionPane.showMessageDialog(null,"LA PILA ESSTA VACIA");
                    }else JOptionPane.showMessageDialog(null,"LA PILA NO ESTA VACIA");;
                    break;
                    
                case 4:
                     if(!pila.pilaVacia()){
                        JOptionPane.showMessageDialog(null,"EL ULTIMO VALOR INGRESADO FUE" 
                                + pila.ultimovaloringresado());
                    }else JOptionPane.showMessageDialog(null,"LA PILA ESTA ESTA VACIA");;
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null,"LA PILA CONTIEN " + pila.tamanoPila());;
                    break;
                    
                case 6:
                    if(!pila.pilaVacia()){
                    pila.vaciarPila();
                    JOptionPane.showMessageDialog(null, "SE HA VACIADO LA PILA");
                }else JOptionPane.showMessageDialog(null, "LA PILA YA ESTA VACIA");
                    break;
                    
                case 7:
                    pila.mostrarPila();
                    break;
                    
                case 8:
                    opcion = 8;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "LA OPCION NO ES CORRECTA POR FAVOR VUELVA A INGRESAR");
                    break;
            }
         }catch(NumberFormatException e){
         
         }
        }while(opcion != 8);
      
    }
}
