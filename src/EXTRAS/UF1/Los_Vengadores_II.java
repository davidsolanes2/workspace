package EXTRAS.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 * Created by david on 4/02/16.
 */



public class Los_Vengadores_II {

    public static void main(String[] args) {

        int [][] array_01 = new int[4][5];

        ArrayList<Double> heroe_01 = new ArrayList<Double>();  //un array para cada heroe para controlar su evaluacion
        ArrayList<Double> heroe_02 = new ArrayList<Double>();
        ArrayList<Double> heroe_03 = new ArrayList<Double>();
        ArrayList<Double> heroe_04 = new ArrayList<Double>();

        ArrayList<String> vengador = new ArrayList<String>();  //una array para recoger la lista de heroes
        vengador.add("Iron Man");
        vengador.add("Capitan America");
        vengador.add("Thor");
        vengador.add("Viuda Negra");

        DecimalFormat df = new DecimalFormat("###.##");



        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;

            int opcio_02=0;
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
                        System.out.println("");
                        System.out.println("   EVALUACIONES   ");
                        System.out.println("------------------");
                        for (int i = 0; i < array_01.length; i++) {
                            if (i==0){
                                heroe_01.add(array_01[i][0]*0.03 + array_01[i][1]*0.03 + array_01[i][2]*0.2 + array_01[i][3]*0.1 + array_01[i][4]*0.1);
                            }
                            if (i==1) {
                                heroe_02.add(array_01[i][0]*0.03 + array_01[i][1]*0.03 + array_01[i][2]*0.2 + array_01[i][3]*0.1 + array_01[i][4]*0.01);
                            }
                            if (i==2) {
                                heroe_03.add(array_01[i][0]*0.03 + array_01[i][1]*0.03 + array_01[i][2]*0.2 + array_01[i][3]*0.1 + array_01[i][4]*0.01);
                            }
                            if (i==3) {
                                heroe_04.add(array_01[i][0]*0.03 + array_01[i][1]*0.03 + array_01[i][2]*0.2 + array_01[i][3]*0.1 + array_01[i][4]*0.01);
                            }
                        }
                        System.out.println("Iron Man        = " + df.format((heroe_01.get(0))));
                        System.out.println("Capitan America = " + df.format((heroe_02.get(0))));
                        System.out.println("Thor            = " + df.format((heroe_03.get(0))));
                        System.out.println("Viuda Negra     = " + df.format((heroe_04.get(0))));
                        break;
                    case 3:
                        System.out.println("");
                        System.out.println("   ANALISIS DE MISIONES   ");
                        System.out.println("--------------------------");
                        int valor = 0;
                        System.out.print("Introduzca valoracion : ");
                        valor = Integer.parseInt(buffer.readLine());
                        //comparar valor con los valors de heroes
                        if (heroe_01.get(0)>valor) {
                            System.out.println("Va a participar : Iron Man con " + (heroe_01) + " puntos");
                        }
                        else if (heroe_02.get(0)>valor) {
                            System.out.println("Va a participar : Capitan America con " + (heroe_02) + " puntos");
                        }
                        else if (heroe_03.get(0)>valor) {
                            System.out.println("Va a participar : Thor "                + (heroe_03) + " puntos");
                        }
                        else if ((heroe_01.get(0)+heroe_02.get(0))>valor) {
                            System.out.println("Va a participar : Iron Man con "        + (heroe_01) + " puntos");
                            System.out.println("Va a participar : Capitan America con " + (heroe_02) + " puntos");
                        }
                        else if ((heroe_02.get(0)+heroe_03.get(0))>valor) {
                            System.out.println("Va a participar : Capitan America con " + (heroe_02) + " puntos");
                            System.out.println("Va a participar : Thor "                + (heroe_03) + " puntos");
                        }
                        else if ((heroe_01.get(0)+heroe_03.get(0))>valor) {
                            System.out.println("Va a participar : Iron Man con "        + (heroe_01) + " puntos");
                            System.out.println("Va a participar : Thor "                + (heroe_03) + " puntos");
                        }
                        else if ((heroe_01.get(0)+heroe_02.get(0)+heroe_03.get(0))>valor) {
                            System.out.println("Va a participar : Iron Man con "        + (heroe_01) + " puntos");
                            System.out.println("Va a participar : Capitan America con " + (heroe_02) + " puntos");
                            System.out.println("Va a participar : Thor "                + (heroe_03) + " puntos");
                        }
                        else {
                            System.out.println("Va a participar : Iron Man con "        + (heroe_01) + " puntos");
                            System.out.println("Va a participar : Capitan America con " + (heroe_02) + " puntos");
                            System.out.println("Va a participar : Thor "                + (heroe_03) + " puntos");
                            System.out.println("Va a participar : Viuda Negra "         + (heroe_04) + " puntos");
                            System.out.println("");
                            System.out.println("Es una mision arriesgada, hay que llevar mucho cuidado");
                        } //vengadores en un array y comparar
                        break;
                    case 4:
                        System.out.print("Su nombre ? : ");
                        String vengador_01 = (buffer.readLine());
                        boolean encontrado=false;
                        for (int i=0; i<vengador.size();i++) {
                            if (vengador.get(i).equals(vengador_01)) {
                                encontrado = true;
                            }
                        }
                        if (encontrado==true) {
                            while (opcio_02 != 6) {
                                 System.out.println("");
                                 System.out.println("          REPONER HABILIDADES          ");
                                 System.out.println("---------------------------------------");
                                 System.out.println("");
                                 System.out.println("1.- Mejorar fuerza           ");
                                 System.out.println("2.- Mejorar inteligencia     ");
                                 System.out.println("3.- Mejorar velocidad        ");
                                 System.out.println("4.- Mejorar intuición        ");
                                 System.out.println("5.- Mejorar inmortalidad     ");
                                 System.out.println("6.- Salir ");
                                 System.out.println("");
                                 System.out.print("Seleccione una opcion : ");
                                 opcio_02 = Integer.parseInt(buffer.readLine());

                                 switch (opcio_02) {
                                     case 1:
                                         if (vengador_01.equals("Iron Man")) {
                                           heroe_01.add(0, (heroe_01.get(0) + 1.0));
                                         }
                                         if (vengador_01.equals("Capitan America")) {
                                           heroe_02.add(0, (heroe_02.get(0) + 1.0));
                                         }
                                         if (vengador_01.equals("Thor")) {
                                           heroe_03.add(0, (heroe_03.get(0) + 1.0));
                                         }
                                         if (vengador_01.equals("Viuda Negra")) {
                                           heroe_04.add(0, (heroe_04.get(0) + 1.0));
                                         }
                                         break;
                                     case 2:
                                         break;
                                     case 3:
                                         break;
                                     case 4:
                                         break;
                                     case 5:
                                         break;
                                     case 6:
                                         System.out.println("Abandonando Habilidades");
                                         break;
                                     default:
                                         System.out.println("Opcion incorrecta, seleccione de 1 a 6");
                                    }
                                }
                        }

                        else  {
                           System.out.println("Usted no esta incluido");
                        }

                        break;
                    case 5:
                        System.out.println("");
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