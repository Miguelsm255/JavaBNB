package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;

class DatosInmueble implements Serializable {

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
    
    public int getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(int huespedes) {
        this.huespedes = huespedes;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }
    
    
    
     @Override
    public String toString() {
        return "DatosInmueble{" + "huespedes=" + huespedes + ", habitaciones=" + habitaciones + ", camas=" + camas + ", ba\u00f1os=" + baños + '}';
    }
}
