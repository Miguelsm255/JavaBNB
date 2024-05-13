package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class CrearCuenta {
    
    public static boolean crearCuenta(boolean anfitrion, String dni, String nombre, String email, String clave, int telefono, LocalDate fechaRegistro){
        
        int noCuenta[] = {-1, -1};
        int resultadoBusqueda[] = Login.busquedaUsuario(email);
        
        System.out.println(noCuenta[0]);
        System.out.println(noCuenta[1]);
        System.out.println(resultadoBusqueda[0]);
        System.out.println(resultadoBusqueda[1]);
        
        
        if (resultadoBusqueda[0] == noCuenta[0] && resultadoBusqueda[1] == noCuenta[1]){
            System.out.println("No existe una cuenta con ese correo");
            anadirCuenta(anfitrion, dni, nombre, email, clave, telefono, fechaRegistro);
            
            Login.login(email, clave);
        }
        
        
        return true;
    }
    
    public static boolean anadirCuenta(boolean anfitrion, String dni, String nombre, String email, String clave, int telefono, LocalDate fechaRegistro){
        
        if (anfitrion){

            // HAY QUE HACER UN TRY, POR SI FALTAN DATOS
            Anfitrion nuevoAnfitrion = new Anfitrion(fechaRegistro, dni, nombre, email, clave, telefono);
            Login.anfitriones.add(nuevoAnfitrion);
        }
        else{
            
            // AQUÍ IGUAL, HAY QUE HACER UN TRY POR SI FALTAN DATOS
            Cliente nuevoCliente = new Cliente(dni, nombre, email, clave, telefono);
            Login.clientes.add(nuevoCliente);
        }
        return true;
    }
}
