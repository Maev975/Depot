class Hifi implements Appareil {
	private int son;

	public void allumer() {
		System.out.println("La chaîne Hifi est allumée.");
	}

	public void eteindre() {
		System.out.println("La chaîne Hifi est éteinte.");
	}

	public String toString() {
		return "Chaîne Hifi";
	}
}