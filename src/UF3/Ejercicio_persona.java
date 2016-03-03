package UF3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 29/02/16.
 */
public class Ejercicio_persona {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        try {
            Metodo_persona Persona_01 = new Metodo_persona(); //ubicacion de las funciones
            Persona Persona_02 = new Persona(); //ubicacion de la clase

        int opcio=0;
            while (opcio != 6) {
                opcio = Metodo_persona.menu();

                switch (opcio) {
                    case 1:
                        System.out.println(" ALTA ");
                        System.out.println("======");
                        System.out.print("Nombre : ");
                        Persona_02.setNombre(buffer.readLine());
                        System.out.print("Edad : ");
                        Persona_02.setEdad(Integer.parseInt(buffer.readLine()));
                        System.out.print("Sexo : ");
                        Persona_02.setSexo(buffer.readLine().charAt(0));
                        System.out.print("Peso : ");
                        Persona_02.setPeso(Double.parseDouble(buffer.readLine()));
                        System.out.print("Altura : ");
                        Persona_02.setAltura(Double.parseDouble(buffer.readLine()));
                        break;
                    case 2:
                        System.out.println(" MODIFICACION ");
                        System.out.println("==============");

                        break;
                    case 3:
                        System.out.println(" PESO IDEAL ");
                        System.out.println("=============");

                        break;
                    case 4:
                        System.out.println(" MAYOR DE EDAD ");
                        System.out.println("===============");

                        break;
                    case 5:
                        System.out.println(" LISTAR PERSONAL ");
                        System.out.println("=================");

                        break;
                    case 6:
                        System.out.println("Cerrando el sistema");
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
