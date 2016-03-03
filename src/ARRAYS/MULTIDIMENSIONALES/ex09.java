package ARRAYS.MULTIDIMENSIONALES;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 26/01/16.
 */
public class ex09 {
    public static void main(String[] args) {
        int[][] array_01 = new int[3][3];
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;
            while (opcio != 4) {
                System.out.println("");
                System.out.println("    JUEGO DE LAS TRES PUERTAS     ");
                System.out.println("----------------------------------");
                System.out.println("");
                System.out.println("1.- Nivel FACIL                   ");
                System.out.println("2.- Nivel MEDIO                   ");
                System.out.println("3.- Nivel AVANZADO                ");
                System.out.println("4.- Salir                         ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");

                opcio = Integer.parseInt(buffer.readLine());

                // si la puerta tiene un 1 con random la puerta sera correcta

                switch (opcio) {
                    case 1:
                        int selec_01 = 0;
                        while(selec_01 != 3 && opcio==1) {
                            System.out.print("");
                            System.out.println("NIVEL I");
                            System.out.print("");
                            System.out.println("-------------");
                            System.out.println("|   |   |   |");
                            System.out.println("| 1 | 2 | 3 |");
                            System.out.println("|   |   |   |");
                            System.out.println("-------------");
                            System.out.print("Seleccione una puerta : ");
                            selec_01 = Integer.parseInt(buffer.readLine());

                            for (int i=0; i<array_01.length;i++) {
                                for (int j=0; j<array_01[i].length; j++) {
                                    array_01[i][j] = (int) (Math.random()*2);
                                }
                            }


                            for (int i=0; i < array_01.length; i++) {
                                for (int j=0; j < array_01[i].length; j++) {
                                    if (selec_01==1 && i==0) {
                                        if (j == 0) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                System.out.print("");
                                                opcio=2;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                    if (selec_01==2 && i==1){
                                        if (j==1) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                opcio=2;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                    if (selec_01==3 && i==2){
                                        if (j==2) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                opcio=2;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        int selec_02 = 0;
                        while (selec_02 != 3 && opcio==2) {
                            System.out.print("");
                            System.out.println("NIVEL II");
                            System.out.print("");
                            System.out.println("-------------");
                            System.out.println("|   |   |   |");
                            System.out.println("| 1 | 2 | 3 |");
                            System.out.println("|   |   |   |");
                            System.out.println("-------------");
                            System.out.print("Seleccione una puerta : ");
                            selec_02 = Integer.parseInt(buffer.readLine());

                            for (int i=0; i<array_01.length;i++) {
                                for (int j=0; j<array_01[i].length; j++) {
                                    array_01[i][j] = (int) (Math.random()*2);
                                }
                            }


                            for (int i=0; i < array_01.length; i++) {
                                for (int j=0; j < array_01[i].length; j++) {
                                    if (selec_02==1 && i==0) {
                                        if (j == 0) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                System.out.print("");
                                                opcio=3;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                    if (selec_02==2 && i==1){
                                        if (j==1) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                opcio=3;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                    if (selec_02==3 && i==2){
                                        if (j==2) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                opcio=3;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        int selec_03 = 0;  //arreglar el nivel tres tener en cuenta que si no gana empezara en el nivel I y tiene 7 intentos para llegar al final
                        while (selec_03 != 3 && opcio==3) {
                            System.out.print("");
                            System.out.println("NIVEL III");
                            System.out.print("");
                            System.out.println("-------------");
                            System.out.println("|   |   |   |");
                            System.out.println("| 1 | 2 | 3 |");
                            System.out.println("|   |   |   |");
                            System.out.println("-------------");
                            System.out.print("Seleccione una puerta : ");
                            selec_03 = Integer.parseInt(buffer.readLine());

                            for (int i=0; i<array_01.length;i++) {
                                for (int j=0; j<array_01[i].length; j++) {
                                    array_01[i][j] = (int) (Math.random()*2);
                                }
                            }


                            for (int i=0; i < array_01.length; i++) {
                                for (int j=0; j < array_01[i].length; j++) {
                                    if (selec_03==1 && i==0) {
                                        if (j == 0) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                System.out.print("");
                                                opcio=0;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                    if (selec_03==2 && i==1){
                                        if (j==1) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                opcio=0;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                    if (selec_03==3 && i==2){
                                        if (j==2) {
                                            if (array_01[i][j] == 1) {
                                                System.out.println("AVANZA AL SIGUIENTE NIVEL");
                                                opcio=0;
                                                break;
                                            }
                                            else {
                                                System.out.println("LO SENTIMOS, VUELVE A EMPEZAR");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Animo MACHOTE");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 4");
                }
            }

        }

        catch(Exception e) {
            System.out.println("error: " + e);
        }
    }
}
