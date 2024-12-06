package exemple;

public class EffetRepeter {
    private int repet;
    private Effet effet;
    private Scenario scenario;

    public EffetRepeter(Scenario scenario, Effet effet, int repet) {
        this.repet = repet;
        this.effet = effet;
        this.scenario = scenario;
    }
}
