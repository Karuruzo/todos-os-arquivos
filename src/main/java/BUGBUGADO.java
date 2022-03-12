import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BUGBUGADO {
    public static void main(String[] args) {
        Random gerador = new Random();
        ArrayList <Integer> separador = new ArrayList<>();
        int a;
        for (int i = 0; i <50; i++) {
            a=gerador.nextInt(1000)+1;
            System.out.println(a);
            separador.add(a);

        }
        Collections.sort(separador);
        System.out.println("lista:");
        for (int it:separador){
            System.out.println(it);
        }


    }
//        int i;
//        int[] roblox= new int[10];
//        for (i=0; i<10; i++){
//            int a=minecraft();
//            roblox[i]=minecraft();
//        }
//        System.out.println(roblox[4]);
//
//
//    }
//    static int minecraft(){
//        int aux;
//        Random oto = new Random();
//        aux = oto.nextInt(100)+1;
//        return aux;
//
    }


