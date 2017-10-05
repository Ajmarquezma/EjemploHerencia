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
public class Vehiculo {

    protected int caballosDeFuerza;

    public Vehiculo(int x) {
        System.out.println("Constructor del padre");
        this.caballosDeFuerza = x;
    }

    public void arrancar() {
        System.out.println("Arrancar padre");
    }

    public void Detener() {
        System.out.println("Detener padre");
    }

}
