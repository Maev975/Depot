class Telecommande {
    private ArrayList<Appareil> appareils;

    public Telecommande() {
        appareils = new ArrayList<>();
    }

    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void activerAppareil(int indiceAppareil) {
        Appareil appareil = appareils.get(indiceAppareil);
        appareil.allumer();
    }

    public void desactiverAppareil(int indiceAppareil) {
        Appareil appareil = appareils.get(indiceAppareil);
        appareil.eteindre();
    }

    public void activerTout() {
        for (Appareil appareil : appareils) {
            appareil.allumer();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Télécommande avec les appareils suivants:\n");
        for (Appareil appareil : appareils) {
            sb.append("- ").append(appareil.toString()).append("\n");
        }
        return sb.toString();
    }
}