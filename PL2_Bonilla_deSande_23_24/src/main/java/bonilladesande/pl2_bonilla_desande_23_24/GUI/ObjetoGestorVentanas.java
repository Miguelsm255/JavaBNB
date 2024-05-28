package bonilladesande.pl2_bonilla_desande_23_24.GUI;

import bonilladesande.pl2_bonilla_desande_23_24.BaseDatos;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/*ESTA CLASE HACE REFERENCIA A TODAS LAS VENTANAS QUE HAY EN LA APLICACIÓN, Y EL
HECHO DE TENERLAS EN ESTA DISPOSICIÓN SERÁ DE GRAN AYUDA A LA HORA DE LLAMAR A ALGUNAS 
FUNCIONES COMO EL CAMBIO DE VENTANA.*/
public class ObjetoGestorVentanas {
    
    public String ciudad;
    public LocalDate fechaEntrada;
    public LocalDate fechaSalida;
    
    Login ventanaLogin;
    CrearCuenta ventanaCrearCuenta;
    EditarAjustesUsuario ventanaEditarAjustesUsuario;
    SubirFoto ventanaSubirFoto;
    ReservarInmueble ventanaReservarInmueble;
    EditarDatosInmueble ventanaEditarInmueble;
    
    
    AjustesUsuario paginaAjustesUsuario;
    BotonInmueble paginaAlojamientoBoton;
    ListaObjetos paginaListaAlojamiento;
    PaginaAlojamiento paginaPaginaAlojamiento;
    public PaginaPrincipal paginaPaginaPrincipal;
    SubirAlojamiento paginaSubirAlojamiento;
    VerObjetos paginaVerObjetos;
    PaginaAdministrador paginaAdministrador;
    VerReserva paginaVerReserva;
    VerParticular paginaVerParticular;
    VerAnfitrion paginaVerAnfitrion;
    
    public JavaBNB ventanaJavaBNB = new JavaBNB();
    
    /*GRACIAS A ESTE MÉTODO, PODEMOS VER SIEMPRE LA PARTE DE JAVA BNB,
    ASÍ COMO EL USUARIO Y LA FOTO DE USUARIO.*/
    public void setViewpointView(){
        paginaPaginaPrincipal = new PaginaPrincipal();
        ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaPrincipal);
        ventanaJavaBNB.setVisible(true);
    }
    
    /*ESTA ES EL MÉTODO QUE ACTIVA EL PROGRAMA. GRACIAS A ÉL SE CREA
    LA PRIMERA VENTANA DE LOGIN, LA CUAL DA PIE A INICIAR SESIÓN O A
    CREARSE UNA NUEVA CUENTA.*/
    public void iniciarPrograma(){
        ventanaLogin = new Login();
        ventanaJavaBNB.setLocationRelativeTo(null);
        ventanaLogin.setLocationRelativeTo(null);
        ventanaLogin.setVisible(true);
        
    }
    
    
    /** 
     * @param origen
     * @param destino
     */
    /*ESTA ES EL MÉTODO DE CAMBIO DE VENTANA. ESTÁ PROGRAMADA DE MANERA ESPACÍFICA
    PARA FACILITAR LA TAREA DE DESARROLLAR CÓDIGO QUE TE LLEVE DE UNA VENTANA A OTRA.
    LA FUNCIÓN SE COMPONE DE DOS STRINGS, UN ORIGEN (LA PÁGINA DE LA QUE VENIMOS), Y UN DESTINO (LA 
    PÁGINA A LA QUE VAMOS). EL MÉTODO EN SÍ MISMO ESTÁ COMPUESTO POR UN SWITCH QUE HACE NUEVAS COPIAS
    DE LAS PÁGINAS DEL PROGRAMA. LUEGO EMPLEA UN "ventanaxxx.setLocationRelativeTo(null)", CUYA FUNCIÓN
    ES POSICIONAR LAS VENTANAS QUE SE ABREN EN EL CENTRO DE LA PANTALLA. TRAS ESTO, SE APLICA EL
    COMANDO ".setVisible", QUE ES LO QUE LO HACE VISIBLE.*/
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
                ventanaJavaBNB.tituloLabelPaginaPrincipal.setVisible(true);
                ventanaJavaBNB.jLabel1.setVisible(true);
                ventanaJavaBNB.jLabel2.setVisible(true);
                ventanaJavaBNB.jLabel3.setVisible(true);
                ventanaJavaBNB.busquedaCiudad.setVisible(true);
                ventanaJavaBNB.busquedaEntrada.setVisible(true);
                ventanaJavaBNB.busquedaSalida.setVisible(true);
                ventanaJavaBNB.buscar.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
                
                
                String ruta;
                
                //LA RUTA PARA OBTENER LA FOTO CAMBIA DEPENDIENDO DE SI ES UN PARTICULAR O UN ANFITRIÓN.
                if (BaseDatos.user.getTipo() == 1){
                    ruta = BaseDatos.particulares.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
                else{
                    ruta = BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
        
                ImageIcon imagen = new ImageIcon(ruta);
                //LA IMAGEN SE REDIMENSIONA.
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(54, 54, 1));
                ventanaJavaBNB.fotoLabelJavaBNB.setIcon(imgRedimensionada);
            }
            
            case "PaginaPrincipalFiltrada" -> {
                paginaPaginaPrincipal = new PaginaPrincipal(ciudad, fechaEntrada, fechaSalida);
                ventanaJavaBNB.frameJavaBNB.setViewportView(paginaPaginaPrincipal);
                ventanaJavaBNB.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setVisible(true);
                ventanaJavaBNB.fotoLabelJavaBNB.setVisible(true);
                ventanaJavaBNB.tituloLabelPaginaPrincipal.setVisible(true);
                ventanaJavaBNB.jLabel1.setVisible(true);
                ventanaJavaBNB.jLabel2.setVisible(true);
                ventanaJavaBNB.jLabel3.setVisible(true);
                ventanaJavaBNB.busquedaCiudad.setVisible(true);
                ventanaJavaBNB.busquedaEntrada.setVisible(true);
                ventanaJavaBNB.busquedaSalida.setVisible(true);
                ventanaJavaBNB.buscar.setVisible(true);
                ventanaJavaBNB.usuarioJavaBNBboton.setText(BaseDatos.user.getNombre());
                
                
                String ruta;
                
                //LA RUTA PARA OBTENER LA FOTO CAMBIA DEPENDIENDO DE SI ES UN PARTICULAR O UN ANFITRIÓN.
                if (BaseDatos.user.getTipo() == 1){
                    ruta = BaseDatos.particulares.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
                else{
                    ruta = BaseDatos.anfitriones.get(BaseDatos.user.getPosicionArrayList()).getFoto();
                }
        
                ImageIcon imagen = new ImageIcon(ruta);
                //LA IMAGEN SE REDIMENSIONA.
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
                
                if (BaseDatos.inmuebleSeleccionado.getAnfitrion().isSuperanfitrion()){
                    paginaPaginaAlojamiento.nombreAnfitrionLabel.setText(BaseDatos.inmuebleSeleccionado.getAnfitrion().getNombre() + " (Super Anfitrión)");
                }
                else{
                    paginaPaginaAlojamiento.nombreAnfitrionLabel.setText(BaseDatos.inmuebleSeleccionado.getAnfitrion().getNombre());
                }
                
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
                System.out.println("HE ENTRADO EN EL OBJETOGESTORVENTANAS");
                ventanaReservarInmueble = new ReservarInmueble();
                System.out.println("SE HA TERMINADO DE INSTANCIAR RESERVAR INMUEBLE");
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
                ventanaJavaBNB.jLabel1.setVisible(false);
                ventanaJavaBNB.jLabel2.setVisible(false);
                ventanaJavaBNB.jLabel3.setVisible(false);
                ventanaJavaBNB.busquedaCiudad.setVisible(false);
                ventanaJavaBNB.busquedaEntrada.setVisible(false);
                ventanaJavaBNB.busquedaSalida.setVisible(false);
                ventanaJavaBNB.buscar.setVisible(false);
               
                ImageIcon imagen = new ImageIcon("./src/main/java/imagenes/fotoAdmin.jpg");
                //Se redimensiona
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(382, 243, 1));
                paginaAdministrador.fotoPerfilAdmin.setIcon(imgRedimensionada);
            }
            
            case "EditarDatosInmueble" -> {
                ventanaEditarInmueble = new EditarDatosInmueble();
                ventanaEditarInmueble.setLocationRelativeTo(null);
                ventanaEditarInmueble.setVisible(true);
                
                ImageIcon imagen = new ImageIcon(BaseDatos.inmuebleSeleccionado.getRutaFoto());
                //Se redimensiona
                ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(207, 132, 1));
                ventanaEditarInmueble.FotoAloja.setIcon(imgRedimensionada);
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
            
            case "EditarDatosInmueble" -> {
                ventanaEditarInmueble.dispose();
            }
            
            case "ReservarInmueble" -> {
                ventanaReservarInmueble.dispose();
            }
            
            case "PaginaAdministrador" -> {
                //ventanaJavaBNB.dispose();
                 
            }
            
        }
        
        revalidateRepaint();
        
    }
    
    public void revalidateRepaint(){
        ventanaJavaBNB.frameJavaBNB.revalidate();
        ventanaJavaBNB.frameJavaBNB.repaint();
    }
}
