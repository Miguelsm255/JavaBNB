package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;

import javax.swing.ImageIcon;

public class BotonReservas extends javax.swing.JPanel {
    /*CONSTRUCTOR BÁSICO QUE NECESITA DEL PARÁMETRO "RESERVA" PARA MOSTRAR EN LA MINIATURA.*/ 
    Reserva reserva;
    public BotonReservas(Reserva reserva) {     
        this.reserva = reserva;
        initComponents();
        myInitComponents(reserva);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreInmuebleAlojamientoBoton = new javax.swing.JLabel();
        fotoBotonAlojamientoLabel = new javax.swing.JLabel();
        nombreParticular = new javax.swing.JLabel();
        fechaEntrada = new javax.swing.JLabel();
        fechaSalida = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        nombreInmuebleAlojamientoBoton.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        nombreInmuebleAlojamientoBoton.setText("Nombre del alojamiento");

        fotoBotonAlojamientoLabel.setText("FOTO");

        nombreParticular.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        nombreParticular.setText("Nombre del particular");

        fechaEntrada.setText("Fecha entrada:");

        fechaSalida.setText("Fecha salida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fotoBotonAlojamientoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nombreInmuebleAlojamientoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(fechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombreParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreInmuebleAlojamientoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreParticular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                    .addComponent(fotoBotonAlojamientoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents



    /*EN TÉRMINOS DE INTERFAZ GRÁFICA, ESTE CÓDIGO ES EL QUE SE OCUPA DE PONER LAS MINIATURAS DE LAS RESERVAS
    DISPONIBLES PARA EL ADMINISTRADOR Y LOS PARTICULARES. SE OCUPA DE COLOCAR EL NOMBRE DEL INMUEBLE (PRIMERA LÍNEA DE CÓDIGO), EL NOMBRE DEL 
    PARTICULAR (SEGUNDA LÍNEA DE CÓDIGO), LA FECHA DE ENTRADA (TERCERA LÍNEA DE CÓDIGO), LA FECHA DE SALIDA (CUARTA LÍNEA DE CÓDIGO)
    Y LA FOTOGRAFÍA REDIMENSIONADA (EL RESTO DE LÍNEAS DE CÓDIGO).*/
    public void myInitComponents(Reserva reserva) {
        nombreInmuebleAlojamientoBoton.setText(reserva.getInmueble().getTitulo());
        nombreParticular.setText(reserva.getParticular().getNombre());
        fechaEntrada.setText("Fecha de entrada: " + String.valueOf(reserva.getFechaInicio()));
        fechaSalida.setText("Fecha de salida: " + String.valueOf(reserva.getFechaFin()));
        ImageIcon imagen = new ImageIcon(reserva.getInmueble().getRutaFoto());
        //Se redimensiona
        ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(166, 109, 1));
        fotoBotonAlojamientoLabel.setIcon(imgRedimensionada);
    }



     /*AL PULSAR SOBRE UNA DE LAS RESERVAS, SE CAMBIA LA PÁGINA A UNA VENTANA MÁS AMPLIA DONDE SE PUEDEN VER
    EN DETALLE LOS DATOS DE LA RESERVA EN CUESTIÓN.*/
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        //GestorVentanas.cambioVentana("PaginaPrincipal", "PaginaAlojamiento");
        
    }//GEN-LAST:event_formMouseClicked
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaEntrada;
    private javax.swing.JLabel fechaSalida;
    public javax.swing.JLabel fotoBotonAlojamientoLabel;
    private javax.swing.JLabel nombreInmuebleAlojamientoBoton;
    private javax.swing.JLabel nombreParticular;
    // End of variables declaration//GEN-END:variables
}
