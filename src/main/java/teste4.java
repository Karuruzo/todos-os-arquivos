import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class teste4 {
    public static void main(String[] args) {

        ArrayList<String> dark=new ArrayList<String>();
        String stri=null;
        try {
            Scanner scan=new Scanner(System.in);
            while (scan.hasNextLine()){
                stri=scan.nextLine();
                String divisao[]=stri.split(" ");
                for (int i=0; i<divisao.length; i++){
                    dark.add(divisao[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String it: dark){
            System.out.println(it);

        }
        JOptionPane.showMessageDialog(null,stri);


    }

}
