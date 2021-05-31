package Batalla;

import java.util.List;

import Batalla.enumeradores.TipoDeBatalla;
import java.util.ArrayList;

public class Batalla {
	private Double latitud = 0.0;
	private Double longitud = 0.0;
	private TipoDeBatalla tipo;
	private String nombre;
	private List<Vehiculo> vehiculosEnLaBatalla;

    public Batalla(TipoDeBatalla tipo, String nombre, Double latitud, Double longitud)
    {
        this.tipo = tipo;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        vehiculosEnLaBatalla = new ArrayList<Vehiculo>();
    }

    public Double getLatitud()
    {
        return latitud;
    }

    public Double getLongitud()
    {
        return longitud;
    }

    public String getNombre()
    {
        return nombre;
    }
     
    public Boolean agregarVehiculo(Vehiculo vehiculo)
    {
      if (vehiculo.batallaPermitida(tipo))
        {
          vehiculosEnLaBatalla.add(vehiculo);
          return true;
        }
      else return false;
    }             
}
