public class ChemineeAdapter implements Appareil {
    private Cheminee cheminee;

    public ChemineeAdapter(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    @Override
    public void allumer() {
        int nouvelleIntensite = cheminee.getLumiere() + 10;
        cheminee.changerIntensite(nouvelleIntensite);
    }

    @Override
    public void eteindre() {
        cheminee.changerIntensite(0);
    }
}