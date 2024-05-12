package bonilladesande.pl2_bonilla_desande_23_24;

import java.util.ArrayList;

public class Login {
    
    // "BASE DE DATOS" DE LOS CLIENTES Y INMUEBLES DISPONIBLES
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Anfitrion> anfitriones = new ArrayList<>();
    public static ArrayList<Inmueble> inmuebles;
    
    
    
    // FUNCIÓN PRINCIPAL
    
    //public static void login(String email, String clave){
        
    //}
    
    public static boolean login(String email, String clave){  //ESTA FUNCIÓN SE LLAMARÁ "COMPROBAR USUARIO"

        int tipoUsuario = -1;
        int posicionArrayList = -1;
        
        // SI ES CLIENTE
        for (int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            if (email == cliente.getCorreo()){
                tipoUsuario = 1;
                posicionArrayList = i;
                break;
            }
        }
        
        // SI ES ANFITRIÓN
        for (int i = 0; i < anfitriones.size(); i++){
            Anfitrion anfitrion = anfitriones.get(i);
            if (email == anfitrion.getCorreo()){
                tipoUsuario = 2;
                posicionArrayList = i;
                break;
            }
        }
        
        // SI HA ENCONTRADO AL USUARIO
        if (tipoUsuario != -1 && posicionArrayList != -1){
            if (claveCorrecta(tipoUsuario, posicionArrayList, clave)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
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
    
    public static Cliente returnUser(Cliente cliente){
        System.out.println("hola");
        return null;
    }
    
    public static Anfitrion returnUser(Anfitrion anfitrion){
        System.out.println("hola");
        return null;
    }
        
    public static Administrador returnUser(Administrador administrador){
        System.out.println("hola");
        return null;
    }

}
