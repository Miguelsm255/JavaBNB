package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

class Servicio {

    // ATRIBUTOS
    
    private String nombreServicio;
    
    
    // CONSTRUCTOR
    
    public Servicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    
    // GETTERS Y SETTERS
    
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
        
    }
    
    
     @Override
    public String toString() {
        return "Servicio{" + "nombreServicio=" + nombreServicio + '}';
    } 
}
