package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class EffetRotate {
    private int angle;

    public EffetRotate(int angle){
        this.angle = angle;
    }

    public void afficher(Bandeau bandeau){
        bandeau.setRotation(Math.PI * angle / 180);
        bandeau.sleep(1000);
        bandeau.setRotation(0.0f);
    }

}
