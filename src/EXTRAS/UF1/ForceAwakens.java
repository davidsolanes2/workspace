package EXTRAS.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by david on 18/01/16.
 */
public class ForceAwakens {

    public static void main(String[] args) {

        ArrayList<Integer> defensa_01 = new ArrayList<Integer>(); //LA RESISTENCIA;

        ArrayList<Integer> defensa_02 = new ArrayList<Integer>(); //EL IMPERIO

        ArrayList<Integer> actual_01 = new ArrayList<Integer>(); //ENERGIA DE LA RESISTENCIA

        ArrayList<Integer> actual_02 = new ArrayList<Integer>(); //ENERGIA DEL IMPERIO

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;

            while (opcio != 4) {
                System.out.println("");
                System.out.println("    LA RESISTENCIA Y EL IMPERIO    ");
                System.out.println("-----------------------------------");
                System.out.println("");
                System.out.println("1.- Asignar valores                     ");
                System.out.println("2.- Iniciar Batalla                     ");
                System.out.println("3.- Analisis de la batalla              ");
                System.out.println("4.- Salir                               ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        for(int a=0;a<10;a++) { //LA RESISTENCIA
                            int y = (int)(Math.random()*5);
                            defensa_01.add(a, y);
                        }
                        for(int b=0;b<10;b++) { //EL IMPERIO
                            int y = (int)(Math.random()*5);
                            defensa_02.add(b,y);
                        }
                        for(int c=0;c<10;c++) { //ENERGIA DE LA RESISTENCIA
                            int x = (int)(Math.random()*11);
                            actual_01.add(c, x);
                        }
                        for(int d=0;d<10;d++) { //ENERGIA DEL IMPERIO
                            int x = (int)(Math.random()*11);
                            actual_02.add(d,x);
                        }
                        System.out.println("Nivel de defensa de LA RESISTENCIA : " + defensa_01);
                        System.out.println("Nivel de energia de LA RESISTENCIA : " + actual_01);
                        System.out.println("Nivel de defensa DEL IMPERIO       : " + defensa_02);
                        System.out.println("Nivel de energia DEL IMPERIO       : " + actual_02);
                        break;
                    case 2:
                        for(int e=0;e<10;e++) { //ATAQUE
                            int z = (int) (Math.random() * 2);

                            if (z == 1) {
                                for (int f = 0; f < defensa_01.size(); f++) {
                                    int result_01=0, result_02=0;
                                    result_01 = actual_01.get(f) - defensa_02.get(f);
                                    if (result_01 > 1) {

                                      //  revisar nombre_arraylist.set
                                        // array_list.set(f,array_list.get(f)+result_01)
                                    }
                                }
                            }
                            else {
                                for (int g = 0; g < defensa_02.size(); g++) {
                                   // result_02 = actual_02.get(g) - defensa_01.get(g);
                                }
                            }
                        }
                        break;
                    case 3:


                        break;
                    case 4:
                        System.out.println("La RESISTENCIA NO SE RINDE JAMAAAASSSSS!!!!!!");
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
}
