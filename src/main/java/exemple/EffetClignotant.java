package exemple;

import bandeau.Bandeau;

public class EffetClignotant extends Effet{

    public void afficher(Bandeau bandeau){
        int blinkInterval = 500;
        System.out.println(bandeau.toString());
        bandeau.sleep(blinkInterval);
        System.out.print("\r");
        bandeau.sleep(blinkInterval);
        System.out.print(bandeau.toString());
    }

}
