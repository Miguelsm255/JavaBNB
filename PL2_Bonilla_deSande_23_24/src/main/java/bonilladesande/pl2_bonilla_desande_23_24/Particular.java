package bonilladesande.pl2_bonilla_desande_23_24;

public class Particular extends Cliente{
    
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
    
    
}
