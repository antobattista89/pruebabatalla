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
public class Vehiculo {
    
    Integer id;
    String nombre;

    public Vehiculo(Integer id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
        
    public Boolean batallaPermitida(TipoDeBatalla tipoDeBatalla)
    {
        return true;
    }

    public Integer getID()
    {
        return id;
    }

}
