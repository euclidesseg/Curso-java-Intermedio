/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public class VehiculoTurismo extends Vehiculo{
    
    protected int numeroPuertas;
    
    /* ya que esta clase esta heredando los atributos y metodos de la clase vhiculo 
     * debemos crear un constructor especial para esta clase que lleve los atributos  que hereda 
    */
    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas){
        /*mediante super le estamos diciendo a la clase que los atributos matricula,
         *marca y modelo ya estan inicializados y se encuantran en la clase Vehiculo  
        */
        
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public String getDatos(){
        return "MARCA: " + marca + "\n MATRICULA: " + matricula + 
                "\n MODELO: " + modelo + "NUMERO PUERTAS: " + numeroPuertas;
    }
}
