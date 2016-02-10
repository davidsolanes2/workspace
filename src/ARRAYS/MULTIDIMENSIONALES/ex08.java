package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 25/01/16.
 */
public class ex08 {

    public static void main(String[] args) {

        int[][] array_01 = new int[5][5];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int a = 1;
            System.out.println(" DATOS DEL ARRAY ");
            for (int i=0; i < array_01.length; i++, a++) {
                System.out.print("Introduzca la fila " + a + " : ");
                for (int j=0; j < array_01[i].length; j++) {
                    array_01[i][j] = Integer.parseInt(buffer.readLine());
                }
            }

            int min = 0, max = 0;
            int i_min = -1 , j_min = -1;
            int i_max = -1 , j_max = -1;

            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    if (array_01[i][j] > min) {  //comparar la posicion con maximo
                        max = array_01[i][j];
                        i_max = i;
                        j_max = j;
                    }
                    if (array_01[i][j] < min) {
                        min = array_01[i][j];
                        i_min = i;
                        j_min = j;
                    }
                }
            }


            System.out.println(" LA NUEVA ARRAY ");
            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    if (i == i_max && j == j_max) {
                        array_01[i][j] = min;
                    }
                    if (i == i_min && j == j_min) {
                        array_01[i][j] = max;
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
