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

    
    
    // GETTERS Y SETTERS
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPosicionArrayList() {
        return posicionArrayList;
    }

    public void setPosicionArrayList(int posicionArrayList) {
        this.posicionArrayList = posicionArrayList;
    }

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
    
    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
    
    // CONSTRUCTOR
    
    public UserLoged(int tipo, int posicionArrayList) {
        this.tipo = tipo;
        this.posicionArrayList = posicionArrayList;
    }
    
    
}
