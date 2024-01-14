package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {

    /*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
    números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
    para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
    una división con los dos numeros y mostrar el resultado.
    Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
    causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
    no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
    número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
    utilizando bloques try/catch para las distintas excepciones */

    private Scanner reader;
    private BufferedReader bf;

    public UI() {
        reader = new Scanner(System.in);
        bf = new BufferedReader(new InputStreamReader(System.in));
    }

    public void play(){

        try {

            int num1 = devolverNum(pedirString());
            int num2 = devolverNum(pedirString());

            System.out.println(division(num1,num2));

        }catch (IOException | NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Error al formatear");
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }

    }

    private String pedirString() throws IOException {
        System.out.println("Ingrese número: ");
        String numString = bf.readLine();
        return numString;
    }

    private int devolverNum(String numString){

        return Integer.parseInt(numString);
    }

    private double division(int num1, int num2){

        return num1/num2;
    }



}
