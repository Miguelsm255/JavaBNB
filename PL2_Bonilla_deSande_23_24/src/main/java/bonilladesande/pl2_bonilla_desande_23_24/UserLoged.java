package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class UserLoged{
    
    // ATRIBUTOS PARA ACCEDER A LA INFORMACIÓN
    private int tipo;
    private int posicionArrayList;
    
    // ATRIBUTOS DEL USUARIO LOGEADO (GENERALES PARA TODOS Y OBLIGATORIOS)
    private String dni;
    private String nombre;
    private String correo;
    private String clave;
    private int telefono;
    
    // ATRIBUTOS ESPECÍFICOS DEL ANFITRIÓN (SI NO LO ES, NO SE USAN)
    private LocalDate fechaRegistro;
    private boolean superanfitrion;
    
    // ATRIBUTOS ESPECÍFICOS DEL PARTICULAR (SI NO LO ES, NO SE USAN)
    private boolean vip;
    private TarjetaCredito tarjeta;

    

    
    
    
    /** 
     * @return int
     */
    // GETTERS Y SETTERS
    
    public int getTipo() {
        return tipo;
    }

    
    /** 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    /** 
     * @return int
     */
    public int getPosicionArrayList() {
        return posicionArrayList;
    }

    
    /** 
     * @param posicionArrayList
     */
    public void setPosicionArrayList(int posicionArrayList) {
        this.posicionArrayList = posicionArrayList;
    }

    
    /** 
     * @return String
     */
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
     * @return LocalDate
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    
    /** 
     * @param fechaRegistro
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
    /** 
     * @return boolean
     */
    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    
    /** 
     * @param superanfitrion
     */
    public void setSuperanfitrion(boolean superanfitrion) {
        this.superanfitrion = superanfitrion;
    }
    
    
    /** 
     * @return boolean
     */
    public boolean isVip() {
        return vip;
    }

    
    /** 
     * @param vip
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    
    /** 
     * @return TarjetaCredito
     */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    
    /** 
     * @param tarjeta
     */
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    // CONSTRUCTOR
    
    public UserLoged(int tipo, int posicionArrayList) {
        this.tipo = tipo;
        this.posicionArrayList = posicionArrayList;
    }
    
    
}
