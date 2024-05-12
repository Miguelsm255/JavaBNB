package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class AAA_PRUEBAS_MIGUEL {

 
    public static void main(String[] args) {
                
        Cliente c1 = new Cliente("12345678w","Miguel","miguelsm255@outlook.es","holacaracola",669928305);
    
        LocalDate ahora = LocalDate.now();
        Anfitrion a1 = new Anfitrion(ahora, false, "12365478W", "Marcos", "fdsa@fdas", "fdsafdsa", 789654123);
        
        Login.clientes.add(c1);
        Login.anfitriones.add(a1);
        
        
        boolean resultado = Login.login("fdsa@fdas","fdsafdsa");
        System.out.println(resultado);
    }
    
}
