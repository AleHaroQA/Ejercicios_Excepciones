package ejercicio2;

import java.util.ArrayList;

public class ejercicio2 {

    public static void main(String[] args) {

        /*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
        generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
        de rango). */

        int numeros[] = new int[5];

        try {
            for (int i = 0; i < numeros.length+10; i++) {
                numeros[i] = i + 1;
                System.out.print("[" + numeros[i] + "]");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("");
            System.out.println(e.getMessage());
            System.out.println(e);
        }

    }
}
