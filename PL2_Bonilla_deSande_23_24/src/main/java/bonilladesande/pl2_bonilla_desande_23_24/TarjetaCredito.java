package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;
import java.time.LocalDate;

public class TarjetaCredito implements Serializable{
    
    // ATRIBUTOS
    
    private String titular;
    private long numero;
    private LocalDate caducidad;
    private int cvv;

    
    
    
    /** 
     * @return String
     */
    // GETTER Y SETTER
    
    public String getTitular() {
        return titular;
    }

    
    /** 
     * @param titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    /** 
     * @return long
     */
    public long getNumero() {
        return numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    /** 
     * @return LocalDate
     */
    public LocalDate getCaducidad() {
        return caducidad;
    }

    
    /** 
     * @param caducidad
     */
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    
    /** 
     * @return int
     */
    public int getCvv() {
        return cvv;
    }

    
    /** 
     * @param cvv
     */
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    
    // CONSTRUCTOR
    
    public TarjetaCredito(String titular, long numero, LocalDate caducidad, int cvv) {
        this.titular = titular;
        this.numero = numero;
        this.caducidad = caducidad;
        this.cvv = cvv;
    }
    
}
