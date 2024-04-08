import java.util.ArrayList;
import java.util.List;

class Telecommande {
    private List<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).allumer();
        } else {
            throw new IndexOutOfBoundsException("Lampe inexistante");
        }
    }

    public void desactiverLampe(int indiceLampe) {
        if (indiceLampe >= 0 && indiceLampe < this.lampes.size()) {
            this.lampes.get(indiceLampe).eteindre();
        } else {
            throw new IndexOutOfBoundsException("Lampe inexistante");
        }
    }

    public void activerTout() {
        for (Lampe lampe : this.lampes) {
            lampe.allumer();
        }
    }

    public List<Lampe> getLampes() {
        return this.lampes;
    }
}
