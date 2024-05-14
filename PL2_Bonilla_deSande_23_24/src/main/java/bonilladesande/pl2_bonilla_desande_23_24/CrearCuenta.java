package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class CrearCuenta {
    
    public static void crearCuenta(boolean anfitrion, String dni, String nombre, String email, String clave, int telefono, LocalDate fechaRegistro){
        
        
        // COMPROBAR SI LA CUENTA EXISTE
        
        // -1 -1 SIGNIFICA QUE NO EXISTE
        int noCuenta[] = {-1, -1};
        
        // HACE LA BÚSQUEDA Y GUARDA EL RESULTADO
        int resultadoBusqueda[] = Login.busquedaUsuario(email);
        
        // SI SON IGUALES QUIERE DECIR QUE NO EXISTE UNA CUENTA CON ESE CORREO
        if (resultadoBusqueda[0] == noCuenta[0] && resultadoBusqueda[1] == noCuenta[1]){
            
            // SE AÑADE LA CUENTA CON TODOS LOS DATOS A LA LISTA DE CUENTAS QUE CORRESPONDA
            anadirCuenta(anfitrion, dni, nombre, email, clave, telefono, fechaRegistro);
            
            // INICIAR SESIÓN CON ESA CUENTA
            Login.login(email, clave);
        }
    }
    
    
    // AÑADIR LA CUENTA A LA "BASE DE DATOS"
    public static void anadirCuenta(boolean anfitrion, String dni, String nombre, String email, String clave, int telefono, LocalDate fechaRegistro){
        
        // SI ES UN ANFITRIÓN
        if (anfitrion){

            // CREAR UN NUEVO OBJETO TIPO ANFITRIÓN Y AÑADIRLO A LA LISTA (HAY QUE HACER UN TRY, POR SI FALTAN DATOS)
            Anfitrion nuevoAnfitrion = new Anfitrion(fechaRegistro, dni, nombre, email, clave, telefono);
            Login.anfitriones.add(nuevoAnfitrion);
        }
        
        // SI NO ES ANFITRIÓN ES QUE ES UN CLIENTE
        else{
            
            // CREAR UN NUEVO OBJETO TIPO CLIENTE Y AÑADIRLO A LA LISTA (AQUÍ IGUAL, HAY QUE HACER UN TRY POR SI FALTAN DATOS)
            Cliente nuevoCliente = new Cliente(dni, nombre, email, clave, telefono);
            Login.clientes.add(nuevoCliente);
        }
    }
}
