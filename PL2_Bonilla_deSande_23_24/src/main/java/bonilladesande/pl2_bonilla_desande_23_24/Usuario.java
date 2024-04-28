package bonilladesande.pl2_bonilla_desande_23_24;

public class Usuario {
    
    // ATRIBUTOS
    
    private String dni;
    private String nombre;
    private String correo;
    private String clave;
    private int telefono;

    
    // GETTER Y SETTER
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    // CONSTRUCTOR

    public Usuario(String dni, String nombre, String correo, String clave, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.telefono = telefono;
    }
    
}
