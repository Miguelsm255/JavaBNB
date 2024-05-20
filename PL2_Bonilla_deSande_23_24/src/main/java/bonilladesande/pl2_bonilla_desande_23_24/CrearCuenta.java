package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class CrearCuenta {
    
    public static UserLoged crearCuenta(boolean anfitrion, String dni, String nombre, String email, String clave, int telefono, LocalDate fechaRegistro, TarjetaCredito tarjeta, boolean vip){
        
        
        // COMPROBAR SI LA CUENTA EXISTE
        
        // -1 -1 SIGNIFICA QUE NO EXISTE
        int noCuenta[] = {-1, -1};
        
        // HACE LA BÚSQUEDA Y GUARDA EL RESULTADO
        int resultadoBusqueda[] = Login.busquedaUsuario(email);
        
        // SI SON IGUALES QUIERE DECIR QUE NO EXISTE UNA CUENTA CON ESE CORREO
        if (resultadoBusqueda[0] == noCuenta[0] && resultadoBusqueda[1] == noCuenta[1]){
            
            // SE AÑADE LA CUENTA CON TODOS LOS DATOS A LA LISTA DE CUENTAS QUE CORRESPONDA
            anadirCuenta(anfitrion, dni, nombre, email, clave, telefono, fechaRegistro, tarjeta, vip);
            return Login.login(email, clave);
        }
        // SI NO SON IGUALES SÍ QUE EXISTE LA CUENTA
        else{
            // DEVOLVER UN USERLOGED VACÍO
            UserLoged noUser = new UserLoged(-1, -1);
            return noUser;
        }
        
    }
    
    
    // AÑADIR LA CUENTA A LA "BASE DE DATOS"
    public static void anadirCuenta(boolean anfitrion, String dni, String nombre, String email, String clave, int telefono, LocalDate fechaRegistro, TarjetaCredito tarjeta, boolean vip){
        
        // SI ES UN ANFITRIÓN
        if (anfitrion){

            // CREAR UN NUEVO OBJETO TIPO ANFITRIÓN Y AÑADIRLO A LA LISTA (HAY QUE HACER UN TRY, POR SI FALTAN DATOS)
            Anfitrion nuevoAnfitrion = new Anfitrion(fechaRegistro, dni, nombre, email, clave, telefono);
            BaseDatos.anfitriones.add(nuevoAnfitrion);
        }
        
        // SI NO ES ANFITRIÓN ES QUE ES UN PARTICULAR
        else{
            
            // CREAR UN NUEVO OBJETO TIPO PARTICULAR Y AÑADIRLO A LA LISTA (AQUÍ IGUAL, HAY QUE HACER UN TRY POR SI FALTAN DATOS)
            Particular nuevoParticular = new Particular(vip, tarjeta, dni, nombre, email, clave, telefono);
            BaseDatos.particulares.add(nuevoParticular);
        }
    }
}
