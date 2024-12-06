package exemple;

import bandeau.Bandeau;
import java.util.Random;

public class EffetJeuPendu extends Effet{

    public void afficher(Bandeau bandeau){
        String message = bandeau.getMessage();
        String pendu="";
        for(int i =0; i< message.length(); i++){
            pendu= pendu +"_";
        }
        System.out.print(pendu);

        Random random = new Random();
        do{
            System.out.print("\r");

            int j = random.nextInt(message.length());

            if(pendu.charAt(j)=='_'){
                char lettre = message.charAt(j);
                StringBuilder sb = new StringBuilder(pendu);
                sb.setCharAt(j, lettre);
                pendu = sb.toString();
                System.out.print(pendu);
            }
        }while(pendu.contains("_"));
    }
}
