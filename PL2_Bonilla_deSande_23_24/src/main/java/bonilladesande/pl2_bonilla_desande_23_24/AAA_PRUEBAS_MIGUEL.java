package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class AAA_PRUEBAS_MIGUEL {

 
    public static void main(String[] args) {
                
        Cliente c1 = new Cliente("12345678w","Miguel","miguelsm255@outlook.es","holacaracola",669928305);
    
        LocalDate ahora = LocalDate.now();
        Anfitrion a1 = new Anfitrion(ahora, "78945612G", "Marcos", "hola", "fdsafdsa", 789654123);
        
        BaseDatos.clientes.add(c1);
        BaseDatos.anfitriones.add(a1);
        
        CrearCuenta.crearCuenta(false, "11", "pepe", "adios", "fdsafdsa", 0, ahora);
        
        
        
        
        //UserLoged resultado = Login.login("miguelsm255@outlook.es","holacaracola");
    }
    
}
