package exemple;

import bandeau.Bandeau;

public class EffetTeletype extends Effet{
    public void afficher(Bandeau bandeau){
        String message = bandeau.getMessage();
        for(char i : message.toCharArray()){
            System.out.print(i);
        }
    }
}
