package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;

public class Direccion implements Serializable{

    // ATRIBUTOS
    
    private String calle;
    private int numero;
    private int codigoPostal;
    private String ciudad;

    
    // CONSTRUCTOR
    

    
    public Direccion(String calle, int numero, int codigoPostal, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }


    
    /** 
     * @return String
     */
    // GETTERS Y SETTERS
    
    public String getCalle() {
        return calle;
    }

    
    /** 
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    /** 
     * @return int
     */
    public int getNumero() {
        return numero;
    }


    
    /** 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    
    /** 
     * @return int
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }


    
    /** 
     * @param codigoPostal
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    
    /** 
     * @return String
     */
    public String getCiudad() {
        return ciudad;
    }

    
    
    /** 
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + '}';
    }
}
