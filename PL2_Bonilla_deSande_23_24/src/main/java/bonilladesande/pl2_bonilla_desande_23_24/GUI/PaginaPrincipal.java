package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import bonilladesande.pl2_bonilla_desande_23_24.Inmueble;
import java.util.ArrayList;

public class PaginaPrincipal extends javax.swing.JPanel {

    public PaginaPrincipal() {
        initComponents();
        myInitComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InmuebleSubida = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        InmuebleSubida.setText("Subir un inmueble");
        InmuebleSubida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmuebleSubidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InmuebleSubida, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InmuebleSubida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InmuebleSubidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmuebleSubidaActionPerformed
       GestorVentanas.cambioVentana("PaginaPrincipal", "SubirAlojamiento");
    }//GEN-LAST:event_InmuebleSubidaActionPerformed

    public void myInitComponents() {
        pintarLista(BaseDatos.inmuebles);
        //pintarLista(BaseDatos.filtroAlojamientos(30, 20, 0, 0, 0, 0, 0, "", ""));
        
        InmuebleSubida.setVisible(false);
        if (BaseDatos.user.getTipo() ==2){
            InmuebleSubida.setVisible(true);
        }
    }
    
    public void pintarLista(ArrayList<Inmueble> lista){
        ListaAlojamientos listaAlojamientos = new ListaAlojamientos(lista);
        this.jScrollPane1.setViewportView(listaAlojamientos);
        jScrollPane1.revalidate();
        jScrollPane1.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InmuebleSubida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
