package ARRAY.LIST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by david on 12/01/16.
 */
public class ex02 {
    public static void main(String[] args) {


        ArrayList<String> dias = new ArrayList<String>();
        dias.add("lunes");
        dias.add("martes");
        dias.add("miercoles");
        dias.add("jueves");
        dias.add("viernes");
        dias.add("sabado");
        dias.add("domingo");

        ArrayList<Integer> horas = new ArrayList<Integer>(); //ejericio realizado
        horas.add(0);
        horas.add(0);
        horas.add(0);
        horas.add(0);
        horas.add(0);
        horas.add(0);
        horas.add(0);

        ArrayList<Integer> unid_01 = new ArrayList<Integer>(); //fruta consumida
        unid_01.add(0);
        unid_01.add(0);
        unid_01.add(0);
        unid_01.add(0);
        unid_01.add(0);
        unid_01.add(0);
        unid_01.add(0);

        ArrayList<Integer> unid_02 = new ArrayList<Integer>(); //horas productivas
        unid_02.add(0);
        unid_02.add(0);
        unid_02.add(0);
        unid_02.add(0);
        unid_02.add(0);
        unid_02.add(0);
        unid_02.add(0);

        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio = 0;

            while (opcio != 8) {
                System.out.println("");
                System.out.println("    BUENOS PROPOSITOS     ");
                System.out.println("--------------------------");
                System.out.println("");
                System.out.println("1.- Hacer ejercicio                     ");
                System.out.println("2.- Alimentarse bien                    ");
                System.out.println("3.- Aprovechar el tiempo y trabajar mas ");
                System.out.println("4.- Valorar el ejercicio hecho          ");
                System.out.println("5.- Valorar la alimentacion             ");
                System.out.println("6.- Valorar productividad de cada dia   ");
                System.out.println("7.- Valoracion general                  ");
                System.out.println("8.- Salir                               ");
                System.out.println("");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                switch (opcio) {
                    case 1:
                        for (int i=0; i<7; i++){
                            int num_01 = 0;
                            System.out.print("Minutos de ejercicio que has hecho el " + dias.get(i) + ": ");
                            horas.add(i, Integer.parseInt(buffer.readLine()));
                        }
                        break;
                    case 2:
                        for (int i=0; i<7; i++){
                            System.out.print("Piezas de fruta y verdura que has consumido el " + dias.get(i) + ": ");
                            unid_01.add(i, Integer.parseInt(buffer.readLine()));
                        }
                        break;
                    case 3:
                        for (int i=0; i<7; i++){
                            System.out.print("Horas productivas el " + dias.get(i) + ": ");
                            unid_02.add(i, Integer.parseInt(buffer.readLine()));
                        }
                        break;
                    case 4:
                        int tot_01=0;
                        tot_01 = (horas.get(0)+horas.get(1)+horas.get(2)+horas.get(3)+horas.get(4)+horas.get(5)+horas.get(6));
                        if (tot_01>7 && unid_02.get(0)>45 && unid_02.get(1)>45 && unid_02.get(2)>45 && unid_02.get(3)>45
                                && unid_02.get(4)>45 && unid_02.get(5)>45 && unid_02.get(6)>45) {
                            System.out.print("La valoracion es positiva");
                        }
                        else {
                            System.out.print("La valoracion es negativa");
                        }
                        break;
                    case 5:
                        int tot_02, x=0;
                        String mayor = " ";
                        String menor = " ";
                        float media=0;
                        tot_02 = (unid_01.get(0)+unid_01.get(1)+unid_01.get(2)+unid_01.get(3)+unid_01.get(4)+
                                unid_01.get(5)+unid_01.get(6));
                        media =  tot_02 / 7;

                        for(x=0;x<dias.size();x++) {
                            if(unid_01.get(x)>media) {
                               mayor = dias.get(x);
                            }
                            else if (unid_01.get(x)<media){
                                menor = dias.get(x);
                            }
                        }
                        System.out.println ("La media semanal es de : " + media + " piezas");
                        System.out.println("El dia de MAS consumo es : " + mayor);
                        System.out.println("El dia de MENOS consumo es el : " + menor);
                        break;
                    case 6:
                        for(int y=0;y<horas.size();y++){
                            if(horas.get(y)>=45) {
                                unid_02.add(y,(unid_02.get(y)+2));
                            }
                            else if (unid_01.get(y)>=5) {
                                unid_02.add(y, (unid_02.get(y)+2));
                            }
                            else if (unid_02.get(y)==8) {
                                unid_02.add(y, (unid_02.get(y)+1));
                            }
                            else if (unid_02.get(y)>8) {
                                unid_02.add(y, ((unid_02.get(y)-8)*1));
                            }
                        }
                        break;
                    case 7:
                        int cont_01=0, cont_02=0, cont_03=0;

                        for (int i=0;i<horas.size();i++) {
                            if(horas.get(i)>0) {
                                cont_01++;
                            }
                        }
                        for (int j=0;j<unid_01.get(j);j++) {
                            if (unid_01.get(j)==0) {
                                cont_02++;

                            }
                        }
                        for (int k=0;k<unid_02.get(k);k++) {
                            if (unid_02.get(k)<5) {
                                cont_03++;
                            }
                        }

                        if (cont_01<2 && cont_02==0 || cont_03<5) {
                            System.out.print("LO SENTIMOS, NO LO HAS CONSEGUIDO");
                        }
                        else if ((cont_01<2 || cont_02==0 && cont_03<5)) {
                            System.out.print("LO SENTIMOS, NO LO HAS CONSEGUIDO");
                        }
                        else {
                            System.out.print("ENHORABUENA, LO HAS CONSEGUIDO");
                            System.out.print("COMO RECOMPENSA PUEDES COMER UN TROZO DE CHOCOLATE");
                        }
                        break;
                    case 8:
                        System.out.println("Animo MACHOTE");
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

}
