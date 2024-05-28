package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VerReserva extends javax.swing.JPanel {

    Reserva reserva;
    /**
     * Creates new form VerReserva
     */
    public VerReserva(Reserva reserva) {
        this.reserva = reserva;
        
        initComponents();
        
        if (BaseDatos.user.getTipo() != 1){
            puntuarInmueble.setVisible(false);
        }
        
        nombreAlojamiento.setText(reserva.getInmueble().getTitulo());
        nombreAnfitrion.setText(reserva.getInmueble().getAnfitrion().getNombre());
        nombreParticular.setText(reserva.getParticular().getNombre());
        
        fechaInicio.setText("Fecha inicio: " + reserva.getFechaInicio());
        fechaFin.setText("Fecha fin: " +  reserva.getFechaFin());
        
        ImageIcon imagenInmueble = new ImageIcon(reserva.getInmueble().getRutaFoto());
        //Se redimensiona
        ImageIcon imgRedimensionadaInmueble = new ImageIcon(imagenInmueble.getImage().getScaledInstance(167, 121, 1));
        fotoAlojamiento.setIcon(imgRedimensionadaInmueble);
        
        ImageIcon imagenAnfitrion = new ImageIcon(reserva.getInmueble().getAnfitrion().getFoto());
        //Se redimensiona
        ImageIcon imgRedimensionadaAnfitroin = new ImageIcon(imagenAnfitrion.getImage().getScaledInstance(167, 121, 1));
        fotoAnfitrion.setIcon(imgRedimensionadaAnfitroin);
        
        ImageIcon imagenParticular = new ImageIcon(reserva.getParticular().getFoto());
        //Se redimensiona
        ImageIcon imgRedimensionadaParticular = new ImageIcon(imagenParticular.getImage().getScaledInstance(167, 121, 1));
        fotoParticular.setIcon(imgRedimensionadaParticular);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fotoParticular = new javax.swing.JLabel();
        fotoAlojamiento = new javax.swing.JLabel();
        fotoAnfitrion = new javax.swing.JLabel();
        nombreAlojamiento = new javax.swing.JLabel();
        nombreAnfitrion = new javax.swing.JLabel();
        nombreParticular = new javax.swing.JLabel();
        fechaInicio = new javax.swing.JLabel();
        fechaFin = new javax.swing.JLabel();
        cancelarReserva = new javax.swing.JButton();
        descargarFactura = new javax.swing.JButton();
        puntuarInmueble = new javax.swing.JButton();
        volver = new javax.swing.JButton();

        jLabel1.setText("Alojamiento:");

        jLabel2.setText("Anfitrion:");

        jLabel3.setText("Particular:");

        fotoParticular.setText("Foto Particular");

        fotoAlojamiento.setText("Foto Alojamiento");

        fotoAnfitrion.setText("Foto Anfitrion");

        nombreAlojamiento.setText("jLabel4");

        nombreAnfitrion.setText("jLabel4");

        nombreParticular.setText("jLabel4");

        fechaInicio.setText("Fecha Inicio:");

        fechaFin.setText("Fecha Fin:");

        cancelarReserva.setText("Cancelar Reserva");
        cancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarReservaActionPerformed(evt);
            }
        });

        descargarFactura.setText("Descargar Factura");
        descargarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarFacturaActionPerformed(evt);
            }
        });

        puntuarInmueble.setText("Puntuar Inmueble");
        puntuarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntuarInmuebleActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(207, 207, 207))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(volver)
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descargarFactura)
                            .addComponent(cancelarReserva)
                            .addComponent(puntuarInmueble)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fotoAlojamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(nombreAlojamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fotoAnfitrion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fotoParticular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreAlojamiento)
                    .addComponent(nombreAnfitrion)
                    .addComponent(nombreParticular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fotoAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoAnfitrion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaInicio)
                    .addComponent(descargarFactura))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaFin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cancelarReserva)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntuarInmueble)
                    .addComponent(volver))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarReservaActionPerformed
        int response = JOptionPane.showConfirmDialog(
                        this, 
                        "¿Desea eliminar la reserva?", 
                        "Confirmar",
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.QUESTION_MESSAGE);

                //SI EL USUARIO RESPONDE QUE QUIERE SER ELIMINADO, SE RETIRARÁ SU INFORMACIÓN DE LA BASE DE DATOS.
                if (response == JOptionPane.YES_OPTION) {
                    
                    BaseDatos.reservas.remove(reserva); 
                    
                    if (BaseDatos.user.getTipo() != 0){
                        GestorVentanas.cambioVentana("VerReserva", "PaginaPrincipal");
                    }
                    else{
                        GestorVentanas.cambioVentana("VerReserva", "PaginaAdministrador");
                    }
                    
                } else if (response == JOptionPane.NO_OPTION) {
                    
                    
                }
    }//GEN-LAST:event_cancelarReservaActionPerformed

    private void descargarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descargarFacturaActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        if (BaseDatos.user.getTipo() != 0){
                        GestorVentanas.cambioVentana("VerReserva", "PaginaPrincipal");
                    }
                    else{
                        GestorVentanas.cambioVentana("VerReserva", "PaginaAdministrador");
                    }
    }//GEN-LAST:event_volverActionPerformed

    private void puntuarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntuarInmuebleActionPerformed
        
        String input = JOptionPane.showInputDialog(null, "Califica el alojamiento, del 1 al 5: ", "Entrada de texto", JOptionPane.QUESTION_MESSAGE);

        // Comprobar si el usuario ha introducido algún texto
        if (input != null && !input.trim().isEmpty()) {
            
            for (int i = 0; i < BaseDatos.inmuebles.size(); i++){
                if (reserva.getInmueble().getAnfitrion().getCorreo().equals(BaseDatos.inmuebles.get(i).getAnfitrion().getCorreo()) && reserva.getInmueble().getTitulo().equals(BaseDatos.inmuebles.get(i).getTitulo())){
                    BaseDatos.inmuebles.get(i).calificar(Integer.parseInt(input));
                    BaseDatos.anfitriones.get(i).calificar(Integer.parseInt(input));
                }
                
            }
        } else {
            System.out.println("No se ha introducido ninguna nota.");
        }
    }//GEN-LAST:event_puntuarInmuebleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarReserva;
    private javax.swing.JButton descargarFactura;
    private javax.swing.JLabel fechaFin;
    private javax.swing.JLabel fechaInicio;
    public javax.swing.JLabel fotoAlojamiento;
    public javax.swing.JLabel fotoAnfitrion;
    public javax.swing.JLabel fotoParticular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel nombreAlojamiento;
    public javax.swing.JLabel nombreAnfitrion;
    public javax.swing.JLabel nombreParticular;
    private javax.swing.JButton puntuarInmueble;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
