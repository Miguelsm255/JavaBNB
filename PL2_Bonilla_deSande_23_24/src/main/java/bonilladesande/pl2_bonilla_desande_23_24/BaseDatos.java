package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BaseDatos {

        // "BASE DE DATOS" DE LOS CLIENTES Y INMUEBLES DISPONIBLES
    public static ArrayList<Particular> particulares;
    public static ArrayList<Anfitrion> anfitriones;
    public static ArrayList<Inmueble> inmuebles;
    public static ArrayList<Reserva> reservas;
    
    public static UserLoged user;

    
    // GUARDAR Y CARGAR DATOS
    
    public static void guardarDatosInmuebles(ArrayList<Inmueble> listaInmuebles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/DataBase_Serializada/inmuebles.dat"))) {
            oos.writeObject(listaInmuebles);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosInmuebles() {
        ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/DataBase_Serializada/inmuebles.dat"))) {
            listaInmuebles = (ArrayList<Inmueble>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        inmuebles = listaInmuebles;
    }
    
    
    public static void guardarDatosParticulares(ArrayList<Particular> listaParticulares) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/DataBase_Serializada/Particulares.dat"))) {
            oos.writeObject(listaParticulares);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosParticulares() {
        ArrayList<Particular> listaParticulares = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/DataBase_Serializada/Particulares.dat"))) {
            listaParticulares = (ArrayList<Particular>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        particulares = listaParticulares;
    }
    
    
    public static void guardarDatosAnfitriones(ArrayList<Anfitrion> listaAnfitriones) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/DataBase_Serializada/Anfitriones.dat"))) {
            oos.writeObject(listaAnfitriones);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosAnfitriones() {
        ArrayList<Anfitrion> listaAnfitriones = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/DataBase_Serializada/Anfitriones.dat"))) {
            listaAnfitriones = (ArrayList<Anfitrion>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        anfitriones = listaAnfitriones;
    }
    
    
    public static void guardarDatosReservas(ArrayList<Reserva> listaReservas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/DataBase_Serializada/Reservas.dat"))) {
            oos.writeObject(listaReservas);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatosReservas() {
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/DataBase_Serializada/Reservas.dat"))) {
            listaReservas = (ArrayList<Reserva>) ois.readObject();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos: " + e.getMessage());
        }
        reservas = listaReservas;
    }
    

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
