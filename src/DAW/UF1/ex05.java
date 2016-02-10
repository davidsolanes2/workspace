package DAW.UF1;

import java.io.*;

public class ex05 {

    public static void main(String[] args) {


        int x = 0, cont_01 = 0;


        try{

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca el numero : ");
            System.out.print("");

            int[] tabla_01 = new int[10];

            for(x=0;x<tabla_01.length;x++) {
                String numStr = buffer.readLine();
                tabla_01[x] = Integer.parseInt(numStr);

                if (x != 0) {
                    if (tabla_01[x] > 0 && tabla_01[x - 1] < 0 ||
                            tabla_01[x] < 0 && tabla_01[x - 1] > 0 && x < tabla_01.length) {
                        cont_01++;
                    }
                    else if (tabla_01[x] < 0 && tabla_01[x-1] == 0 ||
                            tabla_01[x] == 0 && tabla_01[x-1] < 0 && x < tabla_01.length) {
                        cont_01++;
                    }
                }
            }

            System.out.println("Hay " + (cont_01) + " cambios de signo");
        }

        catch (Exception e){
            System.out.println("error: " + e);
        }
    }
}

/*Escriure un programa en Java que llegeixi de teclat 10 nombres enters, els quals haureu
d’emmagatzemar en un array. El programa haurà de comptar el nombre de canvis de signe
que hi ha. Un canvi de signe és l’aparició de dos enters de signes diferents, separats com a
màxim per zeros.*/