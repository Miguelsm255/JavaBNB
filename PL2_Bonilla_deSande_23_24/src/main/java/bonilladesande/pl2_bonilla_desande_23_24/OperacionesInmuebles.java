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
    
    /** 
     * @param titulo
     * @param direccion
     * @param datos
     * @param casa
     * @param precioNoche
     * @param servicios
     * @param calificacion
     * @param rutaFoto
     * @param descripcion
     */
    //SUBE UN INMUEBLE CON LOS PARÁMETROS DEL CONSTRUCTOR.
    public static void subirInmueble(String titulo, Direccion direccion, DatosInmueble datos, boolean casa, double precioNoche, String servicios, int calificacion, String rutaFoto, String descripcion){
        Anfitrion anfitrion = BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList());
     
        Inmueble inmueble = new Inmueble(titulo, direccion, datos, casa, precioNoche, servicios, rutaFoto, descripcion, anfitrion);
        BaseDatos.inmuebles.add(inmueble);
     
    }
    
}
