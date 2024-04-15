public class Main {
	public static void main(String[] args) {
		Lampe lampe1 = new Lampe("Salon");
		Lampe lampe2 = new Lampe("Chambre");
		Hifi hifi = new Hifi();
		Television television = new Television();

		Telecommande telecommande = new Telecommande();
		telecommande.ajouterAppareil(lampe1);
		telecommande.ajouterAppareil(lampe2);
		telecommande.ajouterAppareil(hifi);
		telecommande.ajouterAppareil(television);

		System.out.println(telecommande);
		telecommande.activerTout();
		telecommande.desactiverAppareil(2);
	}
}