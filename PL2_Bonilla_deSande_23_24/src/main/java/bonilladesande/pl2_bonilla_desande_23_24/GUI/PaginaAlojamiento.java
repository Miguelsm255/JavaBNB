/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import bonilladesande.pl2_bonilla_desande_23_24.Inmueble;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class PaginaAlojamiento extends javax.swing.JPanel {

    //NECESITA UN OBJETO INMUEBLE PARA INTRODUCIR TODAS SUS CARACTERÍSTICAS
    public PaginaAlojamiento(Inmueble inmueble) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoPrecioLabel = new javax.swing.JLabel();
        textoCalif = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldServiciosPagAlojamientos = new javax.swing.JTextField();
        reservarInmuebleBoton = new javax.swing.JButton();
        NombrelojamientoLabel = new javax.swing.JLabel();
        nombreAnfitrionLabel = new javax.swing.JLabel();
        precioLabelPaginaAlojamiento = new javax.swing.JLabel();
        casa_apartamentoLabel = new javax.swing.JLabel();
        calificacionLabelPaginaAlojamiento = new javax.swing.JLabel();
        volverButtonPaginaAlojamiento = new javax.swing.JButton();
        fotoAlojamientoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        ciudadLabel = new javax.swing.JLabel();
        cpLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        baniosLabel = new javax.swing.JLabel();
        huespedesLabel = new javax.swing.JLabel();
        camasLabel = new javax.swing.JLabel();
        habitacionesLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldDescripcionPagAlojamientos = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Alojamiento:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Anfitrión:");

        textoPrecioLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoPrecioLabel.setText("Precio:");

        textoCalif.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoCalif.setText("Calificación:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setText("Servicios");

        fieldServiciosPagAlojamientos.setEditable(false);

        reservarInmuebleBoton.setText("Reservar");
        reservarInmuebleBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarInmuebleBotonActionPerformed(evt);
            }
        });

        NombrelojamientoLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        NombrelojamientoLabel.setText("Aquí va el título del alojamiento");

        nombreAnfitrionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombreAnfitrionLabel.setText("Aquí va el anfitrión");

        precioLabelPaginaAlojamiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioLabelPaginaAlojamiento.setText("Aquí va el dinero");

        casa_apartamentoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        casa_apartamentoLabel.setText("Casa/Apartamento");

        calificacionLabelPaginaAlojamiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        calificacionLabelPaginaAlojamiento.setText("calif.");

        volverButtonPaginaAlojamiento.setText("Volver");
        volverButtonPaginaAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonPaginaAlojamientoActionPerformed(evt);
            }
        });

        fotoAlojamientoLabel.setText("FOTO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setText("Dirección");

        direccionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        direccionLabel.setText("Dirección");

        ciudadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ciudadLabel.setText("Ciudad");

        cpLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpLabel.setText("cp");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setText("Datos del inmueble");

        baniosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        baniosLabel.setText("Baños:");

        huespedesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        huespedesLabel.setText("Huéspedes");

        camasLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        camasLabel.setText("Camas:");

        habitacionesLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        habitacionesLabel.setText("Habitaciones:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setText("Descripción");

        fieldDescripcionPagAlojamientos.setEditable(false);
        fieldDescripcionPagAlojamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescripcionPagAlojamientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreAnfitrionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombrelojamientoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoPrecioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(precioLabelPaginaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoCalif)
                                        .addGap(18, 18, 18)
                                        .addComponent(calificacionLabelPaginaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(reservarInmuebleBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(casa_apartamentoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fotoAlojamientoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fieldDescripcionPagAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldServiciosPagAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(56, 56, 56)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ciudadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(direccionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(volverButtonPaginaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(baniosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(huespedesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(habitacionesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombrelojamientoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreAnfitrionLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(casa_apartamentoLabel)
                        .addGap(22, 22, 22)
                        .addComponent(fotoAlojamientoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textoPrecioLabel)
                                    .addComponent(precioLabelPaginaAlojamiento))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textoCalif)
                                    .addComponent(calificacionLabelPaginaAlojamiento)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(reservarInmuebleBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(direccionLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ciudadLabel)
                                    .addComponent(cpLabel))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(baniosLabel)
                                    .addComponent(huespedesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(camasLabel)
                                    .addComponent(habitacionesLabel))
                                .addGap(33, 33, 33)
                                .addComponent(volverButtonPaginaAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldServiciosPagAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(fieldDescripcionPagAlojamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    /** 
     * @param inmueble
     */
    //OBTIENE LA RUTA DE LA FOTO DEL INMUEBLE Y LA COLOCA.
    private void myInitComponents(Inmueble inmueble) {
        ImageIcon imagen = new ImageIcon(inmueble.getRutaFoto());
        ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(300, 191, 1));
        fotoAlojamientoLabel.setIcon(imgRedimensionada);
        /*SOLO ESTÁ PERMITIDO RESERVAR INMUEBLES SI ERES UN PARTICULAR, POR LO TANTO
    EL BOTÓN PARA RESERVAR INMUEBLES SOLO ESTARÁ DISPONIBLE SI ERES UN PARTICULAR.*/
        reservarInmuebleBoton.setVisible(true);
        if (BaseDatos.user.getTipo() == 2 && !BaseDatos.inmuebleSeleccionado.getAnfitrion().getCorreo().equals(BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getCorreo())){
            reservarInmuebleBoton.setVisible(false);
        }
        else if(BaseDatos.user.getTipo() == 0){
            reservarInmuebleBoton.setText("Borrar Inmueble");
        }
        else if(BaseDatos.user.getTipo() == 2){
            reservarInmuebleBoton.setText("Editar Inmueble");
        }
        
    }
    
    /** 
     * @param 1
     */
    //SI SE PRESIONA EL BOTÓN "RESERVAR", CAMBIA LA VENTANA HACIA LA DE RESERVAR INMUEBLES.
    private void reservarInmuebleBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarInmuebleBotonActionPerformed
        
        if(BaseDatos.user.getTipo() == 1){
            GestorVentanas.cambioVentana("", "ReservarInmueble");
        }
        else if (BaseDatos.user.getTipo() == 0){
            int response = JOptionPane.showConfirmDialog(
                this, 
                "¿Desea eliminar el inmueble?", 
                "Confirmar",
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);

                //SI EL USUARIO RESPONDE QUE QUIERE SER ELIMINADO, SE RETIRARÁ SU INFORMACIÓN DE LA BASE DE DATOS.
                if (response == JOptionPane.YES_OPTION) {
                    
                    for (int i = 0; i < BaseDatos.reservas.size(); i++){
                        if(BaseDatos.reservas.get(i).getInmueble() == BaseDatos.inmuebleSeleccionado){
                            BaseDatos.reservas.remove(i);
                        }
                    }
                    
                    BaseDatos.inmuebles.remove(BaseDatos.inmuebleSeleccionado);
                    if(BaseDatos.user.getTipo() == 0){
                        GestorVentanas.cambioVentana("PaginaAlojamiento", "PaginaAdministrador");
                    }
                    else{
                        GestorVentanas.cambioVentana("PaginaAlojamiento", "PaginaPrincipal");
                    }
                }  
                else if (response == JOptionPane.NO_OPTION) {
                    
                
            } 
        }
        else{
            GestorVentanas.cambioVentana("", "EditarDatosInmueble");
        }
    }//GEN-LAST:event_reservarInmuebleBotonActionPerformed
    
    /** 
     * @param 0
     */
    //SI SE PRESIONA EL BOTÓN "VOLVER", CAMBIA LA VENTANA HACIA LA PÁGINA PRINCIPAL.
    private void volverButtonPaginaAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonPaginaAlojamientoActionPerformed
        if(BaseDatos.user.getTipo() == 0){
            GestorVentanas.cambioVentana("PaginaAlojamiento", "PaginaAdministrador");
        }
        else{
            GestorVentanas.cambioVentana("PaginaAlojamiento", "PaginaPrincipal");
        }
    }//GEN-LAST:event_volverButtonPaginaAlojamientoActionPerformed
    //??????????????
    private void fieldDescripcionPagAlojamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescripcionPagAlojamientosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescripcionPagAlojamientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel NombrelojamientoLabel;
    public javax.swing.JLabel baniosLabel;
    public javax.swing.JLabel calificacionLabelPaginaAlojamiento;
    public javax.swing.JLabel camasLabel;
    public javax.swing.JLabel casa_apartamentoLabel;
    public javax.swing.JLabel ciudadLabel;
    public javax.swing.JLabel cpLabel;
    public javax.swing.JLabel direccionLabel;
    public javax.swing.JTextField fieldDescripcionPagAlojamientos;
    public javax.swing.JTextField fieldServiciosPagAlojamientos;
    public javax.swing.JLabel fotoAlojamientoLabel;
    public javax.swing.JLabel habitacionesLabel;
    public javax.swing.JLabel huespedesLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel nombreAnfitrionLabel;
    public javax.swing.JLabel precioLabelPaginaAlojamiento;
    public javax.swing.JButton reservarInmuebleBoton;
    private javax.swing.JLabel textoCalif;
    private javax.swing.JLabel textoPrecioLabel;
    private javax.swing.JButton volverButtonPaginaAlojamiento;
    // End of variables declaration//GEN-END:variables
}
