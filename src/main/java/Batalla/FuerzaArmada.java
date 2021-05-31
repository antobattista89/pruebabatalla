package Batalla;

import Batalla.enumeradores.TipoDeBatalla;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada
{

    private List<Vehiculo> convoy;
    private List<Batalla> batallas;

    public FuerzaArmada()
    {
        convoy = new ArrayList<Vehiculo>();
        batallas = new ArrayList<Batalla>();
    }

    void agregarVehiculo(Vehiculo vehiculoNuevo)
    {
        // verificar codigo duplicado
        Boolean encontrado = false;
        for (Vehiculo vehiculo : convoy)
          {
            if (vehiculo.getID() == vehiculoNuevo.getID())
                encontrado = true;
          }
 
        if (!encontrado) convoy.add(vehiculoNuevo);
    }

    Object getCapacidadDeDefensa()
    {
        return convoy.size();
    }

    void crearBatalla(String nombre, TipoDeBatalla tipoDeBatalla, Double latitud, Double longitud)
    {
        batallas.add(new Batalla(tipoDeBatalla, nombre, latitud, longitud));
    }

    Batalla getBatalla(String nombre)
    {
        for (Batalla batalla : batallas)
          {
            if (batalla.getNombre().equals(nombre)) return batalla;
          }

        return null;
    }
    
    Vehiculo getVehiculo (Integer id)
    {
       Vehiculo vehiculoEncontrado = null;
       
        for (Vehiculo vehiculo : convoy)
            if (vehiculo.getID() == id) vehiculoEncontrado = vehiculo;
       
       return vehiculoEncontrado;
        
    }        

    Boolean enviarALaBatalla(String nombre, Integer vehiculoID)
    {
        // Averiguar batalla y vehiculo  ---------------
        Batalla batalla = getBatalla(nombre);
        
        // Averiguar vehiculo ------------------
        Vehiculo vehiculo = getVehiculo(vehiculoID);

        // Encontrado? 
        if ((batalla != null) && (vehiculo != null))
            return batalla.agregarVehiculo(vehiculo);
        else
            return false;

    }

}
