import javax.swing.*;

public class equaçao2grau {
    public static void main(String[] args) {
        double a,b,c,delta,x1,x2;
        a=2;
        b=-5;
        c=6;

        delta=(Math.pow(b,2))-(4*a*c);
        x1=(-b+(Math.sqrt(delta)))/(2*a);
        x2=(-b-(Math.sqrt(delta)))/(2*a);

        System.out.println(x1);
        System.out.println(x2);

    }
}
