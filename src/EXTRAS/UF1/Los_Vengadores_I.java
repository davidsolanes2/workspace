package EXTRAS.UF1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 4/01/16.
 */

public class Los_Vengadores_I {



    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        heroes heroes_01 = new heroes();

        try {

            int opcio = 0;

            while (opcio != 6) {
                System.out.println("");
                System.out.println("          LOS VENGADORES I ");
                System.out.println("-----------------------------------------");
                System.out.println("");
                System.out.println("1.- ");
                System.out.println("2.- ");
                System.out.println("3.- ");
                System.out.println("4.- ");
                System.out.println("5.- ");
                System.out.println(" ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("  ALTA  ");
                        System.out.println("--------");
                        System.out.print("Nombre : ");
                        heroes_01.setNombre(buffer.readLine());
                        System.out.print("Habilidad : ");
                        heroes_01.setHabilidad(buffer.readLine());
                        System.out.print("Nivel : ");
                        heroes_01.setNivel(Integer.parseInt(buffer.readLine()));
                        System.out.print("Amigo de ? : ");
                        heroes_01.setAmigo(buffer.readLine());
                        break;
                    case 2:
                        System.out.println("  RELACION  ");
                        System.out.println("------------");
                        break;
                    case 3:
                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:
                        System.out.println("El mundo sigue a salvo con nosostros, aunque seamos menos");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 6");
                }
            }

        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}
