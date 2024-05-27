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

    // MÉTODOS
    
    /*IMPRIME UNA FACTURA CON UN FORMATO CONCRETO DESPUÉS DE CONSEGUIR EL NOMBRE DE UN PARTICULAR, 
    DE UN INMUEBLE, DE UNAS FECHAS DE INICIO Y DE FIN Y DE UN PRECIO.*/
    public static void imprimirFactura(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin, double precio) throws IOException{
        String NombreUser = System.getProperty("user.name");
        String ruta = "C:/Users/" + NombreUser + "/Desktop/¡Gracias por contar con JavaBNB!.txt";
        FileWriter factura = new FileWriter(ruta);
        factura.write("Nombre del comprador: " + particular);
        factura.write("Nombre del inmueble: " + inmueble);
        factura.write("Fecha de Inicio de la reserva: " + fechaInicio);
        factura.write("Fecha de Fin de la reserva: " + fechaFin);
        factura.write("Precio final de la factura: " + precio);
        
    }
    // GETTERS 
    
    public Particular getParticular() {
        return particular;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

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
