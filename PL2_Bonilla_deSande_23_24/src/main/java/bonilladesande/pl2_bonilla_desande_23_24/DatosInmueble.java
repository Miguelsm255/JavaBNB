/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

/**
 *
 * @author marco
 */
class DatosInmueble {


    
    public int huespedes;
    public int habitaciones;
    public int camas;
    public int baños;
    
    public DatosInmueble(int huespedes, int habitaciones, int camas, int baños) {
        this.huespedes = huespedes;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.baños = baños;
    }

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
