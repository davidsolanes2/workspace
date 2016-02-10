package FUNCIONES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 10/02/16.
 */
public class ex05 {
    public static void main(String[] args) {

        //int [][] array_01 = new int[4][5];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;
            int num_01 = 5;
            while (opcio != 4) {
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

                int [] array_01 = new int [4];
                array_01 = tipos_01(num_01);


                switch (opcio) {
                    case 1:
                        System.out.println(" MOSTRAR TIPOS MUERTE ");
                        System.out.println("======================");

                        System.out.println("Los tipos de muerte son " + array_01);
                        break;
                    case 2:
                        System.out.println("   CONTAR TIPOS   ");
                        System.out.println("==================");

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



    public static int[] tipos_01 (int x) {
        int [] array_01 = new int [4];
        for (int i=0; i<=array_01.length; i++) {
            array_01[i] = (int)(Math.random()*3);  // Ataque enemigo = 0, Caida = 1, Bomba = 2
        }
        return array_01;
    }
    public static int factor (int x){
        int fact=1;
        for (int i=1; i<=x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
