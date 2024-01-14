package ejercicio1.services;

import ejercicio1.entities.Persona;

import java.util.Scanner;

public class PersonaService {

    /*
      Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    O. Si no es correcto se deberá mostrar un mensaje
     */

    //Scanner reader = new Scanner(System.in);
   Scanner reader = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre:");
        String nombre = reader.next();
        System.out.println("Ingrese su edad:");
        int edad = reader.nextInt();
        System.out.println("Ingrese peso:");
        double peso = reader.nextDouble();
        System.out.println("Ingrese altura:");
        double altura = reader.nextDouble();

        char genero;
        do {
            System.out.println("Ingrese genero(H,M o O): ");
            genero = reader.next().charAt(0);
        } while (genero != 'H' && genero != 'M' && genero != 'O');

        return new Persona(nombre, edad, genero, altura, peso);
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1.
     */

    public int calcularIMC(Persona p1) throws NullPointerException {

        if (p1 == null) {
            throw new NullPointerException("No se puede calcular IMC porque Persona es null");
        } else {
            double IMC = p1.getPeso() / (p1.getAltura() * p1.getAltura());

            if (IMC < 20) {
                return -1;
            } else if (IMC >= 20 && IMC <= 25) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano.
     */

    public boolean esMayorDeEdad(Persona p1) throws NullPointerException {

        if (p1 == null) {
            throw new NullPointerException("No se puede definir edad porque Persona es null");
        } else {
            if (p1.getEdad() < 18) {
                return false;
            } else {
                return true;
            }
        }
    }
}
