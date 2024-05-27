package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

public class Factura implements Serializable{
    
    // ATRIBUTOS
    
    private Particular particular;
    private Inmueble inmueble;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    // MÉTODOS
    
    public static void imprimirFactura(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin, double precio) throws IOException{
        String NombreUser = System.getProperty("user.name");
        String ruta = "C:/Users/" + NombreUser + "/Desktop/ComoEstánMuchacho.txt";
        FileWriter Prueba = new FileWriter(ruta);
        
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
