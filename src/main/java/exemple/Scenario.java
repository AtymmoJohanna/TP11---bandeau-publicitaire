package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;

public class Scenario {
    private ArrayList<EffetRepeter> effets;

    public Scenario(){
        this.effets = new ArrayList<>();
    }

    public void ajoutEffet(Effet effet, int repet){
        effets.add(new EffetRepeter(this, effet, repet));
    }

    public void afficher(Bandeau bandeau){
        for(EffetRepeter effetRepeter: effets){
            bandeau.sleep(1000);
            Effet effet = effetRepeter.getEffet();
            for(int i=0; i<effetRepeter.getRepet(); i++){
                effet.afficher(bandeau);
                bandeau.sleep(500);
            }
            
        }
    }
}
