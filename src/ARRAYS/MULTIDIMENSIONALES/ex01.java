package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 20/01/16.
 */
public class ex01 {
    public static void main(String[] args) {

        int[][] array_01 = new int[5][5];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            for (int i=0; i < array_01.length; i++) {
                for (int j=0; j < array_01[i].length; j++) {
                    array_01[i][j]=5;
                }
            }

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
