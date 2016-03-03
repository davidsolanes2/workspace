package DAW.UF2.FUNCIONES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by david on 16/02/16.
 */
public class BatallaNaval {

    private static String[][] tablero = new String[10][10];
    private static String[][] posicion = new String[12][12];
    private static String tipoFlota=" ";
    private static int ejeX=0;
    private static int ejeY=0;
    private static int orient=0;


    public static void main (String[] args) throws IOException {

        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        int menu=0;

        iniciar(tablero, posicion);




    }

    public static void iniciar(String[][] tablero, String[][]posicion) {  //definicion del tablero inicial con la posicion de los barcos
        int flota = 5;
        boolean guardar = false, validar = false, random = false;

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                tablero[x][y] = "*";
            }
        }

        for (int x = 0; x < 12; x++) {          //dibujando cuadro
            for (int y = 0; y < 12; y++) {
                if ((x == 0 || x == 11) || (y == 0 || y == 11)) {
                    posicion[x][y] = "|";
                } else {
                    posicion[x][y] = "#";
                }
            }
        }

        while (flota > 1) {    //generamos los barcos de la flota
            if (flota == 5) {
                tipoFlota = "5";
            }
            if (flota == 4) {
                tipoFlota = "4";
            }
            if (flota == 3) {
                tipoFlota = "3";
            }
            if (flota == 2) {
                tipoFlota = "2";
            }
            guardar = false;
            while (guardar != true) {
                validar = false;
                random = false;
                int cont_01 = 0;
                while (random != true && validar != true) {
                    ejeX = ((int) Math.floor(Math.random() * 10)) + 1;  //posicion horizontal
                    ejeY = ((int) Math.floor(Math.random() * 10)) + 1; //posicion vertical
                    orient = (int) Math.floor(Math.random() * 2);

                    if ((orient == 0 && (ejeX + flota) < 11) || (orient == 1 && (ejeY + flota) < 11)) {
                        random = true;
                    }
                    if (orient == 0 && random == true) {
                        cont_01 = 0;
                        for (int i = (ejeX - 1); i < (ejeX + flota + 1); i++) {
                            for (int j = (ejeY - 1); j < (ejeY + 2); j++) {
                                if (posicion[i][j] == "=" || posicion[i][j] == "#") {
                                    cont_01++;
                                }
                            }
                        }
                        if (cont_01 == ((flota + 2) * 3)) {
                            validar = true;
                        }
                    }
                }

                if (validar == true) {
                    for (int i=0; i<flota; i++) {
                        posicion[ejeX][ejeY]=tipoFlota;
                        if (orient==0) {
                            ejeX++;
                        }
                        if (orient==1) {
                            ejeY++;
                        }
                    }
                    guardar=true;
                }
            }
            flota--;
        }

    }



}
