package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva implements Serializable{
    
    // ATRIBUTOS
    
    private Factura factura;
    private Particular particular;
    private Inmueble inmueble;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;
    
    
    // MÉTODOS
    
    
    public static void anadirReserva(Particular particular, Inmueble inmueble, LocalDate fechaInicio, LocalDate fechaFin, double precio){
        Reserva reserva = new Reserva(particular, inmueble, fechaInicio, fechaFin);
        BaseDatos.reservas.add(reserva);
    }
    
    //public static void pago(double precio, Particular particular){
        // Sacar la tarjeta de credito del particular
        // comprobar si tiene saldo y si es así sacarlo y reservar.
    //}
    
    
    public static double calcularPrecio(double precioNoche, LocalDate fechaInicio, LocalDate fechaFin, boolean vip){
        
        int dias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        
        double precioTotal = dias * precioNoche;
        
        if (vip){
            precioTotal = precioTotal * 0.9;
        }
        
        return precioTotal;
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
        this.precio = calcularPrecio(inmueble.getPrecioNoche(), fechaInicio, fechaFin, particular.isVip());
        this.factura = generarFactura(particular, inmueble, fechaInicio, fechaFin, precio);
    }
    
    
}
