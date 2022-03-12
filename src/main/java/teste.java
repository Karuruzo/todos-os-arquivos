import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {


        String g= "hello";
        String h= " world";
        String resultado = g+h;
        System.out.println(resultado);

        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int a,b;

        int result =1;
        int acertos = 0;
        while (result !=0){

            a = aleatorio.nextInt(9) + 1;
            b = aleatorio.nextInt(9) + 1;
            System.out.println(a + "x" + b + "=");
            result = entrada.nextInt();
            if (result == a*b){
                System.out.println("acertou ");
                acertos++;
                System.out.println("pontuação=" + acertos);

            }
            else {
                System.out.println("errou, pontuação zerada");
                acertos=0;


            }
        }

    }
}
