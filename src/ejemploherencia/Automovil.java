/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploherencia;

/**
 *
 * @author Estudiante
 */
public class Automovil extends Vehiculo {

    private int CantidadDePuertas;

    public Automovil(int cantidadDePuertas, int x) {
        super(x);
        this.CantidadDePuertas = cantidadDePuertas;
        this.caballosDeFuerza = 10;
        System.out.println("Constructor del hijo");
    }

    public void acelerar(int cuanto) {
        System.out.println("Acelerando: " + cuanto + "km/h");

    }
    
    @Override
    public void arrancar(){
        System.out.println("Sobreescribir metodo");
        super.arrancar();
    }

}
