package bonilladesande.pl2_bonilla_desande_23_24;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Anfitrion extends Cliente implements Serializable{
    
    // ATRIBUTOS
    
    private LocalDate fechaRegistro;
    private boolean superanfitrion;
    private double calificacion = 0;
    private ArrayList<Integer> calificaciones = new ArrayList<>();
    
    
    
    
    // GETTER Y SETTER

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
     * @param calificacion
     */
    public void calificar(int calificacion){
        calificaciones.add(calificacion);
        
        int total = 0;
        for (int i = 0; i < calificaciones.size(); i++){
            total = total + calificaciones.get(i);
        }
        
        double califFinal = total/calificaciones.size();
        this.calificacion = califFinal;
        actualizarSuperAnfitrion();
    }
    

    
    private void actualizarSuperAnfitrion(){
        superanfitrion = calificacion >= 4;
        for (int i = 0; i < BaseDatos.reservas.size(); i++){
            if (BaseDatos.reservas.get(i).getInmueble().getAnfitrion().getCorreo().equals(this.getCorreo())){
                BaseDatos.reservas.get(i).getInmueble().getAnfitrion().setSuperanfitrion(superanfitrion);
            }
        }
    }
    
    // CONSTRUCTOR

    public Anfitrion(LocalDate fechaRegistro, String dni, String nombre, String correo, String clave, int telefono) {
        super(dni, nombre, correo, clave, telefono);
        this.fechaRegistro = fechaRegistro;
    }
    
}
