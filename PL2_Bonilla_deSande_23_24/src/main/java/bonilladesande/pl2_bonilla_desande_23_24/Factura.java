package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Formatter;

public class Factura implements Serializable{
    
    // ATRIBUTOS
    
    private Particular particular;
    private Inmueble inmueble;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    
    /** 
     * @param particular
     * @param inmueble
     * @param fechaInicio
     * @param fechaFin
     * @param precio
     * @throws IOException
     */
    // MÉTODOS
    
    /*IMPRIME UNA FACTURA CON UN FORMATO CONCRETO DESPUÉS DE CONSEGUIR EL NOMBRE DE UN PARTICULAR, 
    DE UN INMUEBLE, DE UNAS FECHAS DE INICIO Y DE FIN Y DE UN PRECIO.*/
    public static void imprimirFactura(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin, double precio) throws IOException{
        String NombreUser = System.getProperty("user.name");
        String ruta = "C:/Users/" + NombreUser + "/Desktop/¡Gracias por contar con JavaBNB!.txt";
        FileWriter factura = new FileWriter(ruta);
        factura.write("Nombre del comprador: " + particular.getNombre());
        factura.write("Nombre del inmueble: " + inmueble.getTitulo());
        factura.write("Fecha de Inicio de la reserva: " + fechaInicio);
        factura.write("Fecha de Fin de la reserva: " + fechaFin);
        factura.write("Precio final de la factura: " + precio + "€");
        
    }
    
    /** 
     * @return Particular
     */
    // GETTERS 
    
    public Particular getParticular() {
        return particular;
    }

    
    /** 
     * @return Inmueble
     */
    public Inmueble getInmueble() {
        return inmueble;
    }

    
    /** 
     * @return LocalDate
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    
    /** 
     * @return LocalDate
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    
    /** 
     * @return double
     */
    public double getPrecio() {
        return precio;
    }
    
    // CONSTRUCTOR

    public Factura(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.particular = particular;
        this.inmueble = inmueble;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }
    
    
}
