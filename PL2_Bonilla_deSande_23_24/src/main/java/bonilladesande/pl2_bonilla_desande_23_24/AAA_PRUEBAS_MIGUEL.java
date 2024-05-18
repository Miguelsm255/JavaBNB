package bonilladesande.pl2_bonilla_desande_23_24;

import java.time.LocalDate;

public class AAA_PRUEBAS_MIGUEL {

 
    public static void main(String[] args) {
                
        LocalDate ahora = LocalDate.now();
        long numero = 1234567890123456L;
        
        TarjetaCredito tarjeta = new TarjetaCredito("Miguel", numero, ahora, 123);
        Particular p1 = new Particular(false, tarjeta, "12345678w","Miguel","hola","hola",669928305);
    
        
        Anfitrion a1 = new Anfitrion(ahora, "78945612G", "Marcos", "hola", "fdsafdsa", 789654123);
        
        
        BaseDatos.particulares.add(p1);
        System.out.println(BaseDatos.particulares.get(0).getCorreo());
        System.out.println(BaseDatos.particulares.get(0).getClave());
        
        bonilladesande.pl2_bonilla_desande_23_24.GUI.Login ventanaLogin = new bonilladesande.pl2_bonilla_desande_23_24.GUI.Login();
        ventanaLogin.setVisible(true);
        

    }
    
}
