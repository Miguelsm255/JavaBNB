package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import bonilladesande.pl2_bonilla_desande_23_24.Inmueble;
import javax.swing.ImageIcon;

public class BotonInmueble extends javax.swing.JPanel {

    /*CONSTRUCTOR BÁSICO QUE NECESITA DEL PARÁMETRO "INMUEBLE" PARA MOSTRAR EN LA MINIATURA.*/
    Inmueble inmueble;
    
    public BotonInmueble(Inmueble inmueble) {
        
        this.inmueble = inmueble;
        initComponents();
        myInitComponents(inmueble);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        precioAlojamientoBoton = new javax.swing.JLabel();
        nombreInmuebleAlojamientoBoton = new javax.swing.JLabel();
        valoracionAlojamientoBoton = new javax.swing.JLabel();
        fotoBotonAlojamientoLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        precioAlojamientoBoton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioAlojamientoBoton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precioAlojamientoBoton.setText("Precio");

        nombreInmuebleAlojamientoBoton.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        nombreInmuebleAlojamientoBoton.setText("Nombre del alojamiento");

        valoracionAlojamientoBoton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valoracionAlojamientoBoton.setText("Valoración");

        fotoBotonAlojamientoLabel.setText("FOTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoBotonAlojamientoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(valoracionAlojamientoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precioAlojamientoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nombreInmuebleAlojamientoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(nombreInmuebleAlojamientoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioAlojamientoBoton)
                    .addComponent(valoracionAlojamientoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoBotonAlojamientoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    /** 
     * @param inmueble
     */
    /*EN TÉRMINOS DE INTERFAZ GRÁFICA, ESTE CÓDIGO ES EL QUE SE OCUPA DE PONER LAS MINIATURAS DE LOS INMUEBLES
    DISPONIBLES PARA LOS USUARIOS. SE OCUPA DE COLOCAR EL PRECIO (PRIMERA LÍNEA DE CÓDIGO), EL NOMBRE (SEGUNDA
    LÍNEA DE CÓDIGO), LA VALORACIÓN (TERCERA LÍNEA DE CÓDIGO), Y LA LA IMAGEN (CUARTA, QUINTA Y SEXTA LÍNEA DE CÓDIGO).*/
    public void myInitComponents(Inmueble inmueble) {
        precioAlojamientoBoton.setText(String.valueOf(inmueble.getPrecioNoche()) + "€/noche");
        nombreInmuebleAlojamientoBoton.setText(inmueble.getTitulo());
        valoracionAlojamientoBoton.setText(String.valueOf(inmueble.getCalificacion()));
        ImageIcon imagen = new ImageIcon(inmueble.getRutaFoto());
        //Se redimensiona
        ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(166, 109, 1));
        fotoBotonAlojamientoLabel.setIcon(imgRedimensionada);
    }

    /*AL PULSAR SOBRE UNO DE LOS INMUEBLES, EL INMUEBLE PASA A REGISTRARSE EN LA BASE DE DATOS COMO UN "INMUEBLE
    SELECCIONADO", CATEGORÍA QUE NOS AYUDARÁ MÁS ADELANTE A LA HORA DE TRABAJAR CON UN INMUEBLE CONCRETO. ASÍMISMO, PARA
    VER LA INFORMACIÓN DE UN INMUEBLES MÁS A FONDO, LLEVA AL USUARIO A LA PÁGINA DE ALOJAMIENTO, DONDE SE ENCUENTRA
    LA INFORMACIÓN DEL INMUEBLE EN CUESTIÓN Y LA POSIBILIDAD DE RESERVAR.*/
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        BaseDatos.inmuebleSeleccionado = inmueble;
        GestorVentanas.cambioVentana("PaginaPrincipal", "PaginaAlojamiento");

    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel fotoBotonAlojamientoLabel;
    private javax.swing.JLabel nombreInmuebleAlojamientoBoton;
    private javax.swing.JLabel precioAlojamientoBoton;
    private javax.swing.JLabel valoracionAlojamientoBoton;
    // End of variables declaration//GEN-END:variables
}
