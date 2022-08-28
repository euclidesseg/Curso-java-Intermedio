/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author euder
 */
public class VehiculoDeportivo extends Vehiculo{
    protected int cilindrada;
    
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada){
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
     @Override
     public String getDatos(){
        return "MARCA: " + marca + "\n MATRICULA: " + matricula + 
                "\n MODELO: " + modelo + "CILINDRADA: " + cilindrada;
    }
}
