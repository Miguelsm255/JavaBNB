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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void myInitComponents() {
        pintarLista(BaseDatos.inmuebles);
        //pintarLista(BaseDatos.filtroAlojamientos(30, 20, 0, 0, 0, 0, 0, "", ""));
    }
    
    public void pintarLista(ArrayList<Inmueble> lista){
        ListaAlojamientos listaAlojamientos = new ListaAlojamientos(lista);
        this.jScrollPane1.setViewportView(listaAlojamientos);
        jScrollPane1.revalidate();
        jScrollPane1.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
