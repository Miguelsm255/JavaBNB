package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;

public class ObjetoGestorVentanas {
    
    Login ventanaLogin;
    CrearCuenta ventanaCrearCuenta;
    EditarAjustesUsuario ventanaEditarAjustesUsuario;
    SubirFoto ventanaSubirFoto;
    
    AjustesUsuario paginaAjustesUsuario;
    AlojamientoBoton paginaAlojamientoBoton;
    ListaAlojamientos paginaListaAlojamiento;
    PaginaAlojamiento paginaPaginaAlojamiento;
    PaginaPrincipal paginaPaginaPrincipal;
    SubirAlojamiento paginaSubirAlojamiento;
    
    JavaBNB ventanaJavaBNB = new JavaBNB();
    
    public void setViewpointView(){
        paginaPaginaPrincipal = new PaginaPrincipal();
        ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaPrincipal);
        ventanaJavaBNB.setVisible(true);
    }
    
    public void iniciarPrograma(){
        ventanaLogin = new Login();
        ventanaJavaBNB.setLocationRelativeTo(null);
        ventanaLogin.setLocationRelativeTo(null);
        ventanaLogin.setVisible(true);
        
    }
    
    public void cambioVentana(String origen, String destino){
        

        switch(destino){
            
            case "Login" -> {
                ventanaLogin = new Login();
                ventanaLogin.setLocationRelativeTo(null);
                ventanaLogin.setVisible(true);
            }
            
            case "CrearCuenta" -> {
                ventanaCrearCuenta = new CrearCuenta();
                ventanaCrearCuenta.setLocationRelativeTo(null);
                ventanaCrearCuenta.setVisible(true);
            }
            
            case "EditarAjustesUsuario" -> {
                ventanaEditarAjustesUsuario = new EditarAjustesUsuario();
                ventanaEditarAjustesUsuario.setLocationRelativeTo(null);
                ventanaEditarAjustesUsuario.setVisible(true);
            }
            
            case "PaginaPrincipal" -> {
                paginaPaginaPrincipal = new PaginaPrincipal();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaPrincipal);
                ventanaJavaBNB.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(true);
                ventanaJavaBNB.fotoUsuarioJavaBNBboton.setVisible(true);
                
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
            }
            
            case "AjustesUsuario" -> {
                paginaAjustesUsuario = new AjustesUsuario();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaAjustesUsuario);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(false);
                ventanaJavaBNB.fotoUsuarioJavaBNBboton.setVisible(false);
                ventanaJavaBNB.setVisible(true);
                
                paginaAjustesUsuario.saludoLabelAjustesUsuario.setText("Hola, " + BaseDatos.user.getNombre() + "!");
                paginaAjustesUsuario.nombreLabelAjustesUsuario.setText(BaseDatos.user.getNombre());
                paginaAjustesUsuario.claveLabelAjustesUsuario.setText(BaseDatos.user.getClave());
                paginaAjustesUsuario.correoLabelAjustesUsuario.setText(BaseDatos.user.getCorreo());
                paginaAjustesUsuario.telefonoLabelAjustesUsuario.setText(String.valueOf(BaseDatos.user.getTelefono()));
            }
            
            case "PaginaAlojamiento" -> {
                paginaPaginaAlojamiento = new PaginaAlojamiento();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaAlojamiento);
                ventanaJavaBNB.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(true);
                ventanaJavaBNB.fotoUsuarioJavaBNBboton.setVisible(true);
                
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
            }
        }
        
        switch(origen){
            case "Login" -> {
                ventanaLogin.dispose();
            }
            
            case "CrearCuenta" -> {
                ventanaCrearCuenta.dispose();
            }
            
            case "PaginaPrincipal" -> {
                ventanaJavaBNB.frameJavaBNB.remove(paginaPaginaPrincipal);
                 
            }
            
            case "AjustesUsuario" -> {
                ventanaJavaBNB.frameJavaBNB.remove(paginaAjustesUsuario);
                    
            }
        }
        
        revalidateRepaint();
        
    }
    
    private void revalidateRepaint(){
        ventanaJavaBNB.frameJavaBNB.revalidate();
        ventanaJavaBNB.frameJavaBNB.repaint();
    }
}
