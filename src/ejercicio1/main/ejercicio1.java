package ejercicio1.main;

import ejercicio1.entities.Persona;
import ejercicio1.services.PersonaService;

public class ejercicio1 {

    public static void main(String[] args) {

        /*Inicializar un objeto de la clase Persona a null y tratar de invocar el método esMayorDeEdad() a través de ese
         objeto. Luego, englobe el código con una cláusula try-catch para probar la nueva excepción que debe ser controlada*/

        PersonaService ps = new PersonaService();
        Persona persona1 = null;
        Persona persona2 = null;

        try{
            int IMC1 = ps.calcularIMC(persona1);
            System.out.println(IMC1);
            boolean mayor2 = ps.esMayorDeEdad(persona2);
            System.out.println(mayor2);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
