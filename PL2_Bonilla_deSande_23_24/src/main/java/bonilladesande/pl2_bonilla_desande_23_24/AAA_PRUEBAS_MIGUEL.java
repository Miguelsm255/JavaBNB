package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;
import java.util.Scanner;

public class AAA_PRUEBAS_MIGUEL {

 
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        Cliente c1 = new Cliente("12345678w","Miguel","hola","hola",669928305);
    
        LocalDate ahora = LocalDate.now();
        Anfitrion a1 = new Anfitrion(ahora, "78945612G", "Marcos", "hola", "fdsafdsa", 789654123);
        
        //Login.clientes.add(c1);
        //Login.anfitriones.add(a1);
        
        //CrearCuenta.crearCuenta(false, "11", "pepe", "adios", "fdsafdsa", 0, ahora);
        
        BaseDatos.clientes.add(c1);
        System.out.println(BaseDatos.clientes.get(0).getCorreo());
        System.out.println(BaseDatos.clientes.get(0).getClave());
        
        //bonilladesande.pl2_bonilla_desande_23_24.GUI.Login ventanaLogin = new bonilladesande.pl2_bonilla_desande_23_24.GUI.Login();
        //ventanaLogin.setVisible(true);
        
        String correo = scanner.nextLine();
        String clave = scanner.nextLine();
        
        char[] correoChar = correo.toCharArray();
        
        System.out.println(correoChar.length);
        
        
        Login.login(correo, clave );
        
        //UserLoged resultado = Login.login("miguelsm255@outlook.es","holacaracola");
    }
    
}
