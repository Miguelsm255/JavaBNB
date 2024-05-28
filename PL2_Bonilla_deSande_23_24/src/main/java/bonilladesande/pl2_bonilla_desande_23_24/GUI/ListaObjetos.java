package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;
import java.awt.Component;
import java.awt.Dimension;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;

public final class ListaObjetos extends javax.swing.JPanel {

    public ListaObjetos(String tipo) {
        initComponents();
        myInitComponents(tipo);
    }
    
    public ListaObjetos(String tipo, boolean casa, double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad) {
        initComponents();
        myInitComponents(tipo, casa, precioMax, precioMin, calificacionMin, huespedesMin, habitacionesMin, camasMin, banosMin, titulo, ciudad);
    }
    
    public ListaObjetos(String tipo, double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad) {
        initComponents();
        myInitComponents(tipo, precioMax, precioMin, calificacionMin, huespedesMin, habitacionesMin, camasMin, banosMin, titulo, ciudad);
    }
    
    public ListaObjetos(String tipo, Anfitrion anfitrion) {
        initComponents();
        myInitComponents(tipo, anfitrion);
    }
    
    public ListaObjetos(String tipo, Particular particular) {
        initComponents();
        myInitComponents(tipo, particular);
    }
    
    public ListaObjetos(String tipo, String ciudad, LocalDate fechaInicio, LocalDate fechaFin){
        initComponents();
        myInitComponents(tipo, ciudad, fechaInicio, fechaFin);
    }
    
    ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
    ArrayList<Reserva> listaReservas = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    /** 
     * @param tipo
     * @param casa
     * @param precioMax
     * @param precioMin
     * @param calificacionMin
     * @param huespedesMin
     * @param habitacionesMin
     * @param camasMin
     * @param banosMin
     * @param titulo
     * @param ciudad
     */
    public void myInitComponents(String tipo, boolean casa, double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad){
        listaInmuebles = BaseDatos.filtroAlojamientos(casa, precioMax, precioMin, calificacionMin, huespedesMin, habitacionesMin, camasMin, banosMin, titulo, ciudad);
        hacerCosas(tipo);
    }
    
    
    /** 
     * @param tipo
     * @param precioMax
     * @param precioMin
     * @param calificacionMin
     * @param huespedesMin
     * @param habitacionesMin
     * @param camasMin
     * @param banosMin
     * @param titulo
     * @param ciudad
     */
    public void myInitComponents(String tipo, double precioMax, double precioMin, double calificacionMin, int huespedesMin, int habitacionesMin, int camasMin, int banosMin, String titulo, String ciudad){
        listaInmuebles = BaseDatos.filtroAlojamientos(precioMax, precioMin, calificacionMin, huespedesMin, habitacionesMin, camasMin, banosMin, titulo, ciudad);
        hacerCosas(tipo);
    }
    
    
    /** 
     * @param tipo
     */
    public void myInitComponents(String tipo) {
        listaInmuebles = BaseDatos.inmuebles;
        hacerCosas(tipo);
    }
    
    
    /** 
     * @param tipo
     * @param anfitrion
     */
    public void myInitComponents(String tipo, Anfitrion anfitrion) {
        
        for(int i = 0; i < BaseDatos.inmuebles.size(); i++){
            if(BaseDatos.inmuebles.get(i).getAnfitrion().getCorreo().equals(BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getCorreo())){
                listaInmuebles.add(BaseDatos.inmuebles.get(i));
            }
        }
        
        for(int i = 0; i < BaseDatos.reservas.size(); i++){
            if(BaseDatos.reservas.get(i).getInmueble().getAnfitrion().getCorreo().equals(BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getCorreo())){
                listaReservas.add(BaseDatos.reservas.get(i));
            }
        }
        hacerCosas(tipo);
    }
    
    
    /** 
     * @param tipo
     * @param particular
     */
    public void myInitComponents(String tipo, Particular particular) {
        
        for(int i = 0; i < BaseDatos.reservas.size(); i++){
            if(BaseDatos.reservas.get(i).getParticular().getCorreo().equals(BaseDatos.user.getCorreo())){
                listaReservas.add(BaseDatos.reservas.get(i));
            }
        }
        hacerCosas(tipo);
    }
    
    
    /** 
     * @param tipo
     * @param ciudad
     * @param fechaInicio
     * @param fechaFin
     */
    public void myInitComponents(String tipo, String ciudad, LocalDate fechaInicio, LocalDate fechaFin){
        listaInmuebles = BaseDatos.filtroAlojamientos(ciudad, fechaInicio, fechaFin);
        
        hacerCosas(tipo);
    }
    
    
    /** 
     * @param tipo
     */
    private void hacerCosas(String tipo){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        setBorder(new EmptyBorder(10, 10, 10, 10));
        
        if ("Inmuebles".equals(tipo)){
            
            for (int i = 0; i < listaInmuebles.size(); i++) {
                Inmueble inmueble = listaInmuebles.get(i);
                BotonInmueble alojamientoBoton = new BotonInmueble(inmueble);

                alojamientoBoton.setAlignmentX(Component.LEFT_ALIGNMENT); // Alineación izquierda
                alojamientoBoton.setMaximumSize(new Dimension(Integer.MAX_VALUE, alojamientoBoton.getPreferredSize().height)); // Ancho máximo
                add(alojamientoBoton); // Agregar componente al panel
                add(Box.createVerticalStrut(5));
            }
        }
        
        if ("Reservas".equals(tipo)){
            
            if(BaseDatos.user.getTipo() == 0){
                listaReservas = BaseDatos.reservas;
            }

            for (int i = 0; i < listaReservas.size(); i++) {
                Reserva reserva = listaReservas.get(i);
                BotonReservas alojamientoBoton = new BotonReservas(reserva);

                alojamientoBoton.setAlignmentX(Component.LEFT_ALIGNMENT); // Alineación izquierda
                alojamientoBoton.setMaximumSize(new Dimension(Integer.MAX_VALUE, alojamientoBoton.getPreferredSize().height)); // Ancho máximo
                add(alojamientoBoton); // Agregar componente al panel
                add(Box.createVerticalStrut(5));
            }
        }
        
        if ("Particulares".equals(tipo)){
            
            ArrayList<Particular> listaParticulares = BaseDatos.particulares;
            
            for (int i = 0; i < listaParticulares.size(); i++) {
                Particular particular = listaParticulares.get(i);
                BotonParticulares alojamientoBoton = new BotonParticulares(particular);

                alojamientoBoton.setAlignmentX(Component.LEFT_ALIGNMENT); // Alineación izquierda
                alojamientoBoton.setMaximumSize(new Dimension(Integer.MAX_VALUE, alojamientoBoton.getPreferredSize().height)); // Ancho máximo
                add(alojamientoBoton); // Agregar componente al panel
                add(Box.createVerticalStrut(5));
            }
        }
        
        if ("Anfitriones".equals(tipo)){
            
            ArrayList<Anfitrion> listaAnfitriones = BaseDatos.anfitriones;
            
            for (int i = 0; i < listaAnfitriones.size(); i++) {
                Anfitrion anfitrion = listaAnfitriones.get(i);
                BotonAnfitriones alojamientoBoton = new BotonAnfitriones(anfitrion);

                alojamientoBoton.setAlignmentX(Component.LEFT_ALIGNMENT); // Alineación izquierda
                alojamientoBoton.setMaximumSize(new Dimension(Integer.MAX_VALUE, alojamientoBoton.getPreferredSize().height)); // Ancho máximo
                add(alojamientoBoton); // Agregar componente al panel
                add(Box.createVerticalStrut(5));
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
