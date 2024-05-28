package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;

public class DatosInmueble implements Serializable {

    // ATRIBUTOS
    
    private int huespedes;
    private int habitaciones;
    private int camas;
    private int baños;
    
    
    // CONSTRUCTOR
    
    public DatosInmueble(int huespedes, int habitaciones, int camas, int baños) {
        this.huespedes = huespedes;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.baños = baños;
    }

    
    

    // GETTERS Y SETTERS
    /** 
     * @return int
     */
    public int getHuespedes() {
        return huespedes;
    }

    
    /** 
     * @param huespedes
     */
    public void setHuespedes(int huespedes) {
        this.huespedes = huespedes;
    }

    
    /** 
     * @return int
     */
    public int getHabitaciones() {
        return habitaciones;
    }


    
    /** 
     * @param habitaciones
     */
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }


    
    /** 
     * @return int
     */
    public int getCamas() {
        return camas;
    }


    
    /** 
     * @param camas
     */
    public void setCamas(int camas) {
        this.camas = camas;
    }


    
    /** 
     * @return int
     */
    public int getBaños() {
        return baños;
    }

    
    
    /** 
     * @param baños
     */
    public void setBaños(int baños) {
        this.baños = baños;
    }
    
    
    
     
     /** 
      * @return String
      */
     @Override
    public String toString() {
        return "DatosInmueble{" + "huespedes=" + huespedes + ", habitaciones=" + habitaciones + ", camas=" + camas + ", ba\u00f1os=" + baños + '}';
    }
}
