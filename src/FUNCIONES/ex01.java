package FUNCIONES;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by david on 8/02/16.
 */
public class ex01 {
    //Calculadora
    public static void main(String[] args) {

        //int [][] array_01 = new int[4][5];

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;

            while (opcio != 8) {
                System.out.println("");
                System.out.println("          CALCULADORA         ");
                System.out.println("------------------------------");
                System.out.println("");
                System.out.println("1.- Suma              ");
                System.out.println("2.- Resta             ");
                System.out.println("3.- Multiplicacion    ");
                System.out.println("4.- Division          ");
                System.out.println("5.- Modulo            ");
                System.out.println("6.- Divisores         ");
                System.out.println("7.- Factorial         ");
                System.out.println("8.- Salir             ");
                System.out.println(" ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                int num_01=0, num_02=0;
                int tot_01=0;
                switch (opcio) {
                    case 1:
                        System.out.println("SUMA DE NUMEROS  ");
                        System.out.println("=================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());
                        System.out.print("Segundo : ");
                        num_02 = Integer.parseInt(buffer.readLine());

                        tot_01 = suma( num_01, num_02);

                        System.out.print("EL TOTAL ES   : " + tot_01);
                        break;
                    case 2:
                        System.out.println("RESTA DE NUMEROS  ");
                        System.out.println("=================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());
                        System.out.print("Segundo : ");
                        num_02 = Integer.parseInt(buffer.readLine());

                        tot_01 = resta( num_01, num_02);

                        System.out.print("EL TOTAL ES   : " + tot_01);
                        break;
                    case 3:
                        System.out.println("  MULTIPLICACION DE NUMEROS  ");
                        System.out.println("=============================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());
                        System.out.print("Segundo : ");
                        num_02 = Integer.parseInt(buffer.readLine());

                        tot_01 = mult( num_01, num_02);

                        System.out.print("EL TOTAL ES   : " + tot_01);
                        break;
                    case 4:
                        System.out.println("  DIVISION DE NUMEROS  ");
                        System.out.println("=======================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());
                        System.out.print("Segundo : ");
                        num_02 = Integer.parseInt(buffer.readLine());

                        tot_01 = div( num_01, num_02);

                        System.out.print("EL TOTAL ES   : " + tot_01);
                        break;
                    case 5:
                        System.out.println("  MODULO DE DOS NUMEROS  ");
                        System.out.println("==========================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());
                        System.out.print("Segundo : ");
                        num_02 = Integer.parseInt(buffer.readLine());

                        tot_01 = mod( num_01, num_02);

                        System.out.print("EL TOTAL ES   : " + tot_01);
                        break;
                    case 6:
                        System.out.println("  DIVISORES DE UN NUMERO  ");
                        System.out.println("============================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());  //hacer metodo de entrada de datos
                        ArrayList<Integer> divisor = new ArrayList<Integer>();
                        divisor=divisor_01( num_01);
                        System.out.println("Los divisores de " + num_01 + " son " + divisor);
                        break;
                    case 7:
                        System.out.println("  FACTORIAL DE UN NUMERO   ");
                        System.out.println("===========================");
                        System.out.print("Primero : ");
                        num_01 = Integer.parseInt(buffer.readLine());
                        factor(num_01);
                        System.out.println("El factorial de " + num_01 + " es " + num_01);
                        break;
                    case 8:
                        System.out.println("Cerrando el sistema");
                        break;
                    default:
                        System.out.println("Opcion incorrecta, seleccione de 1 a 7");
                }
            }

        }
        catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    public static int suma (int x, int y) {
        int z;
        z=x+y;
        return z;
    }
    public static int resta (int x, int y) {
        int z;
        z = x - y;
        return z;
    }
    public static int mult (int x, int y){
        int z;
        z = x * y;
        return z;
    }
    public static int div (int x, int y){
        int z;
        z = x / y;
        return z;
    }
    public static int mod (int x, int y){
        int z;
        z = x % y;
        return z;
    }
    public static ArrayList<Integer> divisor_01 (int x) {
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        for (int i=1; i<=x; i++){
            if (x%i==0){
                divisor.add(i);
            }
        }
        return divisor;
    }
    public static int factor (int x){
        int fact = 1;
        for (int i=1; i<=x; x++) {
            fact = fact * i;
        }
        return fact;
    }
}
