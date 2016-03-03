package ARRAY.LIST;

import java.util.ArrayList;

/**
 * Created by david on 11/01/16.
 */
public class ex01 {

    public static void main (String[] args) {
        ArrayList david_01 = new ArrayList();

        david_01.add(1);
        david_01.add("david");
        david_01.add(1.25);
        david_01.add("solanes");
        david_01.add(8);
        david_01.add("pepe");
        david_01.add(15.25);
        david_01.add("sancho");
        david_01.add(108);
        david_01.add(1008);

        ArrayList<Integer> david_02 = new ArrayList<Integer>();
        david_02.add(10);
        david_02.add(20);
        david_02.add(30);
        david_02.add(40);
        david_02.add(5);
        david_02.add(60);
        david_02.add(70);
        david_02.add(80);
        david_02.add(90);
        david_02.add(100);
        david_02.add(110);
        david_02.add(120);
        david_02.add(130);
        david_02.add(140);
        david_02.add(150);

        ArrayList<String> david_03 = new ArrayList<String>();
        david_03.add("azul");
        david_03.add("rojo");
        david_03.add("amarillo");
        david_03.add("verde");
        david_03.add("naranja");
        david_03.add("hola");
        david_03.add("blanco");
        david_03.add("negro");

        System.out.println(david_01);
        System.out.println(david_02);
        System.out.println(david_03);

        david_01.remove(0);

        System.out.println(david_01);

        david_01.add(0, "Stucom");

        System.out.println(david_01);

        System.out.println(david_01.get(2));

        System.out.println("La mida es de " + david_01.size() + ", " + david_02.size() + ", " + david_03.size());

        int total = 0;
        total = (david_02.get(0)+david_02.get(1)+david_02.get(2));

        System.out.println("La suma de les tres es : " + total);

        //david_02.add(50, 10000);

        int posicion = 0;
        posicion = david_03.indexOf("hola");
        System.out.println(posicion);

        int posicion_01 = 0;
        posicion_01 = david_02.indexOf(5);
        System.out.println("Esta en la posicion : " + posicion_01);

        david_01.clear();
        System.out.print(david_01);

    }
}
