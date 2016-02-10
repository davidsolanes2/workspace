package DAW.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 28/11/15.
 */
public class ex10 {

        public static void main(String[] args) {

            try {

                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Introduzca la primera cadena : ");
                System.out.print(" ");
                String cadenaStr = buffer.readLine();
                cadenaStr = cadenaStr.toLowerCase();

                char[] cadena_01 = cadenaStr.toCharArray();

                System.out.print("Introduzca la segunda cadena a buscar : ");
                System.out.print(" ");
                String cadena_03Str = buffer.readLine();
                cadena_03Str = cadena_03Str.toLowerCase();

                char[] cadena_02 = cadena_03Str.toCharArray();

                int x = 0, y = 0;

                while (x < cadena_02.length && y < cadena_01.length) {   //mientras que no se llega al final de la cadena
                    if (cadena_01[y] == cadena_02[x]) {   //si la posicion de la cadena_01 es igual a la posicion de la cadena_02
                        x++; //avanzamos una posicion
                        y++; //avanzamos una posicion
                    }
                    else { //si las posiciones de las cadenas no son iguales
                        y++; //avanzamos una posicion
                        x = 0; //volvemos al principio de la cadena
                    }

                if (x == cadena_02.length) {  //si el total de x es igual a la longuitud de la cadena
                    System.out.println("La segunda cadena SI esta en la primera cadena");
                    break;
                }

                if (y == cadena_01.length) { //si el total de y es igual a la longuitud de la cadena, significa que no hemos encontrado coincidencias
                    System.out.println("La segunda cadena NO esta en la primera cadena");
                    break;
                }
            }

            }

            catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
    }

/*Escriure un programa en Java que llegeixi per teclat una frase o conjunt de paraules.
Cadascuna de les lletres haurà d’estar emmagatzemada en una posició de l’array. El programa
serà un cercador. Haurà de cercar una paraula que introduirà l’usuari per teclat, i indicar per
pantalla si s’ha trobat aquella paraula o no*/

