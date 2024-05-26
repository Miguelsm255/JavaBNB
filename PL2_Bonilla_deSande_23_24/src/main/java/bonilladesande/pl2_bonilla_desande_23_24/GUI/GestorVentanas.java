package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;

public class GestorVentanas {
    
    public static ObjetoGestorVentanas gestorVentanas = new ObjetoGestorVentanas();
    
    public static void iniciarPrograma(){
        BaseDatos.cargarDatosAnfitriones();
        BaseDatos.cargarDatosInmuebles();
        BaseDatos.cargarDatosParticulares();
        BaseDatos.cargarDatosReservas();
        
        gestorVentanas.iniciarPrograma();
    }
        
    public static void cambioVentana(String origen, String destino){
        gestorVentanas.cambioVentana(origen, destino);
    }

}
