package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

public class Inmueble {

    

    // ATRIBUTOS
    private String titulo;
    private Direccion direccion;
    private DatosInmueble datos;
    private boolean casa;
    private double precioNoche;
    private Servicios servicios;
    private int calificacion;
    private String rutaFoto;
    private String descripcion;

    // CONSTRUCTOR
    public Inmueble(String titulo, Direccion direccion, DatosInmueble datos, boolean casa, double precioNoche, Servicios servicios, int calificacion, String rutaFoto, String descripcion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datos = datos;
        this.casa = casa;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.calificacion = calificacion;
        this.rutaFoto = rutaFoto;
        this.descripcion = descripcion;
    }

    // GETTERS Y SETTERS
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

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
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


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean esCasa() {
        return casa;
    }

    public void isApartamento() {
        casa = false;
    }

    public void isCasa() {
        casa = true;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Inmueble{" + "titulo=" + titulo + ", direccion=" + direccion + ", datos=" + datos + ", casa=" + casa + ", precioNoche=" + precioNoche + ", servicios=" + servicios + ", calificacion=" + calificacion + ", rutaFoto=" + rutaFoto + ", descripcion=" + descripcion + '}';
    }

}
