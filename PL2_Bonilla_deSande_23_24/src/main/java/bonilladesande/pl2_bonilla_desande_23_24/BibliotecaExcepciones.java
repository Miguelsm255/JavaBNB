/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bonilladesande.pl2_bonilla_desande_23_24;


public class BibliotecaExcepciones {
    
    //EXCEPCIÓN CREADA PARA CUANDO EL TELÉFONO NO TUVIERA 9 DÍGITOS.
    public static class TelefonoEscacharrado extends Exception {

        public TelefonoEscacharrado(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA CUANDO ALGUIEN INTENTARA UTILIZAR UN CORREO YA EXISTENTE
    public static class CorreoRepetido extends Exception {

        public CorreoRepetido(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA LOS CASOS EN LOS QUE EXISTE UNA "FECHA IMPOSIBLE" POR SER MENOR QUE LA ACTUAL.
    public static class FechaMenor extends Exception {

        public FechaMenor(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA LOS CASOS EN LOS QUE LA FECHA DE FIN DE RESERVA ES MENOR QUE LA DE INICIO.
    public static class FechaFinMenorInicio extends Exception {

        public FechaFinMenorInicio(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA LOS CASOS EN LOS QUE EL INMUEBLE YA ESTÉ RESERVADO EN LAS FECHAS SELECCIONADAS.
    public static class InmuebleOcupado extends Exception {
        
        public InmuebleOcupado(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA LOS CASOS EN LOS QUE SE INTENTA RESERVAR UN INMUEBLE QUE YA ESTÁ RESERVADO DURANTE UNA FECHA CONCRETA.
    public static class InmuebleYaReservado extends Exception {

        public InmuebleYaReservado(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA CUANDO EL CVV NO TENGA TRES DÍGITOS JUSTOS.
    public static class cvvEscacharrado extends Exception {

        public cvvEscacharrado(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA CUANDO LA TARJETA NO TENGA 16 DÍGITOS JUSTOS.
    public static class TarjetaEscacharrada extends Exception {

        public TarjetaEscacharrada(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA CUANDO LOS TEXTFIELDS SE DEJEN VACÍOS.
    public static class CamposVacios extends Exception {

        public CamposVacios(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA LOS DOS BOTONES (CASA Y APARTAMENTO) ESTÉN SIN SELECCIONAR. 
    public static class BotonesSinSeleccionar extends Exception {

        public BotonesSinSeleccionar(String message) {
            super(message);
        }
    }
    //EXCEPCIÓN CREADA PARA REGULAR QUE LA TARJETA DE CRÉDITO NO TENGA UNA FECHA DE CADUCIDAD MENOR A LA ACTUAL.
    public static class TarjetaCaducada extends Exception {

        public TarjetaCaducada(String message) {
            super(message);
        }
    }
    
    //EXCEPCIÓN CREADA PARA ASEGURAR QUE LOS EMAILS SEAN UNA CADENA DE TEXTO + "@gmail.com".
    public static class EmailSinEmail extends Exception {

        public EmailSinEmail(String el_email_introducido_no_es_válido) {
        }
    }
    //EXCEPCIÓN CREADA PARA CUANDO EL CÓDIGO POSTAL NO TENGA 5 DÍGITOS JUSTOS.
    public static class PostalEscacharrado extends Exception {

        public PostalEscacharrado(String el_código_postal_debe_de_contener_exactam) {
        }
    }

}
