package DAW.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created by david on 15/12/15.
 */
public class ex13 {

    public static void main(String[] args) {

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;
            int x = 0, a = 48;

            while (opcio != 4) {
                System.out.println("");
                System.out.println("    CALCULO DE CODIGO DE BARRAS     ");
                System.out.println("------------------------------------");
                System.out.println("");
                System.out.println("1.- Introducir codigo");
                System.out.println("2.-  ");
                System.out.println("3.-  ");
                System.out.println("4.- Finalizar el programa           ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        System.out.print("Codigo : ");
                        String cadena_01 = buffer.readLine();

                        System.out.println("Procediendo a Validar el Codigo");

                        int zero=0, i=0, j;
                        int cont_02 = 0, cont_03 = 0;
                        int tot_01 = 0, result_01 = 0, result_02;
                        int n = cadena_01.length();
                        int valor = cadena_01.charAt(n-1) - a;  //ultimo valor de la cadena

                           for(j=0;j<cadena_01.length()-1;j++) {
                              if (j%2 != 0) {
                                 char cadena_02 = cadena_01.charAt(j);  //detecta las posiciones impares
                                 cont_02 = (int)cadena_02 + cont_02 - a;
                               }
                               else {
                                 char cadena_03 = cadena_01.charAt(j); //detecta las posiciones pares
                                 cont_03 = (int)cadena_03 + cont_03 - a;
                               }
                            }
                            tot_01 = (cont_02 * 3) + (cont_03);
                            result_01 = tot_01 % 10;
                            result_02 = 10 - result_01;
                            if (result_02 == (valor)) {
                               System.out.println("El Codigo SI es correcto");
                                if (n>8) {
                                    System.out.print("Es un EAN-13");
                                }
                                else {
                                    System.out.print("Es un EAN-8");
                                }
                            }
                            else {
                               System.out.println("El Codigo NO es correcto");
                            }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Cerrando el proceso");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 3");
                }
            }

        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
