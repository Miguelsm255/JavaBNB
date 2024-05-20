package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

public class BaseDatos {

        // "BASE DE DATOS" DE LOS CLIENTES Y INMUEBLES DISPONIBLES
    public static ArrayList<Particular> particulares = new ArrayList<>();
    public static ArrayList<Anfitrion> anfitriones = new ArrayList<>();
    public static ArrayList<Inmueble> inmuebles = new ArrayList<>();;
    
    public static UserLoged user;


    public static ArrayList<Inmueble> filtroAlojamientos(boolean casa, double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad ){
        
        ArrayList<Inmueble> listaFiltrada = new ArrayList<>();
        
        listaFiltrada = filtroAlojamientos(precioMax, precioMin, calificacionMin, huespedesMin, habitacionesMin, camasMin, banosMin, titulo, ciudad);

        int tamano = listaFiltrada.size();
        for (int i = 0; i < tamano; i++){
            if (listaFiltrada.get(i).esCasa() != casa){
                listaFiltrada.remove(i);
            }
        }
        
        return listaFiltrada;
    }
    
    public static ArrayList<Inmueble> filtroAlojamientos(double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad ){
        
        ArrayList<Inmueble> listaFiltrada = new ArrayList<>();
        
        int tamano = inmuebles.size();
        
        for (int i = 0; i < tamano; i++){
            
            Inmueble inmueble = inmuebles.get(i);
            if (inmueble.getPrecioNoche() >= precioMin && 
                inmueble.getPrecioNoche() <= precioMax && 
                calificacionMin < inmueble.getCalificacion() &&
                huespedesMin < inmueble.getDatos().getHuespedes() &&
                habitacionesMin < inmueble.getDatos().getHabitaciones() &&
                camasMin < inmueble.getDatos().getCamas() &&
                banosMin < inmueble.getDatos().getBaños() &&
                inmueble.getDireccion().getCiudad().contains(ciudad)){
                
                    if (!"".equals(ciudad) || !"".equals(titulo)){
                        
                        boolean ciudadFiltro = true;
                        boolean tituloFiltro = true;
                        
                        if (!"".equals(ciudad)){
                            ciudadFiltro = false;
                            if (inmueble.getDireccion().getCiudad().contains(ciudad)){
                                ciudadFiltro = true;
                            }
                        }
                        
                        if (!"".equals(titulo)){
                            tituloFiltro = false;
                            if (inmueble.getTitulo().contains(ciudad)){
                                tituloFiltro = true;
                            }
                        }
                        
                        
                        if (ciudadFiltro && tituloFiltro){
                            Inmueble valido = inmuebles.get(i);
                            listaFiltrada.add(valido);
                        }
                    }
                    else{
                        Inmueble valido = inmuebles.get(i);
                        listaFiltrada.add(valido);
                    }  
            }
        }
        return listaFiltrada;
    }
}
