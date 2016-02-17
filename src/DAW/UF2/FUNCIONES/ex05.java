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
            int[]result={0,0,0};
            int[]array_aux=new int[5];
            int opcio = 0;
            array_aux=tipos_01();
            while (opcio != 4) {
                opcio = menu();


                switch (opcio) {
                    case 1:
                        System.out.println(" MOSTRAR TIPOS MUERTE ");
                        System.out.println("======================");
                        imprimir(array_aux);

                        break;
                    case 2:
                        System.out.println("   CONTAR TIPOS   ");
                        System.out.println("==================");
                        control(array_aux, result);

                            if (result[0]!=0) {
                                System.out.println("Hay " + result[0] + " muertes por Ataque Enemigo");
                            }
                            if (result[1]!=0) {
                                System.out.println("Hay " + result[1] + " muertes por Caida");
                            }
                            if (result[2]!=0) {
                                System.out.println("Hay " + result[2] + " muertes por Bomba");
                            }

                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("  REINICIAR ARRAY  ");
                        System.out.println("===================");
                        for (int i=0;i<array_aux.length; i++) {
                            array_aux[i]=0;
                        }
                        for (int j=0;j<result.length; j++) {
                            result[j]=0;
                        }
                        array_aux=tipos_01();
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


    public static int[]tipos_01() {                  //autollenado del array con numeros, de los tipos de muerte
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

    public static int[] control(int[]tipos_03, int result[]) {  //estadistica de muertes
        int cont_01=0, cont_02=0, cont_03=0;
        //int[]tipos_03=new int[5];
        for (int i=0; i<tipos_03.length; i++) {
            if(tipos_03[i]==0) {
                result[0]++;
            }
            else if(tipos_03[i]==1) {
                result[1]++;
            }
            else if(tipos_03[i]==2) {
                result[2]++;
            }
        }
        return result;
    }

}
