package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import javax.swing.ImageIcon;

public class ObjetoGestorVentanas {
    
    Login ventanaLogin;
    CrearCuenta ventanaCrearCuenta;
    EditarAjustesUsuario ventanaEditarAjustesUsuario;
    SubirFoto ventanaSubirFoto;
    ReservarInmueble ventanaReservarInmueble;
    
    
    AjustesUsuario paginaAjustesUsuario;
    BotonInmueble paginaAlojamientoBoton;
    ListaObjetos paginaListaAlojamiento;
    PaginaAlojamiento paginaPaginaAlojamiento;
    PaginaPrincipal paginaPaginaPrincipal;
    SubirAlojamiento paginaSubirAlojamiento;
    VerObjetos paginaVerObjetos;
    PaginaAdministrador paginaAdministrador;
    
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
                
                if(BaseDatos.user.getTipo() != 0){
                    ventanaJavaBNB.usuarioJavaBNBboton.setVisible(true);
                    ventanaJavaBNB.fotoLabelJavaBNB.setVisible(true);
                }
                
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
                
                paginaPaginaAlojamiento.NombrelojamientoLabel.setText(BaseDatos.inmuebleSeleccionado.getTitulo());
                paginaPaginaAlojamiento.nombreAnfitrionLabel.setText(BaseDatos.inmuebleSeleccionado.getAnfitrion().getNombre());
                paginaPaginaAlojamiento.precioLabelPaginaAlojamiento.setText(BaseDatos.inmuebleSeleccionado.getPrecioNoche() +  "€/noche");
                paginaPaginaAlojamiento.calificacionLabelPaginaAlojamiento.setText(String.valueOf(BaseDatos.inmuebleSeleccionado.getCalificacion()));
                paginaPaginaAlojamiento.fieldServiciosPagAlojamientos.setText(BaseDatos.inmuebleSeleccionado.getServicios());
                paginaPaginaAlojamiento.fieldDescripcionPagAlojamientos.setText(BaseDatos.inmuebleSeleccionado.getDescripcion());
                paginaPaginaAlojamiento.direccionLabel.setText(BaseDatos.inmuebleSeleccionado.getDireccion().getCalle() + " Nº" + String.valueOf(BaseDatos.inmuebleSeleccionado.getDireccion().getNumero()));
                paginaPaginaAlojamiento.ciudadLabel.setText(BaseDatos.inmuebleSeleccionado.getDireccion().getCiudad());
                paginaPaginaAlojamiento.cpLabel.setText(String.valueOf(BaseDatos.inmuebleSeleccionado.getDireccion().getCodigoPostal()));
                paginaPaginaAlojamiento.camasLabel.setText("Camas: " + String.valueOf(BaseDatos.inmuebleSeleccionado.getDatos().getCamas()));
                paginaPaginaAlojamiento.huespedesLabel.setText("Huéspedes: " + String.valueOf(BaseDatos.inmuebleSeleccionado.getDatos().getHuespedes()));
                paginaPaginaAlojamiento.habitacionesLabel.setText("Habitaciones: " + String.valueOf(BaseDatos.inmuebleSeleccionado.getDatos().getHabitaciones()));
                paginaPaginaAlojamiento.baniosLabel.setText("Baños: " + String.valueOf(BaseDatos.inmuebleSeleccionado.getDatos().getBaños()));
                
                if(BaseDatos.inmuebleSeleccionado.esCasa()){
                    paginaPaginaAlojamiento.casa_apartamentoLabel.setText("Casa");
                }
                else{
                    paginaPaginaAlojamiento.casa_apartamentoLabel.setText("Apartamento");
                }
                
                ImageIcon imagen = new ImageIcon(BaseDatos.inmuebleSeleccionado.getRutaFoto());
                //Se redimensiona
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(316, 191, 1));
                paginaPaginaAlojamiento.fotoAlojamientoLabel.setIcon(imgRedimensionada);
            }
            
            case "SubirFoto" -> {
                ventanaSubirFoto = new SubirFoto();
                ventanaSubirFoto.setLocationRelativeTo(null);
                ventanaSubirFoto.setVisible(true);
            }
            
            case "SubirAlojamiento" -> {
                paginaSubirAlojamiento = new SubirAlojamiento();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaSubirAlojamiento);
                ventanaJavaBNB.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(true);
                ventanaJavaBNB.fotoLabelJavaBNB.setVisible(true);
                
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
            }
            
            case "ReservarInmueble" -> {
                ventanaReservarInmueble = new ReservarInmueble();
                ventanaReservarInmueble.setLocationRelativeTo(null);
                ventanaReservarInmueble.setVisible(true);
            }
            
            case "VerObjetos" -> {
                paginaVerObjetos = new VerObjetos();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaVerObjetos);
                ventanaJavaBNB.setVisible(true);
            }
            
            case "PaginaAdministrador" -> {
                paginaAdministrador = new PaginaAdministrador();
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaAdministrador);
                ventanaJavaBNB.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(false);
                ventanaJavaBNB.fotoLabelJavaBNB.setVisible(false);
                ventanaJavaBNB.tituloLabelPaginaPrincipal.setVisible(false);
                
                ImageIcon imagen = new ImageIcon("./src/main/java/imagenes/fotoAdmin.jpg");
                //Se redimensiona
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(382, 243, 1));
                paginaAdministrador.fotoPerfilAdmin.setIcon(imgRedimensionada);
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
            
            case "EditarAjustesUsuario" -> {
                ventanaEditarAjustesUsuario.dispose();
            }
            
            case "VerObjetos" -> {
                ventanaJavaBNB.frameJavaBNB.remove(paginaVerObjetos);
            }
        }
        
        revalidateRepaint();
        
    }
    
    private void revalidateRepaint(){
        ventanaJavaBNB.frameJavaBNB.revalidate();
        ventanaJavaBNB.frameJavaBNB.repaint();
    }
}
