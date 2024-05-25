package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;

public class Particular extends Cliente implements Serializable{
    
    // ATRIBUTOS 
    
    private boolean vip;
    private TarjetaCredito tarjeta;

    
    // GETTER Y SETTER
    
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

    public Particular(boolean vip, TarjetaCredito tarjeta, String dni, String nombre, String correo, String clave, int telefono) {
        super(dni, nombre, correo, clave, telefono);
        this.vip = vip;
        this.tarjeta = tarjeta;
    }
    
}
