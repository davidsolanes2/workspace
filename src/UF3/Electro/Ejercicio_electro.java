package UF3.Electro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by david on 3/03/16.
 */
public class Ejercicio_electro {

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        int [][] tarifa_01 = new int[6][2];
        try {
            Metodo_electro Electro_01 = new Metodo_electro(); //ubicacion de las funciones
            Electro Electro_02 = new Electro(); //ubicacion de la clase

            int opcio=0;
            while (opcio != 6) {
                opcio = Metodo_electro.menu();

                switch (opcio) {
                    case 1:
                        System.out.println(" ALTA ");
                        System.out.println("======");
                        System.out.print("Nombre : ");
                        Electro_02.setArticulo(buffer.readLine());
                        System.out.print("Precio : ");
                        Electro_02.setPrecio(Integer.parseInt(buffer.readLine()));
                        System.out.print("Color : ");
                        Electro_02.setColor(buffer.readLine());
                        System.out.print("Consumo : ");
                        Electro_02.setConsumo(buffer.readLine().charAt(0));
                        System.out.print("Peso : ");
                        Electro_02.setPeso(Integer.parseInt(buffer.readLine()));
                        break;
                    case 2:
                        System.out.println(" MODIFICACION ");
                        System.out.println("==============");
                        //pedir nombre
                        System.out.print("Nombre a buscar : ");
                        String nombre_01 = (buffer.readLine());



                        break;
                    case 3:
                        int a=0;
                        System.out.println(" TARIFA ");
                        System.out.println("========");
                        //imprimir el array tarifa_01
                        break;
                    case 4:
                        System.out.println(" LISTA DE ARTICULOS ");
                        System.out.println("====================");
                        break;
                    case 5:
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
