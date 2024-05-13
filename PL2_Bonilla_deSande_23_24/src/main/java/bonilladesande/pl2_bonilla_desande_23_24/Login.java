package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

public class Login {
    
    // "BASE DE DATOS" DE LOS CLIENTES Y INMUEBLES DISPONIBLES
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Anfitrion> anfitriones = new ArrayList<>();
    public static ArrayList<Inmueble> inmuebles;
    
    // POR DEFECTO ES -1, QUE SIGNIFICA QUE NO SE HA ENCONTRADO O NO EXISTE
    private static int tipoUsuario = -1;
    private static int posicionArrayList = -1;
    
    
    
    
    
    // FUNCIÓN PRINCIPAL
    public static UserLoged login(String email, String clave){

        comprobarUsuario(email, clave);
        UserLoged user = new UserLoged(tipoUsuario, posicionArrayList);
        
        if(tipoUsuario == 1){
            
            Cliente cliente = clientes.get(posicionArrayList);
            user.setDni(cliente.getDni());
            user.setNombre(cliente.getNombre());
            user.setTelefono(cliente.getTelefono());
            user.setCorreo(cliente.getCorreo());
            user.setClave(cliente.getClave());
        }
        
        if(tipoUsuario == 2){
            
            Anfitrion anfitrion = anfitriones.get(posicionArrayList);
            user.setDni(anfitrion.getDni());
            user.setNombre(anfitrion.getNombre());
            user.setTelefono(anfitrion.getTelefono());
            user.setCorreo(anfitrion.getCorreo());
            user.setClave(anfitrion.getClave());
        }
        
        return user;
        
    }
    
    
    
    
    
    
    
    
    public static boolean comprobarUsuario(String email, String clave){  
        
        int resultadoBusqueda[] = busquedaUsuario(email);
        tipoUsuario = resultadoBusqueda[0];
        posicionArrayList = resultadoBusqueda[1];
        
        
        // SI HA ENCONTRADO AL USUARIO
        if (tipoUsuario != -1 && posicionArrayList != -1){
            if (claveCorrecta(tipoUsuario, posicionArrayList, clave)){
                return true;
            }
            else{
                tipoUsuario = -1;
                posicionArrayList = -1;
                return false;
            }
        }
        else{                  
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    public static int[] busquedaUsuario(String email){
        
        int tipoUsuario = -1;
        int posicionArrayList = -1;
        
        // PRIMERO BUSCA SI ES UN CLIENTE, ITERANDO LA LISTA DE CLIENTES
        for (int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            
            // SI ES UN CLIENTE:
            if (email == cliente.getCorreo()){
                
                // TIPO USUARIO ES 1 (TIPO CLIENTE) Y GUARDA LA POSICIÓN EN EL ARRAYLIST DE ESE CLIENTE
                tipoUsuario = 1;
                posicionArrayList = i;
                break;
            }
        }
        
        // SI NO ES CLIENTE BUSCA SI ESTÁ EN LA LISTA DE ANFITIRONES
        for (int i = 0; i < anfitriones.size(); i++){
            Anfitrion anfitrion = anfitriones.get(i);
            
            // SI ES ANFITRIÓN:
            if (email == anfitrion.getCorreo()){
                
                // TIPO DE USUARIO ES 2 (TIPO ANFITRIÓN) Y GUARDA LA POSICIÓN EN EL ARRAYLIST DE ESE ANFITRIÓN
                tipoUsuario = 2;
                posicionArrayList = i;
                break;
            }
        }
        
        // GUARDA EL RESULADO DE LA BÚSQUEDA EN UN ARRAY Y LO DEVUELVE PARA SER TRATADO DESPUÉS
        int resultado[] = {tipoUsuario, posicionArrayList};
        return resultado;
    }
    
    
    // COMPROBAR SI LA CLAVE ES CORRECTA
    public static boolean claveCorrecta(int tipoUsuario, int posicionArrayList, String clave){
        
        boolean esCorrecta = false;
        
        // SI ES UN USUARIO BUSCAR EN EL ARRAYLIST DE USUARIOS
        if(tipoUsuario == 1){
            Cliente cliente = clientes.get(posicionArrayList);
            if (clave == cliente.getClave()){
                esCorrecta = true;
            }
        }
        
        // SI ES UN ANFITRIÓN BUSCAR EN EL ARRAYLIST DE ANFITRIONES
        if(tipoUsuario == 2){
            Anfitrion anfitrion = anfitriones.get(posicionArrayList);
            if (clave == anfitrion.getClave()){
                esCorrecta = true;
            }
        }
        return esCorrecta;
    }
}
