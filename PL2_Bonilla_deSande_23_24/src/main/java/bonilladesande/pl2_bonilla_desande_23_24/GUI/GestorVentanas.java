package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;

public class GestorVentanas {
    
    //ESTA FUNCIÓN CARGA TODAS LAS BASES DE DATOS AL MOMENTO DE INICIAR UN PROGRAMA.
    public static ObjetoGestorVentanas gestorVentanas = new ObjetoGestorVentanas();
    
    public static void iniciarPrograma(){
        BaseDatos.cargarDatosAnfitriones();
        BaseDatos.cargarDatosInmuebles();
        BaseDatos.cargarDatosParticulares();
        BaseDatos.cargarDatosReservas();
        gestorVentanas.iniciarPrograma();
    }
    
    
    /** 
     * @param origen
     * @param destino
     */
    /*ESTA FUNCIÓN SE OCUPA DE AÑADIR FACILIDAD A LA HORA DE PROGRAMAR LA VENTANA 
    QUE SE DEBE CERRAR Y LA QUE SE DEBE ABRIR EN SU LUGAR.*/   
    public static void cambioVentana(String origen, String destino){
        gestorVentanas.cambioVentana(origen, destino);
    }
    
    //EL FUNCIONAMIENTO DE SENDAS FUNCIONES SE PUEDE ENCONTRAR EN "ObjetoGestorVentanas"
}
