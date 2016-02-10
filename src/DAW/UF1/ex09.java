package DAW.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 28/11/15.
 */
public class ex09 {

    public static void main(String[] args) {

        int num_01 = 30;
        int cont_01 = 0, cont_02 = 0, cont_03 = 0, cont_04 = 0, cont_05 = 0;

        try{

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca una cadena : ");
            System.out.print("");
            String cadena_01Str = buffer.readLine();
            cadena_01Str = cadena_01Str.toLowerCase();

            char [] cadena_02 = cadena_01Str.toCharArray();

            for (int x=0;x<cadena_02.length;x++) {
                if (cadena_02[x]=='a') {
                    cont_01++;
                }
                else if (cadena_02[x]=='e') {
                    cont_02++;
                }
                else if (cadena_02[x]=='i') {
                    cont_03++;
                }
                else if (cadena_02[x]=='o') {
                    cont_04++;
                }
                else if (cadena_02[x]=='u') {
                    cont_05++;
                }
            }
            if (cont_01 != 0) {
                System.out.println("Hay " + cont_01 + " vocales 'a' ");
            }
            if (cont_02 != 0) {
                System.out.println("Hay " + cont_02 + " vocales 'e' ");
            }
            if (cont_03 != 0) {
                System.out.println("Hay " + cont_03 + " vocales 'i' ");
            }
            if (cont_04 != 0) {
                System.out.println("Hay " + cont_04 + " vocales 'o' ");
            }
            if (cont_05 != 0) {
                System.out.println("Hay " + cont_05 + " vocales 'u' ");
            }
        }

        catch (Exception e){
            System.out.println("error: " + e);
        }
    }
}
