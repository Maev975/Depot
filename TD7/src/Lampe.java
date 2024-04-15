class Lampe implements Appareil {
	private String nom;
	private boolean allume;

	public Lampe(String nom) {
		this.nom = nom;
	}

	public void allumer() {
		allume = true;
		System.out.println("La lampe " + nom + " est allumée.");
	}

	public void eteindre() {
		allume = false;
		System.out.println("La lampe " + nom + " est éteinte.");
	}

	public String toString() {
		return "Lampe: " + nom;
	}
}