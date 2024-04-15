import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestTelecommande {

    @Test
    void testAjouterLampeTelecommandeVide() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("nom");
        telecommande.ajouterLampe(lampe);
        assertEquals(1, telecommande.getLampes().size());
        assertTrue(telecommande.getLampes().contains(lampe));
    }

    @Test
    void testAjouterLampeTelecommandeAvec1Element() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("nom");
        Lampe lampe2 = new Lampe("nom");
        telecommande.ajouterLampe(lampe1);
        telecommande.ajouterLampe(lampe2);
        assertEquals(2, telecommande.getLampes().size());
        assertTrue(telecommande.getLampes().contains(lampe1));
        assertTrue(telecommande.getLampes().contains(lampe2));
    }

    @Test
    void testActiverLampeExistantePosition0() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("nom");
        telecommande.ajouterLampe(lampe);
        telecommande.activerLampe(0);
        assertTrue(lampe.isAllume());
    }

    @Test
    void testActiverLampeExistantePosition1() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("nom");
        Lampe lampe2 = new Lampe("nom");
        telecommande.ajouterLampe(lampe1);
        telecommande.ajouterLampe(lampe2);
        telecommande.activerLampe(1);
        assertTrue(lampe2.isAllume());
    }

    @Test
    void testActiverLampeInexistante() {
        Telecommande telecommande = new Telecommande();
        assertThrows(IndexOutOfBoundsException.class, () -> telecommande.activerLampe(0));
    }

    @Test
    void testEteindreLampeExistantePosition0() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe = new Lampe("nom");
        telecommande.ajouterLampe(lampe);
        telecommande.activerLampe(0);
        assertTrue(lampe.isAllume());
        telecommande.eteindreLampe(0);
        assertFalse(lampe.isAllume());
    }

    @Test
    void testEteindreLampeExistantePosition1() {
        Telecommande telecommande = new Telecommande();
        Lampe lampe1 = new Lampe("nom");
        Lampe lampe2 = new Lampe("nom");
        telecommande.ajouterLampe(lampe1);
        telecommande.ajouterLampe(lampe2);
        telecommande.activerLampe(1);
        assertTrue(lampe2.isAllume());
        telecommande.eteindreLampe(1);
        assertFalse(lampe2.isAllume());
    }

    @Test
    void testEteindreLampeInexistante() {
        Telecommande telecommande = new Telecommande();
        assertThrows(IndexOutOfBoundsException.class, () -> telecommande.eteindreLampe(0));
    }
}
