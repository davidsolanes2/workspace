package DAW.UF2.FUNCIONES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by david on 10/02/16.
 */
public class ex05 {

    public static void main(String[] args) {

        try {
            int[]array_02 = new int[5];
            int num_01 = 5;
            int opcio = 0;
            while (opcio != 4) {
                opcio = menu();

                switch (opcio) {
                    case 1:
                        System.out.println(" MOSTRAR TIPOS MUERTE ");
                        System.out.println("======================");
                        array_02=tipos_01();
                        imprimir(array_02);

                        break;
                    case 2:
                        System.out.println("   CONTAR TIPOS   ");
                        System.out.println("==================");
                        array_02=estadistica(array_02);

                        for (int i = 0; i<1; i++) {
                            if (array_02[0]!=0) {
                                System.out.println("Hay " + array_02[0] + " muertes por Ataque Enemigo");
                            }
                            if (array_02[1]!=0) {
                                System.out.println("Hay " + array_02[1] + " muertes por Caida");
                            }
                            if (array_02[2]!=0) {
                                System.out.println("Hay " + array_02[2] + " muertes por Bomba");
                            }
                        }
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("  REINICIAR ARRAY  ");
                        System.out.println("===================");
                        array_02=tipos_02();
                        break;
                    case 4:
                        System.out.println("Cerrando el sistema");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 4");
                }
            }

        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    public static int menu() throws IOException {        //menu

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int opcio = 0;

            System.out.println("");
            System.out.println("  ESTADISTICA DEL VIDEOJUEGO  ");
            System.out.println("------------------------------");
            System.out.println("");
            System.out.println("1.- Mostrar muerte    ");
            System.out.println("2.- Estadistica de forma de muerte");
            System.out.println("3.- Reiniciar         ");
            System.out.println("4.- Salir             ");
            System.out.println(" ");
            System.out.println("");
            System.out.print("Seleccione una opcion : ");
            opcio = Integer.parseInt(buffer.readLine());

        return opcio;
    }


    public static int[]tipos_01 () {                  //autollenado del array con numeros, de los tipos de muerte
        int tipos_02[] = new int [5];
        for (int i=0; i<tipos_02.length; i++) {
            tipos_02[i] = (int)(Math.random()*3);  //Ataque enemigo = 0/A, Caida = 1/B, Bomba = 2/C
        }
        return tipos_02;
    }

    public static void imprimir (int tipos_01[]) {
        for (int i = 0; i < tipos_01.length; i++) {
            System.out.println(tipos_01[i]);
        }
    }

    public static int[]estadistica(int[]tipos_03) {  //estadistica de muertes
        int cont_01=0, cont_02=0, cont_03=0;

        for (int i=0; i<tipos_03.length; i++) {
            if(tipos_03[i]==0) {
                cont_01++;
            }
            else if(tipos_03[i]==1) {
                cont_02++;
            }
            else if(tipos_03[i]==2) {
                cont_03++;
            }
        }
        tipos_03[0]= cont_01;
        tipos_03[1]= cont_02;
        tipos_03[2]= cont_03;
        return tipos_03;
    }

    public static int[]tipos_02 () {                  //autollenado del array con numeros, de los tipos de muerte
        int tipos_02[] = new int [5];
        for (int i=0; i<tipos_02.length; i++) {
            tipos_02[i] = (int)(Math.random()*3);  //Ataque enemigo = 0/A, Caida = 1/B, Bomba = 2/C
        }
        return tipos_02;
    }
}
