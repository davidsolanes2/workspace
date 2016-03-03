package UF3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by david on 29/02/16.
 */
public class Metodo_persona {

    public static int menu() throws IOException {        //menu

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int opcio = 0;
        System.out.println("");
        System.out.println("  FICHA DE PERSONAL  ");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("1.- Alta            ");
        System.out.println("2.- Modificacion    ");
        System.out.println("3.- Peso ideal      ");
        System.out.println("4.- Mayor de edad   ");
        System.out.println("5.- Listar Personal ");
        System.out.println("6.- Salir             ");
        System.out.println(" ");
        System.out.println("");
        System.out.print("Seleccione una opcion : ");
        opcio = Integer.parseInt(buffer.readLine());

        return opcio;
    }


}
