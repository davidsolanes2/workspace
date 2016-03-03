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
            array_aux=crearArray();
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
                        for (int j=0;j<result.length; j++) {
                            result[j]=0;
                        }
                        array_aux=reiniciar(array_aux);
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


    public static int[]crearArray() {                  //autollenado del array con numeros, de los tipos de muerte
        int tipos[] = new int [5];
        for (int i=0; i<tipos.length; i++) {
            tipos[i] = (int)(Math.random()*3);  //Ataque enemigo = 0/A, Caida = 1/B, Bomba = 2/C
        }
        return tipos;
    }

    public static void imprimir (int tipos[]) {
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(tipos[i]);
        }
    }

    public static int[] control(int[]tipos, int result[]) {  //estadistica de muertes
               for (int i=0; i<tipos.length; i++) {
            if(tipos[i]==0) {
                result[0]++;
            }
            else if(tipos[i]==1) {
                result[1]++;
            }
            else if(tipos[i]==2) {
                result[2]++;
            }
        }
        return result;
    }

    public static int[] borrar(int[]tipos) {
        tipos = new int[tipos.length];

        return tipos;
    }

    public static int[] reiniciar( int[] tipos){
        tipos = borrar(tipos);
        tipos = crearArray();

        return tipos;
    }



}
