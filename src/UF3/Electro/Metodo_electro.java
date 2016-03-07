package UF3.Electro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by david on 3/03/16.
 */
public class Metodo_electro {

    public static int menu() throws IOException {        //menu

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int opcio = 0;
        System.out.println("");
        System.out.println("  FICHA DE ARTICULOS ");
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("1.- Alta                ");
        System.out.println("2.- Modificacion        ");
        System.out.println("3.- Tarifa              ");
        System.out.println("4.- Lista de Articulos  ");
        System.out.println("5.- Salir               ");
        System.out.println(" ");
        System.out.println("");
        System.out.print("Seleccione una opcion : ");
        opcio = Integer.parseInt(buffer.readLine());

        return opcio;
    }

}
