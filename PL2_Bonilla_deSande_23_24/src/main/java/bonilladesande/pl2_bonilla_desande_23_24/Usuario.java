package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;

public class Usuario implements Serializable{
    
    // ATRIBUTOS
    
    private String dni;
    private String nombre;
    private String correo;
    private String clave;
    private int telefono;
    private String foto = "./src/main/java/imagenes/default.jpg";
  

    
    
    /** 
     * @return String
     */
    // GETTER Y SETTER
    public String getDni() {
        return dni;
    }

    
    /** 
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getCorreo() {
        return correo;
    }

    
    /** 
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    /** 
     * @return String
     */
    public String getClave() {
        return clave;
    }

    
    /** 
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    /** 
     * @return int
     */
    public int getTelefono() {
        return telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    public String getFoto() {
        return foto;
    }

    
    /** 
     * @param foto
     */
    public void setFoto(String foto) {
        this.foto = foto;
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
