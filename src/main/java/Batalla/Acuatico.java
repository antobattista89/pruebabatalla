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
class Acuatico extends Vehiculo {
    
    Double profundidad = 0.0;

    public Acuatico(Integer id, String nombre)
    {
        super(id, nombre);
    }

    public Double getProfundidad()
    {
        return profundidad;
    }

    @Override
    public Boolean batallaPermitida(TipoDeBatalla tipoDeBatalla)
    {
        return (tipoDeBatalla == TipoDeBatalla.NAVAL); 
    }

    
}
