package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;

public class GestorVentanas {
    
    private static ObjetoGestorVentanas gestorVentanas = new ObjetoGestorVentanas();
    
    public static void iniciarPrograma(){
        gestorVentanas.iniciarPrograma();
    }
        
    public static void cambioVentana(String origen, String destino){
        gestorVentanas.cambioVentana(origen, destino);
    }

}
