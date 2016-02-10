package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 1/02/16.
 */
public class ex11 {

    public static void main(String[] args) {
        char[][] array_01 = new char[7][8];
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < array_01.length; i++) {
                for (int j = 0; j < array_01[i].length; j++) {
                    array_01[i][j] = '*';
                }
            }

            int opcio = 0;

            while (opcio != 2) {
                System.out.println("");
                System.out.println("    ENTRADAS DE CINE     ");
                System.out.println("-------------------------");
                System.out.println("");
                System.out.println("1.- Compra               ");
                System.out.println("                         ");
                System.out.println("2.- Salir                ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        int col = 0;
                        int fila = 0;
                        System.out.println(" Seleccione   ");
                        System.out.println("==============");
                        do {
                            System.out.print("fila : ");
                            fila = Integer.parseInt(buffer.readLine());
                        } while (fila < 0 && fila > 7);
                        do {
                            System.out.print("columna : ");
                            col = Integer.parseInt(buffer.readLine());
                        } while (col < 0 && col > 8);

                        if (array_01[fila][col] == 'o') {
                            System.out.print("");
                            System.out.print("La butaca no esta disponible");
                            System.out.print("");
                        } else {
                            array_01[fila][col] = 'o';
                        }
                        break;
                    case 2:
                        System.out.print("");
                        System.out.print("SALIMOS DE LA APLICACION");
                        System.out.print("");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 2");
                }

                    System.out.println("");
                    System.out.println("SITUACION DE LAS VENTAS");
                    System.out.println("-----------------------");
                    for (int i = 0; i < array_01.length; i++) {
                        for (int j = 0; j < array_01[i].length; j++) {
                            System.out.print(array_01[i][j]);
                        }
                        System.out.println("");
                    }
                }
        }

        catch(Exception e) {
            System.out.println("error: " + e);
        }
    }
}
