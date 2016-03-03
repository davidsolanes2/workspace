package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 22/01/16.
 */
public class ex06 {

    public static void main(String[] args) {

        int[][] array_01 = new int[4][3];
        int[][] array_02 = new int[4][3];
        int[][] array_03 = new int[4][3];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int a = 1;
            System.out.println(" DATOS DEL PRIMER ARRAY ");
            for (int i=0; i < array_01.length; i++, a++) {
                System.out.print("Introduzca la fila " + a + " : ");
                for (int j=0; j < array_01[i].length; j++) {
                    array_01[i][j] = Integer.parseInt(buffer.readLine());
                }
            }
            System.out.println(" DATOS DEL SEGUNDO ARRAY ");
            for (int i=0; i < array_01.length; i++, a++) {
                System.out.print("Introduzca la fila " + a + " : ");
                for (int j=0; j < array_02[i].length; j++) {
                    array_02[i][j] = Integer.parseInt(buffer.readLine());
                }
            }
            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    array_03[i][j] =  array_01[i][j] + array_02[i][j];
                }
            }
            System.out.println(" LA NUEVA ARRAY ");
            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    System.out.print(array_03[i][j]);
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
