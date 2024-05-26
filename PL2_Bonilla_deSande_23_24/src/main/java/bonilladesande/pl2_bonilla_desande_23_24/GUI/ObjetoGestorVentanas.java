package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import javax.swing.ImageIcon;

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
    
    public JavaBNB ventanaJavaBNB = new JavaBNB();
    
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
                ventanaJavaBNB.fotoLabelJavaBNB.setVisible(true);
                
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
                
                
                String ruta;
        
                if (BaseDatos.user.getTipo() == 1){
                    ruta = BaseDatos.particulares.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
                else{
                    ruta = BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
        
                ImageIcon imagen = new ImageIcon(ruta);
                //Se redimensiona
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(54, 54, 1));
                ventanaJavaBNB.fotoLabelJavaBNB.setIcon(imgRedimensionada);
            }
            
            case "AjustesUsuario" -> {
                paginaAjustesUsuario = new AjustesUsuario();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaAjustesUsuario);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(false);
                ventanaJavaBNB.fotoLabelJavaBNB.setVisible(false);
                ventanaJavaBNB.setVisible(true);
                
                paginaAjustesUsuario.saludoLabelAjustesUsuario.setText("Hola, " + BaseDatos.user.getNombre() + "!");
                paginaAjustesUsuario.nombreLabelAjustesUsuario.setText(BaseDatos.user.getNombre());
                paginaAjustesUsuario.claveLabelAjustesUsuario.setText(BaseDatos.user.getClave());
                paginaAjustesUsuario.correoLabelAjustesUsuario.setText(BaseDatos.user.getCorreo());
                paginaAjustesUsuario.telefonoLabelAjustesUsuario.setText(String.valueOf(BaseDatos.user.getTelefono()));
                
                String ruta;
        
                if (BaseDatos.user.getTipo() == 1){
                    ruta = BaseDatos.particulares.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
                else{
                    ruta = BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
        
                ImageIcon imagen = new ImageIcon(ruta);
                //Se redimensiona
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(200, 200, 1));
                paginaAjustesUsuario.fotoUsuarioBoton.setIcon(imgRedimensionada);
            }
            
            case "PaginaAlojamiento" -> {
                paginaPaginaAlojamiento = new PaginaAlojamiento(BaseDatos.inmuebleSeleccionado);
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaAlojamiento);
                ventanaJavaBNB.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(true);
                ventanaJavaBNB.fotoLabelJavaBNB.setVisible(true);
                
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
                
                paginaPaginaAlojamiento.NombrelojamientoLabel.setText(BaseDatos.inmuebleSeleccionado.getTitulo());
                paginaPaginaAlojamiento.nombreAnfitrionLabel.setText(BaseDatos.inmuebleSeleccionado.getAnfitrion().getNombre());
                paginaPaginaAlojamiento.precioLabelPaginaAlojamiento.setText(BaseDatos.inmuebleSeleccionado.getPrecioNoche() +  "€/noche");
                paginaPaginaAlojamiento.calificacionLabelPaginaAlojamiento.setText(String.valueOf(BaseDatos.inmuebleSeleccionado.getCalificacion()));
                paginaPaginaAlojamiento.fieldServiciosPagAlojamientos.setText(BaseDatos.inmuebleSeleccionado.getServicios());
                
                if(BaseDatos.inmuebleSeleccionado.esCasa()){
                    paginaPaginaAlojamiento.casa_apartamentoLabel.setText("Casa");
                }
                else{
                    paginaPaginaAlojamiento.casa_apartamentoLabel.setText("Apartamento");
                }
                
                
            }
            
            case "SubirFoto" -> {
                ventanaSubirFoto = new SubirFoto();
                ventanaSubirFoto.setLocationRelativeTo(null);
                ventanaSubirFoto.setVisible(true);
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
            
            case "SubirAlojamiento" -> {
                ventanaJavaBNB.frameJavaBNB.remove(paginaSubirAlojamiento);
                    
            }
            
            case "SubirFoto" -> {
                ventanaSubirFoto.dispose();
                
            }
            
            case "PaginaAlojamiento" -> {
                BaseDatos.inmuebleSeleccionado = null;
            }
        }
        
        revalidateRepaint();
        
    }
    
    private void revalidateRepaint(){
        ventanaJavaBNB.frameJavaBNB.revalidate();
        ventanaJavaBNB.frameJavaBNB.repaint();
    }
}
