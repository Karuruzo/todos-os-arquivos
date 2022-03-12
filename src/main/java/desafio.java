import java.util.ArrayList;
import java.util.Random;

public class desafio {
    public static void main(String[] args) {
        ArrayList <Integer> windows = new ArrayList<>();
           windows=linux(50);
        System.out.println("lista:");
        for (int it:windows){
            System.out.println(it);
        }
        int b;
        b=ubuntu(windows);
        System.out.println("resultado:");
        System.out.println(b);
        }
    static ArrayList<Integer> linux(int numeros){
        ArrayList <Integer> separador = new ArrayList<>();
        int a;
        Random gerador = new Random();
        for (int i = 0; i <numeros; i++) {
            a= gerador.nextInt(10)+1;
            separador.add(a);
        }
        return separador;
    }
    static int ubuntu(ArrayList <Integer> popOS){
        int a=0;
        for (int it:popOS){
           if (it<5){
               a=a+it;
           }
        }
        return a;


    }



}
