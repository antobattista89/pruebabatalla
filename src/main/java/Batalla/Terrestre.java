/** 
 *
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 **/


package Batalla;

import Batalla.enumeradores.TipoDeBatalla;

/**
 * 
 */
class Terrestre extends Vehiculo {
    
    Double velocidad = 0.0;

    public Terrestre(Integer id, String nombre)
    {
        super(id, nombre);
    }

    double getVelocidad()
    {
        return velocidad;
    }

    @Override
    public Boolean batallaPermitida(TipoDeBatalla tipoDeBatalla)
    {
        return (tipoDeBatalla == TipoDeBatalla.TERRESTRE); //To change body of generated methods, choose Tools | Templates.
    }

}
