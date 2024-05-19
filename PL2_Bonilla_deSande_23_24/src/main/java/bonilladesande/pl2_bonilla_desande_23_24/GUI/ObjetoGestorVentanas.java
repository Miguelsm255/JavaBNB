package bonilladesande.pl2_bonilla_desande_23_24.GUI;

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
        ventanaLogin.setVisible(true);
        
    }
    
    public void cambioVentana(String origen, String destino){
        

        switch(destino){
            
            case "Login" -> {
                ventanaLogin = new Login();
                ventanaLogin.setVisible(true);
            }
            
            case "CrearCuenta" -> {
                ventanaCrearCuenta = new CrearCuenta();
                ventanaCrearCuenta.setVisible(true);
            }
            
            case "EditarAjustesUsuario" -> {
                ventanaEditarAjustesUsuario = new EditarAjustesUsuario();
                ventanaEditarAjustesUsuario.setVisible(true);
            }
            
            case "PaginaPrincipal" -> {
                paginaPaginaPrincipal = new PaginaPrincipal();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaPrincipal);
                ventanaJavaBNB.setVisible(true);
            }
            
            case "AjustesUsuario" -> {
                paginaAjustesUsuario = new AjustesUsuario();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaAjustesUsuario);
                ventanaJavaBNB.setVisible(true);
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
