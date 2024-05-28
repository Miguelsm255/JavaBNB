package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.*;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;

public class CrearCuenta extends javax.swing.JFrame {

    public boolean esAnfitrion = false;
    public UserLoged user;
    /*COMPONENTES BÁSICOS, UTILIZAN UN CÓDIGO EXTERNO PARA CREAR UNOS PLACEHOLDERS EN LOS LUGARES
    DONDE EL USUARIO DEBE INTRODUCIR LA INFORMACIÓN. ESTO HACE DE LA APLICACIÓN ALGO MÁS INTUITIVO,
    YA QUE SI SE ESTABLECEN ALGUNOS PARÁMETROS CONCRETOS EL USUARIO SABRÁ QUÉ DEBE INTRODUCIR EN CADA
    ESPACIO PARA CREAR UNA CUENTA DE FORMA EXITOSA. LA ÚLTIMA LÍNEA DE CÓDIGO HACE REFERENCIA A UNA JLABEL
    OCULTA, LA CUÁL SOLO APARECE CON LETRAS ROJAS CUANDO EL USUARIO PROVOCA ALGÚN TIPO DE ERROR.*/
    public CrearCuenta() {
        initComponents();
        TextPrompt placenombre = new TextPrompt("Nombre de usuario", nombreFieldCrearCuenta);
        TextPrompt placeDNI = new TextPrompt("Introduzca DNI", DNIfieldCrearCuenta);
        TextPrompt placeemail = new TextPrompt("XXXXX@gmail.com", emailFieldCrearCuenta);
        TextPrompt placeclave = new TextPrompt("Contraseña", claveFieldCrearCuenta);
        TextPrompt placeconfirclave = new TextPrompt("Confirmar Contraseña", confirmaClaveFieldCrearCuenta);
        TextPrompt placetelefono = new TextPrompt("XXXXXXXXX (9 dígitos)", telefonoFieldCrearCuenta);
        TextPrompt placetarjeta = new TextPrompt("XXXXXXXXXXXXXXXX (16 dígitos)", TarjetaFieldCrearCuenta);
        TextPrompt placecaducidad = new TextPrompt("mm/yyyy", caducidadTarjetaCrearCuenta);
        TextPrompt placecvv = new TextPrompt("XXX", cvvTarjetaFieldCrearCuenta);
        CuentaLiada.setForeground(Color.RED);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javabnbLabelCrearCuenta = new javax.swing.JLabel();
        tituloLabelCrearCuenta = new javax.swing.JLabel();
        nombreLabelCrearCuenta = new javax.swing.JLabel();
        nombreFieldCrearCuenta = new javax.swing.JTextField();
        dniLabelCrearCuenta = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailFieldCrearCuenta = new javax.swing.JTextField();
        claveLabelCrearCuenta = new javax.swing.JLabel();
        tarjetaLabelCrearCuenta = new javax.swing.JLabel();
        TarjetaFieldCrearCuenta = new javax.swing.JTextField();
        cvvTarjetaFieldCrearCuenta = new javax.swing.JTextField();
        confirmaClaveLabelCrearCuenta = new javax.swing.JLabel();
        claveFieldCrearCuenta = new javax.swing.JPasswordField();
        caducidadTarjetaCrearCuenta = new javax.swing.JTextField();
        noTarjetaLabelCrearCuenta = new javax.swing.JLabel();
        caducidadTarjetaLabelCrearCuenta = new javax.swing.JLabel();
        cvvTarjetaLabelCrearCuenta = new javax.swing.JLabel();
        telefonoLabelCrearCuenta = new javax.swing.JLabel();
        telefonoFieldCrearCuenta = new javax.swing.JTextField();
        anfitrionChekboxCrearCuenta = new javax.swing.JCheckBox();
        crearCuentaButton = new javax.swing.JButton();
        confirmaClaveFieldCrearCuenta = new javax.swing.JPasswordField();
        DNIfieldCrearCuenta = new javax.swing.JTextField();
        CuentaLiada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javabnbLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        javabnbLabelCrearCuenta.setText("JavaBNB");

        tituloLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloLabelCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabelCrearCuenta.setText("Crea tu cuenta");

        nombreLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreLabelCrearCuenta.setText("Nombre:");

        nombreFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldCrearCuentaActionPerformed(evt);
            }
        });

        dniLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dniLabelCrearCuenta.setText("DNI:");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel.setText("E-mail:");

        emailFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldCrearCuentaActionPerformed(evt);
            }
        });

        claveLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        claveLabelCrearCuenta.setText("Clave:");

        tarjetaLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tarjetaLabelCrearCuenta.setText("Tarjeta de crédito:");

        TarjetaFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaFieldCrearCuentaActionPerformed(evt);
            }
        });

        cvvTarjetaFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvTarjetaFieldCrearCuentaActionPerformed(evt);
            }
        });

        confirmaClaveLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirmaClaveLabelCrearCuenta.setText("Confirma clave:");

        claveFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveFieldCrearCuentaActionPerformed(evt);
            }
        });

        caducidadTarjetaCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caducidadTarjetaCrearCuentaActionPerformed(evt);
            }
        });

        noTarjetaLabelCrearCuenta.setText("Número de tarjeta:");

        caducidadTarjetaLabelCrearCuenta.setText("Caducidad:");

        cvvTarjetaLabelCrearCuenta.setText("CVV:");

        telefonoLabelCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoLabelCrearCuenta.setText("Teléfono:");

        telefonoFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFieldCrearCuentaActionPerformed(evt);
            }
        });

        anfitrionChekboxCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        anfitrionChekboxCrearCuenta.setText("¿Quieres ser anfitrión?");
        anfitrionChekboxCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anfitrionChekboxCrearCuentaMouseClicked(evt);
            }
        });
        anfitrionChekboxCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anfitrionChekboxCrearCuentaActionPerformed(evt);
            }
        });

        crearCuentaButton.setText("Crear Cuenta");
        crearCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButtonActionPerformed(evt);
            }
        });

        confirmaClaveFieldCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaClaveFieldCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(javabnbLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dniLabelCrearCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DNIfieldCrearCuenta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(emailFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(claveLabelCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmaClaveLabelCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(confirmaClaveFieldCrearCuenta)
                                            .addComponent(claveFieldCrearCuenta)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telefonoFieldCrearCuenta)))))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CuentaLiada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tarjetaLabelCrearCuenta)
                                    .addComponent(telefonoLabelCrearCuenta)
                                    .addComponent(anfitrionChekboxCrearCuenta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(crearCuentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TarjetaFieldCrearCuenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(noTarjetaLabelCrearCuenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(caducidadTarjetaLabelCrearCuenta)
                                        .addGap(39, 39, 39)
                                        .addComponent(cvvTarjetaLabelCrearCuenta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(caducidadTarjetaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cvvTarjetaFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(javabnbLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DNIfieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(claveFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaClaveLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmaClaveFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tarjetaLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noTarjetaLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvTarjetaLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caducidadTarjetaLabelCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarjetaFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvTarjetaFieldCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caducidadTarjetaCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anfitrionChekboxCrearCuenta)
                    .addComponent(crearCuentaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CuentaLiada, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA EL NOMBRE.
    private void nombreFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA EL EMAIL.
    private void emailFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA LA TARJETA.
    private void TarjetaFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TarjetaFieldCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA EL CVV.
    private void cvvTarjetaFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvTarjetaFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvTarjetaFieldCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA LA CONTRASEÑA.
    private void claveFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveFieldCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA LA FECHA DE CADUCIDAD DE LA TARJETA.
    private void caducidadTarjetaCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caducidadTarjetaCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caducidadTarjetaCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO INTRODUZCA EL TELÉFONO.
    private void telefonoFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldCrearCuentaActionPerformed
    //CHECKBOX QUE REVISA SI EL USUARIO ES ANFITRIÓN O NO.
    private void anfitrionChekboxCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anfitrionChekboxCrearCuentaActionPerformed

        
        
    }//GEN-LAST:event_anfitrionChekboxCrearCuentaActionPerformed
    //ESPACIO PARA QUE EL USUARIO CONFIRME SU CONTRASEÑA.
    private void confirmaClaveFieldCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaClaveFieldCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmaClaveFieldCrearCuentaActionPerformed

    /*ESTA FUNCIÓN SE ACTIVA AL PULSAR EL BOTÓN DE CREAR CUENTA, Y SE ASEGURA DE RECOGER LA INFORMACIÓN
    DEL USUARIO QUE USA LA APLICACIÓN, DE QUE LOS CAMPOS ESTÉN LLENOS, DE QUE LAS CIFRAS Y LOS FORMATOS 
    SEAN CORRECTOS Y DE QUE NO HAYA NINGÚN TIPO DE ERROR. PARA ELLO UTILIZA VARIAS EXCEPCIONES
    QUE SE PUEDEN VER EN LA CATEGORÍA "BIBLIOTECA DE EXCEPCIONES". SI TODO ESTO ES CORRECTO,
    ALMACENARÁ AL USUARIO Y SUS DATOS EN LA BASE DE DATOS PARA PODER UTILIZAR SU INFORMACIÓN
    CUANDO SEA PRECISA. DESPUÉS, LLEVARÁ AL USUARIO A LA PÁGINA PRINCIPAL.*/
    private void crearCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaButtonActionPerformed
        try {
            boolean anfitrion = anfitrionChekboxCrearCuenta.isSelected();
            esAnfitrion = anfitrion;
            String dni = DNIfieldCrearCuenta.getText();
            String nombre = nombreFieldCrearCuenta.getText();
            String email = emailFieldCrearCuenta.getText();
            char[] claveChar = claveFieldCrearCuenta.getPassword();
            String clave = new String(claveChar);
            LocalDate fechaRegistro = LocalDate.now();
            /*SI ALGUNO DE LOS CAMPOS ESTÁ VACÍO, LANZA UN ERROR (SE ENTIENDE QUE TODOS LOS CAMPOS
            DEBEN SER OBLIGATORIOS*/
            if (dni.isEmpty() || nombre.isEmpty() || email.isEmpty() || clave.isEmpty()) {
                throw new BibliotecaExcepciones.CamposVacios("Todos los campos deben estar llenos.");
            }
            int telefono = Integer.parseInt(telefonoFieldCrearCuenta.getText());
            int digitostelef = String.valueOf(telefono).length();
            //SI EL TELÉFONO NO TIENE NUEVE DÍGITOS, LANZA UN ERROR.
            if (digitostelef != 9) {
                throw new BibliotecaExcepciones.TelefonoEscacharrado("El teléfono debe de contener exactamente 9 dígitos");
            }
            if (!email.contains("@gmail.com")){
            throw new BibliotecaExcepciones.EmailSinEmail("El email introducido no es válido.");
        }
            
            if (anfitrion){
                user = bonilladesande.pl2_bonilla_desande_23_24.CrearCuenta.crearCuenta(anfitrion, dni, nombre, email, clave, telefono, fechaRegistro);
            }
            else{
                
                String fechaCaducidadIntroducida = caducidadTarjetaCrearCuenta.getText();
                String[] fechaCaducidadSplit = fechaCaducidadIntroducida.split("/");
                LocalDate caducidad = LocalDate.of(Integer.parseInt(fechaCaducidadSplit[1]), Integer.parseInt(fechaCaducidadSplit[0]), 1);
                int comparaFechas = caducidad.compareTo(fechaRegistro);
                //SI LA TARJETA DE CRÉDITO INTRODUCIDA ESTÁ CADUCADA, LANZA UN ERROR.
                if (comparaFechas < 0) {
                    throw new BibliotecaExcepciones.TarjetaCaducada("La tarjeta introducida está fuera de fecha.");
                }
                int cvv = Integer.parseInt(cvvTarjetaFieldCrearCuenta.getText());
                int digitoscvv = String.valueOf(cvv).length();
                //SI EL CVV NO TIENE TRES DÍGITOS, LANZA UN ERROR.
                if (digitoscvv != 3) {
                    throw new BibliotecaExcepciones.cvvEscacharrado("El CVV debe de contener exactamente 3 dígitos");
                }
                long numTarjeta = Long.parseLong(TarjetaFieldCrearCuenta.getText());
                long digitosTarjeta = String.valueOf(numTarjeta).length();
                //SI LA TARJETA DE CRÉDITO NO TIENE 16 DÍGITOS, LANZA UN ERROR.
                if (digitosTarjeta != 16) {
                    throw new BibliotecaExcepciones.TarjetaEscacharrada("La tarjeta debe contener exactamente 16 dígitos.");
                }

                TarjetaCredito tarjeta = new TarjetaCredito(nombre, Long.parseLong(TarjetaFieldCrearCuenta.getText()), caducidad, cvv);

                boolean vip = false;
                
                user = bonilladesande.pl2_bonilla_desande_23_24.CrearCuenta.crearCuenta(anfitrion, dni, nombre, email, clave, telefono, fechaRegistro, tarjeta, vip);
            }
            
            //SI EXISTE YA UN USUARIO QUE UTILIZA ESE CORREO, LANZA UN ERROR.
            if (user.getTipo() == -1 && user.getPosicionArrayList() == 0) {
                throw new BibliotecaExcepciones.CorreoRepetido("Ya existe un usuario con este correo");
            }
            // SI LA INFORMACIÓN NO ES CORRECTA
            // MOSTRAR LABEL DE "FALTAN DATOS / DATOS INCORRECTOS / DATOS INVÁLIDOS"
            if (user.getTipo() == -1) {
                user = null;
                CuentaLiada.setText("Por favor, revise todos los campos e inténtelo de nuevo.");

            } // SI LOS DATOS SON CORRECTOS, TE REDIRIGE A LA PÁGINA DE INICIO DE SESIÓN.
            else {
                GestorVentanas.cambioVentana("CrearCuenta", "Login");
            }
            /*AQUÍ ESTÁN LOS CATCHS PARA TODOS LOS ERRORES QUE PUEDE PROVOCAR EL USUARIO, ACOMPAÑADO DEL LABEL OCULTO
            QUE MENCIONAMOS AL PRINCIPIO, EL CUÁL APARECERÁ CON LETRAS ROJAS.*/
        }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Alguno de los formatos numéricos es erróneo.");
                CuentaLiada.setText("Por favor, revise todos los campos e inténtelo de nuevo.");
            } 
        catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(this, "El campo de las fechas es erróneo.");
                CuentaLiada.setText("Por favor, revise todos los campos e inténtelo de nuevo."); } 
        catch (BibliotecaExcepciones.CorreoRepetido
                | BibliotecaExcepciones.TarjetaEscacharrada
                | BibliotecaExcepciones.cvvEscacharrado
                | BibliotecaExcepciones.TarjetaCaducada
                | BibliotecaExcepciones.TelefonoEscacharrado
                | BibliotecaExcepciones.EmailSinEmail
                | BibliotecaExcepciones.CamposVacios e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            CuentaLiada.setText("Por favor, revise todos los campos e inténtelo de nuevo.");
        }


    }//GEN-LAST:event_crearCuentaButtonActionPerformed

    private void anfitrionChekboxCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anfitrionChekboxCrearCuentaMouseClicked
       
        esAnfitrion = anfitrionChekboxCrearCuenta.isSelected();
        tarjetaLabelCrearCuenta.setVisible(!esAnfitrion);
        noTarjetaLabelCrearCuenta.setVisible(!esAnfitrion);
        caducidadTarjetaLabelCrearCuenta.setVisible(!esAnfitrion);
        cvvTarjetaLabelCrearCuenta.setVisible(!esAnfitrion);
        TarjetaFieldCrearCuenta.setVisible(!esAnfitrion);
        caducidadTarjetaCrearCuenta.setVisible(!esAnfitrion);
        cvvTarjetaFieldCrearCuenta.setVisible(!esAnfitrion);
        
    }//GEN-LAST:event_anfitrionChekboxCrearCuentaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CuentaLiada;
    private javax.swing.JTextField DNIfieldCrearCuenta;
    private javax.swing.JTextField TarjetaFieldCrearCuenta;
    private javax.swing.JCheckBox anfitrionChekboxCrearCuenta;
    private javax.swing.JTextField caducidadTarjetaCrearCuenta;
    private javax.swing.JLabel caducidadTarjetaLabelCrearCuenta;
    private javax.swing.JPasswordField claveFieldCrearCuenta;
    private javax.swing.JLabel claveLabelCrearCuenta;
    private javax.swing.JPasswordField confirmaClaveFieldCrearCuenta;
    private javax.swing.JLabel confirmaClaveLabelCrearCuenta;
    private javax.swing.JButton crearCuentaButton;
    private javax.swing.JTextField cvvTarjetaFieldCrearCuenta;
    private javax.swing.JLabel cvvTarjetaLabelCrearCuenta;
    private javax.swing.JLabel dniLabelCrearCuenta;
    private javax.swing.JTextField emailFieldCrearCuenta;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel javabnbLabelCrearCuenta;
    private javax.swing.JLabel noTarjetaLabelCrearCuenta;
    private javax.swing.JTextField nombreFieldCrearCuenta;
    private javax.swing.JLabel nombreLabelCrearCuenta;
    private javax.swing.JLabel tarjetaLabelCrearCuenta;
    private javax.swing.JTextField telefonoFieldCrearCuenta;
    private javax.swing.JLabel telefonoLabelCrearCuenta;
    private javax.swing.JLabel tituloLabelCrearCuenta;
    // End of variables declaration//GEN-END:variables
}
