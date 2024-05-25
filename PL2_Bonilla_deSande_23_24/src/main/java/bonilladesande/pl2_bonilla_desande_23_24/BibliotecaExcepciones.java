/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;

/**
 *
 * @author marco
 */
public class BibliotecaExcepciones {
    
    public static class TelefonoEscacharrado extends Exception {

        public TelefonoEscacharrado(String message) {
            super(message);
        }
    }
    
    public static class cvvEscacharrado extends Exception {

        public cvvEscacharrado(String message) {
            super(message);
        }
    }
    
    public static class CamposVacios extends Exception {

        public CamposVacios(String message) {
            super(message);
        }
    }
    
    public static class BotonesSinSeleccionar extends Exception {

        public BotonesSinSeleccionar(String message) {
            super(message);
        }
    }
    
    public static class TarjetaCaducada extends Exception {

        public TarjetaCaducada(String message) {
            super(message);
        }
    }
}






