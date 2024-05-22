package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class AAA_PRUEBAS_MARCOS {

    public static void main(String[] args) throws IOException {

        LocalDate ahora = LocalDate.now();
        LocalDate inicio = LocalDate.ofYearDay(1933, 33);
        LocalDate fin = LocalDate.ofYearDay(200033, 33);
        Direccion d1 = new Direccion("Calle madehuevo", 33, 33, "Ciudad Delfino");
        TarjetaCredito t1 = new TarjetaCredito("Titular Promedio", 3333333, ahora, 33333);
        Particular p1 = new Particular(false, t1, "34289423P", "Marcos", "a", "a", 33333333);
        DatosInmueble datos1 = new DatosInmueble(33, 33, 33, 33);
        ArrayList Arrayservicios = new ArrayList<>();
        Servicios servicio = new Servicios(Arrayservicios);
        Inmueble PeruTitan = new Inmueble("Perú Titán", d1, datos1, true, 33.33, servicio, 33, "Fotonelada", "Qué buen sitio, por la chucha");
        Reserva reserva1 = new Reserva(p1, PeruTitan, inicio, fin);
        Factura factura1 = reserva1.getFactura();
        double precioFactura = factura1.getPrecio();
        String precioFinal = String.valueOf(precioFactura);
        LocalDate finFactura = factura1.getFechaFin();
        LocalDate inicioFactura = factura1.getFechaInicio();
        String finFinal = String.valueOf(finFactura);
        String inicioFinal = String.valueOf(inicioFactura);  
        Particular particularFactura = factura1.getParticular();
        String particularFinal = String.valueOf(particularFactura);
        Inmueble inmuebleFactura = factura1.getInmueble();
        String inmuebleFinal = String.valueOf(inmuebleFactura);

        String ruta = "C:/Users/marco/Desktop/ComoEstánMuchacho.txt";
        //File PruebaInconfundible = new File(ruta);
        //BufferedWriter bw;
        FileWriter Prueba = new FileWriter(ruta);
        Prueba.write(precioFinal + "\n" + finFinal + "\n" + inicioFinal + "\n" + particularFinal + "\n" + inmuebleFinal);
        Prueba.close();
        //if (PruebaInconfundible.exists()) {
        //    System.out.println("El archivo está creado con éxito");
        //} else {
        //    System.out.println("El archivo no existe en este directorio.");
        //}

    }

}
