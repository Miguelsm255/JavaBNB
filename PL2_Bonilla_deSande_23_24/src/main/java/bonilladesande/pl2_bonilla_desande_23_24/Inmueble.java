package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;
import java.util.ArrayList;

public class Inmueble implements Serializable{

    

    // ATRIBUTOS
    private String titulo;
    private Anfitrion anfitrion;
    private Direccion direccion;
    private DatosInmueble datos;
    private boolean casa;
    private double precioNoche;
    private String servicios;
    private ArrayList<Integer> calificaciones = new ArrayList<>();
    private double calificacion = 0;
    private String rutaFoto;
    private String descripcion;

    // CONSTRUCTOR
    public Inmueble(String titulo, Direccion direccion, DatosInmueble datos, boolean casa, double precioNoche, String servicios, String rutaFoto, String descripcion, Anfitrion anfitrion) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datos = datos;
        this.casa = casa;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.calificacion = 0;
        this.rutaFoto = rutaFoto;
        this.descripcion = descripcion;
        this.anfitrion = anfitrion;
    }
    
    public Inmueble(String titulo, Direccion direccion, DatosInmueble datos, boolean casa, double precioNoche, String servicios, String rutaFoto, String descripcion, Anfitrion anfitrion, ArrayList<Integer> calificaciones) {
        this.titulo = titulo;
        this.direccion = direccion;
        this.datos = datos;
        this.casa = casa;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.calificacion = 0;
        this.rutaFoto = rutaFoto;
        this.descripcion = descripcion;
        this.anfitrion = anfitrion;
        this.calificaciones = calificaciones;
    }

    
    /** 
     * @return String
     */
    // GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    
    /** 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    /** 
     * @return Direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    
    /** 
     * @param direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return DatosInmueble
     */
    public DatosInmueble getDatos() {
        return datos;
    }

    
    /** 
     * @param datos
     */
    public void setDatos(DatosInmueble datos) {
        this.datos = datos;
    }

    
    /** 
     * @return double
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    
    /** 
     * @param precioNoche
     */
    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    
    /** 
     * @return String
     */
    public String getServicios() {
        return servicios;
    }

    
    /** 
     * @param servicios
     */
    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    
    /** 
     * @return double
     */
    public double getCalificacion() {
        return calificacion;
    }

    
    /** 
     * @param calificacion
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    
    /** 
     * @return String
     */
    public String getRutaFoto() {
        return rutaFoto;
    }

    
    /** 
     * @param rutaFoto
     */
    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }


    
    /** 
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    
    /** 
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    /** 
     * @return boolean
     */
    public boolean esCasa() {
        return casa;
    }

    public void isApartamento() {
        casa = false;
    }

    public void isCasa() {
        casa = true;
    }

    
    /** 
     * @return Anfitrion
     */
    public Anfitrion getAnfitrion() {
        return anfitrion;
    }

    
    /** 
     * @param anfitrion
     */
    public void setAnfitrion(Anfitrion anfitrion) {
        this.anfitrion = anfitrion;
    }
    
    
    /** 
     * @param calificacion
     */
    public void calificar(int calificacion){
        calificaciones.add(calificacion);
        
        int total = 0;
        for (int i = 0; i < calificaciones.size(); i++){
            total = total + calificaciones.get(i);
        }
        
        double califFinal = (double) total/calificaciones.size();
        this.calificacion = califFinal;
        
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Inmueble{" + "titulo=" + titulo + ", anfitrion=" + anfitrion + ", direccion=" + direccion + ", datos=" + datos + ", casa=" + casa + ", precioNoche=" + precioNoche + ", servicios=" + servicios + ", calificacion=" + calificacion + ", rutaFoto=" + rutaFoto + ", descripcion=" + descripcion + '}';
    }

}
