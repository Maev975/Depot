import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TelecommandeTest {

    @Test
    void testAjouterLampeTelecommandeVide() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("nom");
        telecommande.ajouterLampe(lampe);
        assertEquals(1, telecommande.getLampes().size());
        assertEquals(true, telecommande.getLampes().contains(lampe));
    }

    @Test
    void testAjouterLampeTelecommandeAvec1Element() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("nom");
        Lampe lampe2 = new Lampe("nom");
        telecommande.ajouterLampe(lampe1);
        telecommande.ajouterLampe(lampe2);
        assertEquals(2, telecommande.getLampes().size());
        assertEquals(true, telecommande.getLampes().contains(lampe1));
        assertEquals(true, telecommande.getLampes().contains(lampe2));
    }

    @Test
    void testActiverLampeExistantePosition0() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("nom");
        telecommande.ajouterLampe(lampe);
        telecommande.activerLampe(0);
        assertEquals(true, lampe.isAllume());
    }

    @Test
    void testActiverLampeExistantePosition1() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("nom");
        Lampe lampe2 = new Lampe("nom");
        telecommande.ajouterLampe(lampe1);
        telecommande.ajouterLampe(lampe2);
        telecommande.activerLampe(1);
        assertEquals(true, lampe2.isAllume());
    }

    @Test
    void testActiverLampeInexistante() {
        Telecommande telecommande = new Telecommande();
        assertThrows(IndexOutOfBoundsException.class, () -> telecommande.activerLampe(0));
    }
}