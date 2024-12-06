package exemple;

import bandeau.Bandeau;

public class EffetTeletype extends Effet{
    public void afficher(Bandeau bandeau){
        String message = bandeau.getMessage();
        bandeau.setMessage("");
        for(char i : message.toCharArray()){
            bandeau.setMessage(bandeau.getMessage()+i);
            bandeau.sleep(100);
        }
    }
}
