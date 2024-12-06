package exemple;

import bandeau.Bandeau;

import java.awt.Font;

public class EffetZoom extends Effet{
    private int pourcentage;

    public EffetZoom(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public void afficher(Bandeau bandeau){
        int size = bandeau.getFont().getSize();
        for (int i = 0; i <= size*pourcentage/100; i += 1) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, size+i));
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
        bandeau.setFont(new Font("Dialog", Font.BOLD, size));
    }
}
