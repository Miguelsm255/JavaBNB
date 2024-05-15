/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

import bonilladesande.pl2_bonilla_desande_23_24.Inmueble;

/**
 *
 * @author marco
 */

public class OperacionesInmuebles {
    
    public static void subirInmueble(String titulo, Direccion direccion, DatosInmueble datos, boolean casa, double precioNoche, Servicios servicios, int calificacion, String rutaFoto, String descripcion){
     if (casa = true){
         Inmueble inmueble = new Inmueble(titulo, direccion, datos, true, precioNoche, servicios, calificacion, rutaFoto, descripcion);
         BaseDatos.inmuebles.add(inmueble);
     }    
     else{
         Inmueble inmueble = new Inmueble(titulo, direccion, datos, true, precioNoche, servicios, calificacion, rutaFoto, descripcion);
         BaseDatos.inmuebles.add(inmueble);
     
     }
    }
    
}
