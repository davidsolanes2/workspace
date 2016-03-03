package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 22/01/16.
 */
public class ex07 {
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

            for (int i=0; i < array_01.length; i++) {

                for (int j=0; j < array_01[i].length; j++) {
                    int aux_01 = 0;
                    if (i==0 && j==0) {
                        aux_01 =  array_01[i][j];
                        array_01[i][j] = array_01[4][4];
                        array_01[4][4] = aux_01;
                    }
                    if(i==1 && j==1) {
                        aux_01 = array_01[i][j];
                        array_01[i][j] = array_01[3][3];
                        array_01[3][3] = aux_01;
                    }
                }
            }
            System.out.println(" LA NUEVA ARRAY ");
            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
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
