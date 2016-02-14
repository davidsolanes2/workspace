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
            int[]array_01 = new int[5];
            int[]array_02 = new int[array_01.length];
            int num_01 = 5;
            int opcio = 0;
            while (opcio != 4) {
                opcio = menu();

                switch (opcio) {
                    case 1:
                        System.out.println(" MOSTRAR TIPOS MUERTE ");
                        System.out.println("======================");
                        array_01 = tipos_01();
                        //autollenado del array, con los tipos de muerte
                        for (int i = 0; i < array_01.length; i++) {
                            System.out.println(array_01[i]);
                        }
                        break;
                    case 2:
                        System.out.println("   CONTAR TIPOS   ");
                        System.out.println("==================");
                        array_02=tipos_02(array_01);

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

    public static int menu() throws IOException {

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


    public static int[]tipos_01 () {  //tener en cuenta poder hacer lo mismo solo con las letras
        int tipos_01[] = new int [5];
        for (int i=0; i<tipos_01.length; i++) {
            tipos_01[i] = (int)(Math.random()*3);  // Ataque enemigo = 0/A, Caida = 1/B, Bomba = 2/C
        }
        return tipos_01;
    }

    public static int[] tipos_02(int array_01[]) {
        int cont_01=0, cont_02=0, cont_03=0;
        int[]tipos_02= new int[5];

        for (int i=0; i<array_01.length; i++) {
            if(array_01[i]==0) {
                cont_01++;
            }
            else if(array_01[i]==1) {
                cont_02++;
            }
            else if(array_01[i]==2) {
                cont_03++;
            }
        }
        tipos_02[0]= cont_01;
        tipos_02[1]= cont_02;
        tipos_02[2]= cont_03;
        return tipos_02;
    }


}
