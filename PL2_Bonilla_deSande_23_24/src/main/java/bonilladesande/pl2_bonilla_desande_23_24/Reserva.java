package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class Reserva {
    
    // ATRIBUTOS
    
    private Factura factura;
    private Particular particular;
    private Inmueble inmueble;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    
    
    // MÉTODOS
    
    public static double pago(double precioNoche, int noches, boolean vip){
        return -1;
    }
    
    public static void cancelarReserva(int posReserva){
        BaseDatos.reservas.remove(posReserva);
    }
    
    public Factura generarFactura(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin, double precio){
        Factura factura = new Factura(particular, inmueble, fechaInicio, fechaFin, precio);
        return factura;
    }

    
    
    
    // GETTERS Y SETTERS
    
    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Particular getParticular() {
        return particular;
    }

    public void setParticular(Particular particular) {
        this.particular = particular;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    // CONSTRUCTOR

    public Reserva(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin) {
        this.particular = particular;
        this.inmueble = inmueble;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    
}
