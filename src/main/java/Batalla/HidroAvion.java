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
class HidroAvion extends Acuatico {

    Double altura = 0.0;
    
    
    public HidroAvion(Integer id, String nombre)
    {
        super(id, nombre);
    }

    public Double getAltura()
    {
        return this.altura = altura;
    }

    @Override
    public Boolean batallaPermitida(TipoDeBatalla tipoDeBatalla)
    {
        return (tipoDeBatalla == TipoDeBatalla.AEREA) || (tipoDeBatalla == TipoDeBatalla.NAVAL);
    }
    
}
