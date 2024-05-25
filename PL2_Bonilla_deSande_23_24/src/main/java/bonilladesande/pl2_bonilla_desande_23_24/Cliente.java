package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;

public class Cliente extends Usuario implements Serializable{

    
    // CONSTRUCTOR
    
    public Cliente(String dni, String nombre, String correo, String clave, int telefono) {
        super(dni, nombre, correo, clave, telefono);
    }

}
