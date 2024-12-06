package exemple;
import bandeau.Bandeau;

public abstract class Effet {
    public void afficher(Bandeau bandeau) {
        System.out.println(bandeau.toString());
    }
}
