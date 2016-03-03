package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 22/01/16.
 */
public class ex05 {

    public static void main(String[] args) {

        int[][] array_01 = new int[4][3];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int a = 1;
            for (int i=0; i < array_01.length; i++, a++) {
                System.out.print("Introduzca la fila " + a + " : ");
                for (int j=0; j < array_01[i].length; j++) {
                    array_01[i][j] = Integer.parseInt(buffer.readLine());
                }
            }
            System.out.println("EL CONTENIDO DEL ARRAY ES :");
            int tot_01 = 0;
            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    tot_01 = tot_01 + array_01[i][j];
                }
            }
            System.out.print(tot_01);
        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
