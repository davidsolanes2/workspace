package EXTRAS.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 14/12/15.
 */
public class DawOfJustice {

    public static void main(String[] args) {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            int opcio = 0;

            while (opcio != 6) {
                System.out.println("");
                System.out.println("         DAW OF JUSTICE I           ");
                System.out.println("------------------------------------");
                System.out.println("");
                System.out.println("1.- Registrar nueva batalla          ");
                System.out.println("2.- Intentar reconciliacion          ");
                System.out.println("3.- Entrenar inteligencia            ");
                System.out.println("4.- Retar inteligencia               ");
                System.out.println("5.- Ver superhéroe campeón           ");
                System.out.println("6.- Salir                            ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        System.out.print("¿Cuantas batallas quieres registrar?  ");
                        System.out.print("");
                        String batallaStr = buffer.readLine();
                        int batalla_01 = Integer.parseInt(batallaStr);
                        int cont_01 = 0, cont_02 = 0;
                        int a = 0, x = 0;
                        int result_01 = 0, result_02 = 0;

                        for (x=0;x<batalla_01;x++)  {
                            for (a=0;a<2;a++) {
                                System.out.print("Resultado contrincante " + (a+1) + " batalla " + (x+1) + " : ");
                                String resultStr = buffer.readLine();
                                if (a==1) {
                                    result_01 = Integer.parseInt(resultStr);
                                }
                                else {
                                    result_02 = Integer.parseInt(resultStr);
                                }
                            }
                        }

                        if (result_01>result_02) {
                            cont_01++;
                        }
                        else {
                            cont_02++;
                        }
                        System.out.println("");
                        System.out.println("Puntos de Superman : " + cont_01);
                        System.out.println("Puntos de Batman   : " + cont_02);
                        break;
                    case 2:
                        /*int y=0, z=0;
                        System.out.println("Introducir tres numeros entre 1 y 20");
                        int[] tabla_01 = new int[3];
                        int[] tabla_02 = new int[3];

                        for (y=0;y<3;y++) {
                            System.out.println("Superman");
                            String superStr = buffer.readLine();
                            tabla_01[y] = Integer.parseInt(superStr);
                        }
                        for (z=0;z<3;z++) {
                            System.out.println("Batman");
                            String superStr = buffer.readLine();
                            tabla_02[z] = Integer.parseInt(superStr);
                        }
                        if (tabla_01[y] == tabla_02[z]) {
                            System.out.println("Los Superheroes SI han hecho las paces");
                        }
                        else {
                            System.out.println("Los Superheroes NO han hecho las paces");
                        }*/
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        System.out.println("Siempre es mejor hablar las cosas");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 6");
                }
            }
        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
