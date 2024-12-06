package exemple;

import bandeau.Bandeau;

public class EffetClignotant extends Effet{

    public void afficher(Bandeau bandeau){
        int blinkInterval = 500;
        String message = bandeau.getMessage();
        bandeau.sleep(blinkInterval);
        bandeau.setMessage("");
        bandeau.sleep(blinkInterval);
        bandeau.setMessage(message);
    }

}
