package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

class Servicios {

 

    // ATRIBUTOS
    
    private ArrayList<String> servicios;
    
    
    // CONSTRUCTOR
    public Servicios(ArrayList<String> nombreServicio) {
        this.servicios = nombreServicio;
    }
    
    // GETTERS Y SETTERS
    
       public ArrayList<String> getNombreServicio() {
        return servicios;
    }

    public void setNombreServicio(ArrayList<String> nombreServicio) {
        this.servicios = nombreServicio;
    }

    //FUNCIONES
    
    public void añadirServicio(String servicio){
        if(!servicios.contains(servicio)){
            servicios.add(servicio);
        }
    }
    
    public void eliminarServicio(String servicio){
        if(servicios.contains(servicio)){
            servicios.remove(servicio);
        }
    }

    
}