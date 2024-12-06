package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;

public class Scenario {
    private ArrayList<EffetRepeter> effets;

    public Scenario(ArrayList<EffetRepeter> effets){
        this.effets = effets;
    }

    public Scenario(){
        this.effets = new ArrayList<>();
    }

    public void ajoutEffet(Effet effet, int repet){
        effets.add(new EffetRepeter(this, effet, repet));
    }

    public void afficher(Bandeau bandeau){

    }
}
