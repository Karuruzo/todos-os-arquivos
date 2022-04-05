import java.util.Scanner;

public class cavalo {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
        String e;
        System.out.println("quantos cavalos você tem?");
        b= multi.nextInt();
        System.out.println("você precisara desse tanto de ferraduras");
        a=4*b;
        System.out.println(a);



        a=0.12;
        b=1.50;
        System.out.println("quantos pães você vendeu?");
        c= multi.nextInt();
        System.out.println("você lucrou "+a*c);
        System.out.println("quantas broas você vendeu?");
        c= multi.nextInt();
        System.out.println("você lucrou "+b*c);
        System.out.println("no total você vendeu:");
        d= a*c+b*c;
        System.out.println(d);
        System.out.println("você deve separar isso para sua poupança");
        System.out.println(d/10);


        a=365;
        System.out.println("qual o seu nome?");
        e= multi.next();
        System.out.println("qual a sua idade");
        c= multi.nextInt();
        d=a*c;
        System.out.println(e+ " você viveu " +d+ " dias ");








    }
}

