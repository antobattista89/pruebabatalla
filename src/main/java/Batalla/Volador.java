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
class Volador extends Vehiculo {

    Double altura = 0.0;

    public Volador(Integer id, String nombre)
    {
        super(id, nombre);
    }

    public Double getAltura()
    {
        return altura;
    }

    public void setAltura(Double altura)
    {
        this.altura = altura;
    }

    @Override
    public Boolean batallaPermitida(TipoDeBatalla tipoDeBatalla)
    {
        return (tipoDeBatalla == TipoDeBatalla.AEREA); 
    }
    
    
}
