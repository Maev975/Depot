class Television implements Appareil {
    private int son;

    public void allumer() {
        System.out.println("La télévision est allumée.");
    }

    public void eteindre() {
        System.out.println("La télévision est éteinte.");
    }

    public String toString() {
        return "Télévision";
    }
}