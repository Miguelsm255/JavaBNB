/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

/**
 *
 * @author marco
 */
import java.util.ArrayList;
class Servicio {

   
    public String nombreServicio;
    
    public Servicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

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