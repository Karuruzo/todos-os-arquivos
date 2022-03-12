import java.util.ArrayList;
import java.util.Random;

public class testesobrelistas {
    public static void main(String[] args) {
        ArrayList<Integer> listapares = new ArrayList<>();
        ArrayList<Integer> listaimpares = new ArrayList<>();
        ArrayList<Integer> listaM4 = new ArrayList<>();
        int a;
        for (int i=0; i<=100;i++){
            if (i%2==0) listapares.add(i);
            else listaimpares.add(i);
        }
        int soma =0;
        for (int it:listaimpares){
            soma=soma+it;
        }
        for (int it:listapares){
            if (it%4==0) listaM4.add(it);
        }
        System.out.println(listaM4);
        System.out.println(soma);



    }
}
