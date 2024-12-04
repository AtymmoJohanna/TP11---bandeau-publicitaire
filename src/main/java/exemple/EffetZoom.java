package exemple;

import bandeau.Bandeau;

import java.awt.Color;
import java.awt.Font;

public class EffetZoom {
    private int pourcentage;

    public EffetZoom(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public void afficher(Bandeau bandeau){
        int size = bandeau.getFont().getSize();
        for (int i = 0; i <= pourcentage/100; i += i) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, size+i));
            bandeau.sleep(100);
        }
    }
}
