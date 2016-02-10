package EXTRAS.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 4/02/16.
 */



public class Los_Vengadores_II {

    public static void main(String[] args) {

        int [][] array_01 = new int[4][5];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;

            while (opcio != 5) {
                System.out.println("");
                System.out.println("          LOS VENGADORES (segunda parte) ");
                System.out.println("-----------------------------------------");
                System.out.println("");
                System.out.println("1.- Registrar datos aleatorios           ");
                System.out.println("2.- Evaluar el mas superheroe            ");
                System.out.println("3.- Analizar misiones                    ");
                System.out.println("4.- Reponer habilidades                  ");
                System.out.println("5.- Salir                                ");
                System.out.println(" ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        //filas heroes
                        //Superheroes = Iron Man, Capitan America,Thor y Viuda Negra (4)
                        //Habilidades = 5 habilidades
                        System.out.println("REGISTRO DE DATOS");
                        System.out.println("-----------------");
                        String clave = "1234";
                        System.out.print("Introduzca la clave : ");
                        String secreto = (buffer.readLine());

                        if (secreto.equals(clave)) {
                            for (int i = 0; i < array_01.length; i++) {
                                 for (int j = 0; j < array_01[i].length; j++) {
                                     array_01[i][j] = (int) (Math.random()*10);
                                 }
                            }
                            System.out.print("");
                            System.out.println(" SITUACION ACTUAL ");
                            System.out.println("------------------");
                            for (int i = 0; i < array_01.length; i++) {
                                for (int j = 0; j < array_01[i].length; j++) {
                                    System.out.print(array_01[i][j]);
                                }
                                System.out.println("");
                            }
                        }
                        else {
                                System.out.print("NO ES PERSONA AUTORIZADA");
                            }
                        break;
                    case 2:
                        //filas heroes
                        //Superheroes = Iron Man, Capitan America,Thor y Viuda Negra (4)
                        //Habilidades = 5 habilidades
                        System.out.println("   EVALUACIONES   ");
                        System.out.println("------------------");


                     //una variable para cada heroe

                        Double [] heroe_01 = new Double[10];
                        Double [] heroe_02 = new Double[10];
                        Double [] heroe_03 = new Double[10];
                        Double [] heroe_04 = new Double[10];

                        for (int i = 0; i < array_01.length; i++) {
                            heroe_01[i] = array_01[i][0]*0.03 + array_01[i][1]*0.03 + array_01[i][2]*0.2 + array_01[i][3]*0.1 + array_01[i][4]*0.01;
                            heroe_02[i] = array_01[i][0]*0.03 + array_01[i][1]*0.03 + array_01[i][2]*0.2 + array_01[i][3]*0.1 + array_01[i][4]*0.01;
                        }


                        System.out.print(heroe_01);



                        System.out.println("Iron Man        = " + heroe_01);
                        System.out.println("Capitan America = " + heroe_02);
                        System.out.println("Thor            = " + heroe_03);
                        System.out.println("Viuda Negra     = " + heroe_04);
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("El mundo sigue a salvo con nosostros, aunque seamos menos");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 5");
                }
            }

        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
