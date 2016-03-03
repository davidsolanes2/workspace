package DAW.UF1;

import java.io.*;

/**
 * Created by david on 9/12/15.
 */
public class ex11 {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try {

            int opcio = 0;

            while (opcio != 4) {
                System.out.println("");
                System.out.println("         SALTOS DE LONGITUD         ");
                System.out.println("------------------------------------");
                System.out.println("");
                System.out.println("1.- Inscribir un participante        ");
                System.out.println("2.- Mostrar listado de datos         ");
                System.out.println("3.- Mostrar listado por marcas       ");
                System.out.println("4.- Finalizar el programa            ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Cerrando el proceso");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 3");
                    }
                }

            }
            catch (Exception e) {
            System.out.println("error: " + e);
        }
        }
}



