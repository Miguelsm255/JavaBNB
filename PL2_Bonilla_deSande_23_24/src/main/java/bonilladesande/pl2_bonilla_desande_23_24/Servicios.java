package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;
import java.util.ArrayList;

class Servicios implements Serializable{

 

    // ATRIBUTOS
    
    private ArrayList<String> servicios;
    
    
    // CONSTRUCTOR
    public Servicios(ArrayList<String> nombreServicio) {
        this.servicios = nombreServicio;
    }
    
    
    /** 
     * @return ArrayList<String>
     */
    // GETTERS Y SETTERS
    
       public ArrayList<String> getNombreServicio() {
        return servicios;
    }

    
    /** 
     * @param nombreServicio
     */
    public void setNombreServicio(ArrayList<String> nombreServicio) {
        this.servicios = nombreServicio;
    }

    
    /** 
     * @param servicio
     */
    //FUNCIONES
    
    public void añadirServicio(String servicio){
        if(!servicios.contains(servicio)){
            servicios.add(servicio);
        }
    }
    
    
    /** 
     * @param servicio
     */
    public void eliminarServicio(String servicio){
        if(servicios.contains(servicio)){
            servicios.remove(servicio);
        }
    }

    
}