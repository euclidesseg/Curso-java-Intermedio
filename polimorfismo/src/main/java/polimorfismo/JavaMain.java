/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

public class JavaMain {
    public static void main(String args[]){
        Vehiculo misVehiculos[] = new Vehiculo[3];
        misVehiculos[0] = new Vehiculo("ght", "ferrari", "a98");
        misVehiculos[1] = new VehiculoTurismo("fm", "larbongini", "a98", 5);
        misVehiculos[2] = new VehiculoDeportivo("ttt", "ford", "a98", 80);

        for (int i = 0; i < misVehiculos.length; i++) {
            System.out.println(misVehiculos[i].getDatos());
            
        }
    }
}
