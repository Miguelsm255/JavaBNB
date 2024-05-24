package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;
import java.time.LocalDate;

public class Anfitrion extends Cliente implements Serializable{
    
    // ATRIBUTOS
    
    private LocalDate fechaRegistro;
    private boolean superanfitrion;
    
    
    // GETTER Y SETTER

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    public void setSuperanfitrion(boolean superanfitrion) {
        this.superanfitrion = superanfitrion;
    }
    
    
    // CONSTRUCTOR

    public Anfitrion(LocalDate fechaRegistro, String dni, String nombre, String correo, String clave, int telefono) {
        super(dni, nombre, correo, clave, telefono);
        this.fechaRegistro = fechaRegistro;
    }
    
}
