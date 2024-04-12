import java.util.ArrayList;
import java.util.List;

class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> chainesHifi;

    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.chainesHifi = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        lampes.add(lampe);
    }

    public void ajouterChaineHifi(Hifi chaineHifi) {
        chainesHifi.add(chaineHifi);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            Lampe lampe = lampes.get(indiceLampe);
            lampe.allumer();
        } else {
            throw new IndexOutOfBoundsException("Indice de lampe invalide");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < lampes.size()) {
            Lampe lampe = lampes.get(indiceLampe);
            lampe.eteindre();
        } else {
            throw new IndexOutOfBoundsException("Indice de lampe invalide");
        }
    }

    public void activerChaineHifi(int indiceChaineHifi) {
        if (indiceChaineHifi >= 0 && indiceChaineHifi < chainesHifi.size()) {
            Hifi chaineHifi = chainesHifi.get(indiceChaineHifi);
            chaineHifi.allumer();
        } else {
            throw new IndexOutOfBoundsException("Indice de chaîne Hi-Fi invalide");
        }
    }

    public void desactiverChaineHifi(int indiceChaineHifi) {
        if (indiceChaineHifi >= 0 && indiceChaineHifi < chainesHifi.size()) {
            Hifi chaineHifi = chainesHifi.get(indiceChaineHifi);
            chaineHifi.eteindre();
        } else {
            throw new IndexOutOfBoundsException("Indice de chaîne Hi-Fi invalide");
        }
    }

    public void activerTout() {
        for (Lampe lampe : lampes) {
            lampe.allumer();
        }
        for (Hifi chaineHifi : chainesHifi) {
            chaineHifi.allumer();
        }
    }
}
