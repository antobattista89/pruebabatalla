/** 
 *
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 **/


package Batalla;

import Batalla.enumeradores.TipoDeBatalla;

/**
 * Anfibio deriva de acuatico por que es su pricipal modalidad.
 */
class Anfibio extends Acuatico {
    //test anto2
    Double velocidad = 0.0;

    public Anfibio(Integer id, String nombre)
    {
        super(id, nombre);
    }
        
    Double getVelocidad()
    {
        return velocidad;
    }

    @Override
    public Boolean batallaPermitida(TipoDeBatalla tipoDeBatalla)
    {
        return (tipoDeBatalla == TipoDeBatalla.TERRESTRE) || (tipoDeBatalla == TipoDeBatalla.NAVAL);
    }
    

}
