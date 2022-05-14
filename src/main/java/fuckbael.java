import javax.sound.midi.Synthesizer;
import java.awt.*;
import java.net.URI;

public class fuckbael {
    public static void main(String[] args){

        try{
            URI link = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }

}
