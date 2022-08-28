/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]){
        Pilas obj = new Pilas();
        int opcion = 0;
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "menu de opciones"
                    + "1. ingresar elmento \n"
                    + "2. eliminar elemento \n"
                    + "3. mostrar datos \n"
                    + "4. salir"));
        switch(opcion){
            case 1:
                obj.push();
                break;
            case 2: obj.pop();
                break;
            case 3:
                obj.mostrarPila();
                break;
            case 4:
                opcion = 4;
                break;
        }
        
        }while(opcion != 4);
    }
}
