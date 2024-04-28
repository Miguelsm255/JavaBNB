/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

/**
 *
 * @author marco
 */
import java.util.ArrayList;


public class Inmuebles {

   
    public String titulo;
    public Direccion direccion;
    public DatosInmueble datos;
    public boolean casa;
    public int precioNoche;
    public ArrayList<Servicio> servicios;
    public int calificacion;
    public String rutaFoto;

    public Inmuebles(String titulo, Direccion direccion, DatosInmueble datos, boolean casa, int precioNoche, ArrayList<Servicio> servicios, int calificacion, String rutaFoto) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datos = datos;
        this.casa = casa;
        this.precioNoche = precioNoche;
        servicios = new ArrayList<>();
        this.calificacion = calificacion;
        this.rutaFoto = rutaFoto;
    
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public DatosInmueble getDatos() {
        return datos;
    }

    public void setDatos(DatosInmueble datos) {
        this.datos = datos;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
     public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }
    
    public void añadirServicio(Servicio servicio) {
        if (!servicios.contains(servicio)) {
            servicios.add(servicio);
        }
    }
    
    public void eliminarServicio(Servicio servicio) {
        if (servicios.contains(servicio)) {
            servicios.remove(servicio);
        }
    }
    
    public boolean esCasa() {
        return casa;
    }
    public void isApartamento(){
        casa = false;
    }
    
    public void isCasa(){
        casa = true;
    }
    
    @Override
    public String toString() {
        return "Inmuebles{" + "titulo=" + titulo + ", direccion=" + direccion + ", datos=" + datos + ", casa=" + casa + ", precioNoche=" + precioNoche + ", servicios=" + servicios + ", calificacion=" + calificacion + '}';
    }
}
