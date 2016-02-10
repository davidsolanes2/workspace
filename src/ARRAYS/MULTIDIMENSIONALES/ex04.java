package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 21/01/16.
 */
public class ex04 {
    public static void main(String[] args) {

        String [][] array_01 = new String[5][5];

        // la diferencia de i entre j nos dara el valor a imprimir '+' o '-'

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("EL CONTENIDO DEL ARRAY ES :");
            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    if (i - j < 0) {
                        array_01[i][j] = "+";
                    }
                    if (i - j > 0) {
                        array_01[i][j] = "-";
                    }
                    if (i - j == 0) {
                        array_01[i][j] = "0";
                    }
                    System.out.print(array_01[i][j]);
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
