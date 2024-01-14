package ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class UI {

    private Random r;
    private Scanner reader;
    private BufferedReader bf;

    public UI() {
        r = new Random();
        reader = new Scanner(System.in);
        bf = new BufferedReader(new InputStreamReader(System.in));
    }

    public void adivinar() {

        int numeroSecreto = r.nextInt(500) + 1;
        int cont = 0;
        System.out.println("--------------ADIVINA EL NÚMERO SECRETO--------------");
        System.out.println(numeroSecreto);
        do {
            try {
                System.out.print("Ingresa un número: ");
                //int numUsuario = reader.nextInt();
                int numUsuario = Integer.parseInt(bf.readLine());
                if (numUsuario == numeroSecreto) {
                    System.out.println("Adivinaste!");
                    break;
                } else if (numUsuario < numeroSecreto) {
                    System.out.println("El número es menor, vuelve a intentarlo");
                    System.out.println(" ");
                } else {
                    System.out.println("El número es mayor, vuelve a intentarlo");
                    System.out.println(" ");
                }
            } catch (InputMismatchException ime) {
                System.out.println("-----------------ERROR-----------------");
                System.out.println(ime);
                System.out.println("No ingresaste un número vuelve a intentarlo.");
                reader.next();
            } catch (IOException | NumberFormatException ioe) {
                System.out.println("-----------------ERROR-----------------");
                System.out.println(ioe);
                System.out.println("No ingresaste un número vuelve a intentarlo.");
                System.out.println(" ");
            }finally {
                cont++;
            }
        } while (true);

        System.out.println("La cantidad de intentos fue de: " + cont);
    }
}
